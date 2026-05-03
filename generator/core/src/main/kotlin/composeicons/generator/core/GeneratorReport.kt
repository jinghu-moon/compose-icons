package composeicons.generator.core

import kotlinx.serialization.Serializable

@Serializable
data class GeneratorReport(
    val source: String,
    val upstreamVersion: String,
    val total: Int,
    val succeeded: Int,
    val failed: List<FailedIcon>,
    val warnings: List<IconWarning>,
    val explorerEntries: List<ExplorerEntry> = emptyList(),
)

@Serializable
data class ExplorerEntry(
    val name: String,
    val style: String,
    val kotlinPath: String,
    val viewBox: ExplorerViewBox,
    val paths: List<ExplorerPathNode>,
    val tags: Set<String> = emptySet(),
    val category: String? = null,
    val hash: String? = null,
)

@Serializable
data class ExplorerViewBox(
    val minX: Float,
    val minY: Float,
    val width: Float,
    val height: Float,
)

@Serializable
data class ExplorerPathNode(
    val fill: String?,
    val stroke: String?,
    val strokeWidth: Float?,
    val strokeLineCap: String?,
    val strokeLineJoin: String?,
    val fillRule: String?,
    val alpha: Float = 1.0f,
    val d: String,
)

@Serializable
data class FailedIcon(
    val fileName: String,
    val style: String,
    val reason: String,
)

@Serializable
data class IconWarning(
    val fileName: String,
    val style: String,
    val message: String,
)
