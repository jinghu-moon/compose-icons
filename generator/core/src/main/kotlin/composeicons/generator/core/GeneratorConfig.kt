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
                outputDir = projectRoot.resolve("icons-$libName/src/commonMain/kotlin"),
                reportDir = projectRoot.resolve("web-preview/public/data"),
            )
        }
    }
}
