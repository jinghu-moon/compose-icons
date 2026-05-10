package composeicons.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.ApplicationPlugin
import org.gradle.api.plugins.JavaApplication
import org.gradle.api.plugins.JavaPluginExtension

/**
 * Convention Plugin：自动配置 generator 子模块。
 *
 * 每个 generator 模块的 build.gradle.kts 只需：
 * ```
 * plugins { id("compose-icons-generator") }
 * ```
 *
 * 自动完成：
 * - 应用 kotlin-jvm + application 插件
 * - 设置 Java toolchain 为 21
 * - 根据 project.name 推断 mainClass
 * - 添加 :generator:core 依赖
 */
class GeneratorConventionPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        // 应用基础插件
        project.pluginManager.apply("org.jetbrains.kotlin.jvm")
        project.pluginManager.apply(ApplicationPlugin::class.java)

        // 设置 Java toolchain（通过 JavaPluginExtension，无需 kotlin-gradle-plugin 依赖）
        project.extensions.getByType(JavaPluginExtension::class.java)
            .toolchain.languageVersion.set(
                org.gradle.jvm.toolchain.JavaLanguageVersion.of(21)
            )

        // 根据模块名自动设置 mainClass
        project.extensions.getByType(JavaApplication::class.java)
            .mainClass.set("composeicons.generator.${project.name}.MainKt")

        // 添加对 generator:core 的依赖
        project.dependencies.add("implementation", project.project(":generator:core"))

        // 测试依赖（testImplementation 不传递，需显式声明）
        project.dependencies.add("testImplementation", "org.jetbrains.kotlin:kotlin-test")
    }
}
