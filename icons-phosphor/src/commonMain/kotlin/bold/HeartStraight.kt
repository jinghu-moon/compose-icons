package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) return _heartStraight!!
        _heartStraight = phosphorBoldIcon(
            name = "HeartStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.84f, 54.13f),
                    PathNode.CurveTo(201.66599f, 30.027138f, 162.5655f, 29.969057f, 138.32f, 54.0f),
                    PathNode.LineTo(128.0f, 63.58f),
                    PathNode.LineTo(117.68f, 54.0f),
                    PathNode.CurveTo(93.43471f, 29.81545f, 54.17455f, 29.8647f, 29.99f, 54.11f),
                    PathNode.CurveTo(5.805452f, 78.3553f, 5.8547f, 117.61545f, 30.1f, 141.8f),
                    PathNode.LineTo(119.45f, 232.45f),
                    PathNode.CurveTo(121.70549f, 234.7403f, 124.78555f, 236.02994f, 128.0f, 236.02994f),
                    PathNode.CurveTo(131.21445f, 236.02994f, 134.29451f, 234.7403f, 136.55f, 232.45f),
                    PathNode.LineTo(225.84f, 141.86f),
                    PathNode.CurveTo(237.47299f, 130.23198f, 244.00876f, 114.45802f, 244.00876f, 98.01f),
                    PathNode.CurveTo(244.00876f, 81.56198f, 237.47299f, 65.78802f, 225.84f, 54.16f),
                    PathNode.Close,
                    PathNode.MoveTo(208.84f, 124.92f),
                    PathNode.LineTo(128.0f, 206.9f),
                    PathNode.LineTo(47.13f, 124.85f),
                    PathNode.CurveTo(32.342552f, 110.001144f, 32.367435f, 85.9838f, 47.18562f, 71.16562f),
                    PathNode.CurveTo(62.003803f, 56.347435f, 86.02114f, 56.32255f, 100.87f, 71.11f),
                    PathNode.CurveTo(100.97f, 71.21f, 101.07f, 71.31f, 101.18f, 71.4f),
                    PathNode.LineTo(119.82f, 88.76f),
                    PathNode.CurveTo(124.42829f, 93.05339f, 131.57172f, 93.05339f, 136.18f, 88.76f),
                    PathNode.LineTo(154.82f, 71.4f),
                    PathNode.CurveTo(154.93f, 71.31f, 155.03f, 71.21f, 155.13f, 71.11f),
                    PathNode.CurveTo(169.98923f, 56.28668f, 194.05168f, 56.315777f, 208.87502f, 71.175f),
                    PathNode.CurveTo(223.69832f, 86.03422f, 223.66922f, 110.09668f, 208.81f, 124.92f),
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
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
