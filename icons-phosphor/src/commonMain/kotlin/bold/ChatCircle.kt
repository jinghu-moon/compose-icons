package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) return _chatCircle!!
        _chatCircle = phosphorBoldIcon(
            name = "ChatCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(90.37983f, 19.992f, 55.466248f, 39.560963f, 35.839554f, 71.65566f),
                    PathNode.CurveTo(16.212852f, 103.75037f, 14.701471f, 143.7456f, 31.85f, 177.23f),
                    PathNode.LineTo(21.0f, 209.66f),
                    PathNode.CurveTo(18.573006f, 216.86134f, 20.436935f, 224.816f, 25.810467f, 230.18953f),
                    PathNode.CurveTo(31.184f, 235.56306f, 39.138653f, 237.427f, 46.34f, 235.0f),
                    PathNode.LineTo(78.77f, 224.19f),
                    PathNode.CurveTo(118.5896f, 244.5186f, 166.81815f, 238.21072f, 200.07013f, 208.32497f),
                    PathNode.CurveTo(233.32211f, 178.43921f, 244.72235f, 131.15479f, 228.74297f, 89.3994f),
                    PathNode.CurveTo(212.76358f, 47.644016f, 172.7085f, 20.051035f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(113.23311f, 212.00563f, 98.72567f, 208.11836f, 85.94f, 200.73f),
                    PathNode.CurveTo(84.11696f, 199.67249f, 82.04756f, 199.11374f, 79.94f, 199.11f),
                    PathNode.CurveTo(78.64836f, 199.11252f, 77.365456f, 199.32184f, 76.14f, 199.73f),
                    PathNode.LineTo(46.35f, 209.66f),
                    PathNode.LineTo(56.28f, 179.87f),
                    PathNode.CurveTo(57.367664f, 176.60777f, 57.003536f, 173.03568f, 55.28f, 170.06f),
                    PathNode.CurveTo(36.240578f, 137.1455f, 41.68617f, 95.54601f, 68.55624f, 68.641304f),
                    PathNode.CurveTo(95.426315f, 41.73659f, 137.01874f, 36.23741f, 169.95775f, 55.234413f),
                    PathNode.CurveTo(202.89676f, 74.231415f, 218.96646f, 112.98623f, 209.13536f, 149.7179f),
                    PathNode.CurveTo(199.30428f, 186.44952f, 166.02452f, 211.99614f, 128.0f, 212.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null
