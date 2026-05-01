package composeicons.generator.core

import java.io.File

data class GeneratorConfig(
    val sourceRootDir: File,
    val outputDir: File,
    val reportDir: File,
)
