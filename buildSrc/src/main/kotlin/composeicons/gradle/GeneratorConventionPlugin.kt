package composeicons.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.ApplicationPlugin
import org.gradle.api.plugins.JavaApplication
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property

/**
 * Extension for configuring generator tasks.
 * Properties use [Property] for lazy evaluation (supports providers).
 */
abstract class GeneratorConfigExtension {
    /** Git repository URL. */
    abstract val repoUrl: Property<String>
    /** Git tag or branch name. */
    abstract val tagName: Property<String>
    /** Sparse checkout paths (optional). */
    abstract val sparsePaths: ListProperty<String>

    /** Upstream directory name under upstream/ (defaults to project.name). */
    abstract val upstreamDir: Property<String>
    /** Source root relative to upstreamDir (defaults to "" meaning the upstreamDir itself). */
    abstract val sourceRootSubdir: Property<String>
    /** Report file name without extension (defaults to project.name). */
    abstract val reportName: Property<String>
}

/**
 * Convention Plugin：自动配置 generator 子模块。
 *
 * 每个 generator 模块的 build.gradle.kts 只需：
 * ```
 * plugins { id("compose-icons-generator") }
 *
 * generator {
 *     repoUrl.set("https://github.com/org/repo.git")
 *     tagName.set("v1.0.0")
 *     // 可选：
 *     upstreamDir.set("custom-upstream-name")   // 默认 = project.name
 *     sourceRootSubdir.set("icons")             // 默认 = ""（使用 upstreamDir 本身）
 *     reportName.set("custom-report-name")      // 默认 = project.name
 * }
 * ```
 *
 * 自动完成：
 * - 应用 kotlin-jvm + application 插件
 * - 设置 Java toolchain 为 21
 * - 添加 :generator:core 和 kotlin-test 依赖
 * - 注册 downloadIcons 和 generateIcons 任务
 */
class GeneratorConventionPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val moduleName = project.name

        // 基础插件
        project.pluginManager.apply("org.jetbrains.kotlin.jvm")
        project.pluginManager.apply(ApplicationPlugin::class.java)

        // Java toolchain
        project.extensions.getByType(JavaPluginExtension::class.java)
            .toolchain.languageVersion.set(
                org.gradle.jvm.toolchain.JavaLanguageVersion.of(21)
            )

        // mainClass
        project.extensions.getByType(JavaApplication::class.java)
            .mainClass.set("composeicons.generator.$moduleName.MainKt")

        // 公共依赖
        project.dependencies.add("implementation", project.project(":generator:core"))
        project.dependencies.add("testImplementation", "org.jetbrains.kotlin:kotlin-test")

        // Extension for generator configuration
        val config = project.extensions.create(
            "generator", GeneratorConfigExtension::class.java
        )

        // Defaults
        config.upstreamDir.convention(moduleName)
        config.sourceRootSubdir.convention("")
        config.reportName.convention(moduleName)

        // svg2compose binary path
        val isWindows = System.getProperty("os.name").lowercase().contains("win")
        val ext = if (isWindows) ".exe" else ""
        val svg2ComposeBinaryFile = project.rootProject.layout.projectDirectory.file("tools/bin/svg2compose$ext")

        // Register downloadIcons
        val downloadIcons = project.tasks.register("downloadIcons", DownloadIconSourceTask::class.java) {
            group = "compose icons"
            description = "Download SVG sources for $moduleName."
            repoUrl.set(config.repoUrl)
            tagName.set(config.tagName)
            targetDir.set(
                config.upstreamDir.map { dir ->
                    project.rootProject.layout.projectDirectory.dir("upstream/$dir")
                }
            )
            config.sparsePaths.orNull?.let { paths -> sparsePaths.set(paths) }
        }

        // Register generateIcons
        project.tasks.register("generateIcons", GenerateIconsTask::class.java) {
            group = "compose icons"
            description = "Generate Compose icons from $moduleName SVG sources."
            dependsOn(":tools:resolveSvg2Compose", "classes", downloadIcons)

            mainClass.set("composeicons.generator.$moduleName.MainKt")
            generatorClasspath.from(project.sourceSets.getByName("main").runtimeClasspath)
            workingDir.set(project.rootProject.projectDir)
            svg2ComposeBinary.set(svg2ComposeBinaryFile)

            // Derive paths from extension config
            args.set(
                config.upstreamDir.map { dir ->
                    val svgSource = project.rootProject.layout.projectDirectory.dir("upstream/$dir")
                    listOf(project.rootProject.projectDir.absolutePath, svgSource.asFile.absolutePath)
                }
            )
            sourceRootDir.set(
                project.providers.zip(config.upstreamDir, config.sourceRootSubdir) { dir, subdir ->
                    val base = project.rootProject.layout.projectDirectory.dir("upstream/$dir")
                    if (subdir.isEmpty()) base else base.dir(subdir)
                }
            )
            outputDir.set(
                project.rootProject.layout.projectDirectory.dir(
                    "icons-$moduleName/src/generated/kotlin/composeicons/$moduleName"
                )
            )
            reportFile.set(
                config.reportName.map { name ->
                    project.rootProject.layout.projectDirectory.file("web-preview/public/data/$name.json")
                }
            )
        }
    }

    private val Project.sourceSets
        get() = extensions.getByType(JavaPluginExtension::class.java).sourceSets
}
