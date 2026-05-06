package composeicons.generator.core

import java.io.File

data class GeneratorConfig(
    val sourceRootDir: File,
    val outputDir: File,
    val reportDir: File,
) {
    companion object {
        fun create(projectRoot: File, libName: String, referPath: String): GeneratorConfig {
            return GeneratorConfig(
                sourceRootDir = projectRoot.resolve(referPath),
                outputDir = projectRoot.resolve("icons-$libName/src/main/kotlin/composeicons/$libName"),
                reportDir = projectRoot.resolve("web-preview/public/data"),
            )
        }
    }
}
