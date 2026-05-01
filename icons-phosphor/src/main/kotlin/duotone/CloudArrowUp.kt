package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) return _cloudArrowUp!!
        _cloudArrowUp = phosphorDuotoneIcon(
            name = "CloudArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 172.18279f, 204.18279f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.CurveTo(50.325085f, 207.97327f, 30.61199f, 195.44093f, 21.390259f, 175.82558f),
                    PathNode.CurveTo(12.168529f, 156.21022f, 15.094369f, 133.0347f, 28.901815f, 116.32671f),
                    PathNode.CurveTo(42.709263f, 99.61871f, 64.918526f, 92.378975f, 85.92f, 97.74f),
                    PathNode.LineTo(85.92f, 97.84f),
                    PathNode.CurveTo(100.35724f, 62.427902f, 137.83798f, 42.185604f, 175.36777f, 49.531776f),
                    PathNode.CurveTo(212.89755f, 56.87795f, 239.98f, 89.758f, 240.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.34f, 165.66f),
                    PathNode.LineTo(160.0f, 147.31f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.CurveTo(160.0f, 212.41827f, 156.41827f, 216.0f, 152.0f, 216.0f),
                    PathNode.CurveTo(147.58173f, 216.0f, 144.0f, 212.41827f, 144.0f, 208.0f),
                    PathNode.LineTo(144.0f, 147.31f),
                    PathNode.LineTo(125.66f, 165.66f),
                    PathNode.CurveTo(122.534065f, 168.78593f, 117.465935f, 168.78593f, 114.34f, 165.66f),
                    PathNode.CurveTo(111.214066f, 162.53407f, 111.214066f, 157.46593f, 114.34f, 154.34f),
                    PathNode.LineTo(146.34f, 122.34f),
                    PathNode.CurveTo(147.84055f, 120.83778f, 149.87672f, 119.993706f, 152.0f, 119.993706f),
                    PathNode.CurveTo(154.12328f, 119.993706f, 156.15945f, 120.83778f, 157.66f, 122.34f),
                    PathNode.LineTo(189.66f, 154.34f),
                    PathNode.CurveTo(192.78593f, 157.46593f, 192.78593f, 162.53407f, 189.66f, 165.66f),
                    PathNode.CurveTo(186.53407f, 168.78593f, 181.46593f, 168.78593f, 178.34f, 165.66f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 40.0f),
                    PathNode.CurveTo(126.66549f, 40.025146f, 96.20121f, 58.866474f, 81.29f, 88.68f),
                    PathNode.CurveTo(57.56234f, 85.19328f, 33.876602f, 95.26478f, 19.926508f, 114.77257f),
                    PathNode.CurveTo(5.976415f, 134.28036f, 4.103396f, 159.9502f, 15.07401f, 181.27635f),
                    PathNode.CurveTo(26.044622f, 202.60251f, 48.01753f, 216.00551f, 72.0f, 216.0f),
                    PathNode.LineTo(112.0f, 216.0f),
                    PathNode.CurveTo(116.41828f, 216.0f, 120.0f, 212.41827f, 120.0f, 208.0f),
                    PathNode.CurveTo(120.0f, 203.58173f, 116.41828f, 200.0f, 112.0f, 200.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(45.490334f, 200.0f, 24.0f, 178.50967f, 24.0f, 152.0f),
                    PathNode.CurveTo(24.0f, 125.49033f, 45.490334f, 104.0f, 72.0f, 104.0f),
                    PathNode.CurveTo(73.1f, 104.0f, 74.2f, 104.0f, 75.29f, 104.12f),
                    PathNode.CurveTo(73.103134f, 111.8914f, 71.996086f, 119.92677f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 132.41827f, 75.58172f, 136.0f, 80.0f, 136.0f),
                    PathNode.CurveTo(84.41828f, 136.0f, 88.0f, 132.41827f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.00545f, 92.041306f, 114.54033f, 61.599724f, 150.16174f, 56.686237f),
                    PathNode.CurveTo(185.78316f, 51.772755f, 219.56836f, 73.89403f, 229.3084f, 108.50845f),
                    PathNode.CurveTo(239.04843f, 143.1229f, 221.75668f, 179.61652f, 188.8f, 194.0f),
                    PathNode.CurveTo(185.31767f, 195.50957f, 183.37535f, 199.25822f, 184.15042f, 202.9737f),
                    PathNode.CurveTo(184.92549f, 206.68916f, 188.20456f, 209.34862f, 192.0f, 209.34f),
                    PathNode.CurveTo(193.10243f, 209.33911f, 194.19246f, 209.10747f, 195.2f, 208.66f),
                    PathNode.CurveTo(233.40118f, 191.99625f, 254.67397f, 150.81984f, 246.15918f, 110.02143f),
                    PathNode.CurveTo(237.6444f, 69.22302f, 201.67747f, 39.99276f, 160.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
