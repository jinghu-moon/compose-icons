package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = phosphorBoldIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.0f, 77.47f),
                    PathNode.CurveTo(231.68289f, 71.4466f, 224.03448f, 67.997536f, 216.0f, 68.0f),
                    PathNode.LineTo(164.0f, 68.0f),
                    PathNode.LineTo(164.0f, 56.0f),
                    PathNode.CurveTo(163.97244f, 31.710894f, 144.28911f, 12.027555f, 120.0f, 12.0f),
                    PathNode.CurveTo(115.45663f, 12.000533f, 111.30316f, 14.566934f, 109.27f, 18.63f),
                    PathNode.LineTo(72.58f, 92.0f),
                    PathNode.LineTo(32.0f, 92.0f),
                    PathNode.CurveTo(20.954306f, 92.0f, 12.0f, 100.95431f, 12.0f, 112.0f),
                    PathNode.LineTo(12.0f, 200.0f),
                    PathNode.CurveTo(12.0f, 211.0457f, 20.954306f, 220.0f, 32.0f, 220.0f),
                    PathNode.LineTo(204.0f, 220.0f),
                    PathNode.CurveTo(218.1206f, 219.99791f, 230.03006f, 209.48175f, 231.78f, 195.47f),
                    PathNode.LineTo(243.78f, 99.47f),
                    PathNode.CurveTo(244.7786f, 91.503784f, 242.30956f, 83.49216f, 237.0f, 77.47f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 116.0f),
                    PathNode.LineTo(68.0f, 116.0f),
                    PathNode.LineTo(68.0f, 196.0f),
                    PathNode.LineTo(36.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 96.5f),
                    PathNode.LineTo(208.0f, 192.5f),
                    PathNode.CurveTo(207.74658f, 194.51192f, 206.02776f, 196.0159f, 204.0f, 196.0f),
                    PathNode.LineTo(92.0f, 196.0f),
                    PathNode.LineTo(92.0f, 106.83f),
                    PathNode.LineTo(126.82f, 37.2f),
                    PathNode.CurveTo(134.73105f, 40.06967f, 139.99947f, 47.58454f, 140.0f, 56.0f),
                    PathNode.LineTo(140.0f, 80.0f),
                    PathNode.CurveTo(140.0f, 86.62742f, 145.37259f, 92.0f, 152.0f, 92.0f),
                    PathNode.LineTo(216.0f, 92.0f),
                    PathNode.CurveTo(217.15346f, 91.99095f, 218.25468f, 92.480286f, 219.02103f, 93.34242f),
                    PathNode.CurveTo(219.78737f, 94.20456f, 220.14423f, 95.35555f, 220.0f, 96.5f),
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
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
