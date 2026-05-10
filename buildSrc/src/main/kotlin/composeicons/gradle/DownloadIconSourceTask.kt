package composeicons.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.TaskAction
import org.gradle.process.ExecOperations
import javax.inject.Inject

abstract class DownloadIconSourceTask : DefaultTask() {
    @get:Input
    abstract val repoUrl: Property<String>
    
    @get:Input
    abstract val tagName: Property<String>

    @get:Internal
    abstract val targetDir: DirectoryProperty

    @get:Inject
    protected abstract val execOps: ExecOperations

    @TaskAction
    fun execute() {
        val dir = targetDir.asFile.get()
        if (dir.resolve(".git").exists()) {
            logger.lifecycle("Skipping download: ${dir.name} already exists")
            return
        }
        dir.parentFile.mkdirs()
        val cmd = mutableListOf("git", "clone", "--depth=1")
        val tag = tagName.orNull
        if (!tag.isNullOrEmpty()) {
            cmd.addAll(listOf("--branch", tag))
        }
        cmd.addAll(listOf(repoUrl.get(), dir.absolutePath))
        execOps.exec { commandLine(cmd) }
    }
}
