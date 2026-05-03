package composeicons.generator.core.json

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SvgDocument(
    @SerialName("view_box") val viewBox: ViewBox,
    val nodes: List<JsonNode>,
)

@Serializable
data class ViewBox(
    val x: Double,
    val y: Double,
    val width: Double,
    val height: Double,
)

@Serializable
sealed class JsonNode

@Serializable
@SerialName("path")
data class JsonPathNode(
    val d: String,
    val transform: List<Double> = listOf(1.0, 0.0, 0.0, 1.0, 0.0, 0.0),
    val fill: FillStyle? = null,
    val stroke: StrokeStyle? = null,
    val visibility: String = "visible",
) : JsonNode()

@Serializable
@SerialName("group")
data class JsonGroupNode(
    val opacity: Double = 1.0,
    val transform: List<Double> = listOf(1.0, 0.0, 0.0, 1.0, 0.0, 0.0),
    @SerialName("clip_path") val clipPath: String? = null,
    val children: List<JsonNode> = emptyList(),
) : JsonNode()

@Serializable
data class FillStyle(
    val color: String,
    val opacity: Double = 1.0,
    val rule: String = "nonzero",
)

@Serializable
data class StrokeStyle(
    val color: String,
    val opacity: Double = 1.0,
    val width: Double = 1.0,
    val linecap: String = "butt",
    val linejoin: String = "miter",
)
