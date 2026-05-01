package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Intersect: ImageVector
    get() {
        if (_intersect != null) return _intersect!!
        _intersect = phosphorThinIcon(
            name = "Intersect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(171.17f, 84.83f),
                    PathNode.CurveTo(165.42831f, 46.168804f, 131.29903f, 18.166204f, 92.260994f, 20.086275f),
                    PathNode.CurveTo(53.22296f, 22.006346f, 22.006346f, 53.22296f, 20.086275f, 92.260994f),
                    PathNode.CurveTo(18.166204f, 131.29903f, 46.168804f, 165.42831f, 84.83f, 171.17f),
                    PathNode.CurveTo(90.57168f, 209.8312f, 124.700966f, 237.8338f, 163.739f, 235.91373f),
                    PathNode.CurveTo(202.77704f, 233.99365f, 233.99365f, 202.77704f, 235.91373f, 163.739f),
                    PathNode.CurveTo(237.8338f, 124.700966f, 209.8312f, 90.57168f, 171.17f, 84.83f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 96.0f),
                    PathNode.CurveTo(28.044168f, 60.798435f, 54.94621f, 31.449862f, 90.01101f, 28.349566f),
                    PathNode.CurveTo(125.075806f, 25.249268f, 156.71002f, 49.422287f, 162.93f, 84.07f),
                    PathNode.CurveTo(161.93f, 84.07f, 160.93f, 84.0f, 160.0f, 84.0f),
                    PathNode.CurveTo(118.04464f, 84.04409f, 84.04409f, 118.04464f, 84.0f, 160.0f),
                    PathNode.CurveTo(84.0f, 161.0f, 84.0f, 162.0f, 84.07f, 162.93f),
                    PathNode.CurveTo(51.65516f, 157.1124f, 28.04789f, 128.93272f, 28.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 96.0f),
                    PathNode.CurveTo(164.0067f, 106.74239f, 161.45279f, 117.33167f, 156.55f, 126.89f),
                    PathNode.LineTo(129.11f, 99.45f),
                    PathNode.CurveTo(138.66833f, 94.5472f, 149.2576f, 91.9933f, 160.0f, 92.0f),
                    PathNode.CurveTo(161.3f, 92.0f, 162.6f, 92.0f, 163.88f, 92.12f),
                    PathNode.CurveTo(164.0f, 93.4f, 164.0f, 94.7f, 164.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 160.0f),
                    PathNode.CurveTo(91.9933f, 149.2576f, 94.5472f, 138.66833f, 99.45f, 129.11f),
                    PathNode.LineTo(126.89f, 156.55f),
                    PathNode.CurveTo(117.33167f, 161.45279f, 106.74239f, 164.0067f, 96.0f, 164.0f),
                    PathNode.CurveTo(94.7f, 164.0f, 93.4f, 163.95f, 92.12f, 163.88f),
                    PathNode.CurveTo(92.05f, 162.6f, 92.0f, 161.3f, 92.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 152.36f),
                    PathNode.LineTo(103.64f, 122.0f),
                    PathNode.CurveTo(108.53809f, 114.769226f, 114.769226f, 108.53809f, 122.0f, 103.64f),
                    PathNode.LineTo(152.36f, 134.0f),
                    PathNode.CurveTo(147.46191f, 141.23077f, 141.23077f, 147.46191f, 134.0f, 152.36f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 228.0f),
                    PathNode.CurveTo(127.06728f, 227.9521f, 98.8876f, 204.34485f, 93.07f, 171.93f),
                    PathNode.CurveTo(94.07f, 171.93f, 95.07f, 172.0f, 96.0f, 172.0f),
                    PathNode.CurveTo(137.95538f, 171.9559f, 171.9559f, 137.95538f, 172.0f, 96.0f),
                    PathNode.CurveTo(172.0f, 95.0f, 172.0f, 94.0f, 171.93f, 93.07f),
                    PathNode.CurveTo(206.57771f, 99.28998f, 230.75073f, 130.9242f, 227.65044f, 165.989f),
                    PathNode.CurveTo(224.55014f, 201.05379f, 195.20157f, 227.95583f, 160.0f, 228.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _intersect!!
    }

private var _intersect: ImageVector? = null
