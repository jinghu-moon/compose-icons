package composeicons.generator.core

data class GeneratorReport(
    val source: String,
    val upstreamVersion: String,
    val total: Int,
    val succeeded: Int,
    val failed: List<FailedIcon>,
    val warnings: List<IconWarning>,
)

data class FailedIcon(
    val fileName: String,
    val style: String,
    val reason: String,
)

data class IconWarning(
    val fileName: String,
    val style: String,
    val message: String,
)

