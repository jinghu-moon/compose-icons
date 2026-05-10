package composeicons.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Classpath
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import javax.inject.Inject

/**
 * Cacheable Gradle task that wraps the compose-icons GeneratorEngine.
 *
 * Delegates to a generator module's Main class via [ExecOperations],
 * keeping all business logic in the generator modules untouched.
 *
 * Output directories are under `src/generated/kotlin/` — physically separated
 * from hand-written container files in `src/main/kotlin/`. This gives Gradle
 * exclusive ownership of the output path, enabling full build-cache support.
 *
 * Incremental behaviour at per-icon granularity is provided by the
 * application-level MD5 hash comparison inside GeneratorEngine.
 *
 * Compatible with both build cache and configuration cache.
 */
@CacheableTask
abstract class GenerateIconsTask @Inject constructor() : DefaultTask() {

    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val sourceRootDir: DirectoryProperty
    
    /** Generator module runtime classpath (Main.kt + GeneratorEngine + deps). */
    @get:Classpath
    abstract val generatorClasspath: ConfigurableFileCollection

    /** Fully qualified main class (e.g. "composeicons.generator.tabler.MainKt"). */
    @get:Input
    abstract val mainClass: Property<String>

    /** CLI arguments passed to the Main class. */
    @get:Input
    abstract val args: ListProperty<String>

    /** Process working directory — constant per project, not part of cache key. */
    @get:Internal
    abstract val workingDir: DirectoryProperty

    /** Path to the svg2compose Rust binary — tracked via task dependency. */
    @get:Internal
    abstract val svg2ComposeBinary: RegularFileProperty

    /** Generated Kotlin source output directory (under src/generated/kotlin/). */
    @get:OutputDirectory
    abstract val outputDir: DirectoryProperty

    /** Generation report output file. */
    @get:OutputFile
    abstract val reportFile: RegularFileProperty

    @get:Inject
    protected abstract val execOperations: org.gradle.process.ExecOperations

    @TaskAction
    fun execute() {
        execOperations.javaexec {
            classpath = this@GenerateIconsTask.generatorClasspath
            mainClass.set(this@GenerateIconsTask.mainClass)
            workingDir = this@GenerateIconsTask.workingDir.asFile.get()
            args = this@GenerateIconsTask.args.get()
        }
    }
}
