package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) return _chatCircleSlash!!
        _chatCircleSlash = phosphorBoldIcon(
            name = "ChatCircleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.012154f, 28.697262f, 49.6276f, 27.25621f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(41.174625f, 29.058353f, 37.759064f, 32.16236f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(35.15908f, 40.404972f, 36.175465f, 44.906956f, 39.12f, 48.07f),
                    PathNode.LineTo(46.93f, 56.66f),
                    PathNode.CurveTo(17.627417f, 89.94292f, 11.647392f, 137.75534f, 31.85f, 177.23f),
                    PathNode.LineTo(21.0f, 209.66f),
                    PathNode.CurveTo(18.573006f, 216.86134f, 20.436935f, 224.816f, 25.810467f, 230.18953f),
                    PathNode.CurveTo(31.184f, 235.56306f, 39.138653f, 237.427f, 46.34f, 235.0f),
                    PathNode.LineTo(78.77f, 224.19f),
                    PathNode.CurveTo(114.933556f, 242.68092f, 158.41089f, 239.33562f, 191.32f, 215.53f),
                    PathNode.LineTo(199.12f, 224.11f),
                    PathNode.CurveTo(203.5975f, 228.91977f, 211.1107f, 229.23367f, 215.9738f, 224.81416f),
                    PathNode.CurveTo(220.83693f, 220.39465f, 221.24089f, 212.88574f, 216.88f, 207.97f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(113.25289f, 211.99933f, 98.76641f, 208.11212f, 86.0f, 200.73f),
                    PathNode.CurveTo(83.021645f, 199.00351f, 79.44524f, 198.63931f, 76.18f, 199.73f),
                    PathNode.LineTo(46.39f, 209.66f),
                    PathNode.LineTo(56.32f, 179.87f),
                    PathNode.CurveTo(57.410686f, 176.60477f, 57.046494f, 173.02835f, 55.32f, 170.05f),
                    PathNode.CurveTo(37.772594f, 139.68361f, 40.93831f, 101.61128f, 63.26f, 74.56f),
                    PathNode.LineTo(175.1f, 197.56f),
                    PathNode.CurveTo(161.20058f, 206.98198f, 144.79189f, 212.01257f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.02834f, 142.57434f, 233.08507f, 157.00145f, 227.35f, 170.4f),
                    PathNode.CurveTo(224.62593f, 176.28223f, 217.72267f, 178.93774f, 211.75871f, 176.39758f),
                    PathNode.CurveTo(205.79475f, 173.85744f, 202.92621f, 167.03995f, 205.28f, 161.0f),
                    PathNode.CurveTo(218.10826f, 130.78445f, 212.1767f, 95.86595f, 190.09053f, 71.58127f),
                    PathNode.CurveTo(168.00438f, 47.296604f, 133.8037f, 38.087982f, 102.51f, 48.0f),
                    PathNode.CurveTo(96.228806f, 49.90144f, 89.58522f, 46.404354f, 87.59709f, 40.150063f),
                    PathNode.CurveTo(85.60895f, 33.89577f, 89.0138f, 27.204456f, 95.24f, 25.13f),
                    PathNode.CurveTo(128.0654f, 14.717181f, 163.8881f, 20.57055f, 191.6919f, 40.890068f),
                    PathNode.CurveTo(219.49568f, 61.20959f, 235.95193f, 93.562645f, 236.0f, 128.0f),
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
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
