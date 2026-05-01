package composeicons.generator.core

import kotlin.math.abs

data class SvgPathCommand(
    val command: Char,
    val arguments: List<Float>,
) {

    fun normalize(minX: Float, minY: Float): SvgPathCommand {
        if (abs(minX) < 0.0001f && abs(minY) < 0.0001f) {
            return this
        }

        val normalizedArgs = when (command) {
            'M', 'L' -> listOf(
                arguments[0] - minX,
                arguments[1] - minY,
            )
            'C' -> listOf(
                arguments[0] - minX,
                arguments[1] - minY,
                arguments[2] - minX,
                arguments[3] - minY,
                arguments[4] - minX,
                arguments[5] - minY,
            )
            'Q' -> listOf(
                arguments[0] - minX,
                arguments[1] - minY,
                arguments[2] - minX,
                arguments[3] - minY,
            )
            else -> arguments
        }
        return copy(arguments = normalizedArgs)
    }

    fun toComposeNodeCode(): String = when (command) {
        'Z', 'z' -> "PathNode.Close"
        'M' -> "PathNode.MoveTo(${arguments[0].toKotlinFloat()}, ${arguments[1].toKotlinFloat()})"
        'L' -> "PathNode.LineTo(${arguments[0].toKotlinFloat()}, ${arguments[1].toKotlinFloat()})"
        'C' -> "PathNode.CurveTo(${arguments.joinToString(", ") { it.toKotlinFloat() }})"
        'Q' -> "PathNode.QuadTo(${arguments.joinToString(", ") { it.toKotlinFloat() }})"
        else -> error("Unsupported absolute path command: $command")
    }


}

private fun Float.toKotlinFloat(): String {
    if (abs(this) < 0.0000001f) return "0f"
    val normalized = if (this == -0.0f) 0f else this
    val text = normalized.toString()
    return if (text.endsWith("f")) text else "${text}f"
}

