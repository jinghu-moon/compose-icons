package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Barn: ImageVector
    get() {
        if (_barn != null) return _barn!!
        _barn = phosphorFillIcon(
            name = "Barn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 192.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 130.57f),
                    PathNode.LineTo(233.49f, 132.65f),
                    PathNode.CurveTo(235.09398f, 135.11792f, 237.9236f, 136.50574f, 240.85696f, 136.2632f),
                    PathNode.CurveTo(243.79033f, 136.02066f, 246.35358f, 134.18695f, 247.53044f, 131.4891f),
                    PathNode.CurveTo(248.70732f, 128.79124f, 248.30768f, 125.665054f, 246.49f, 123.35f),
                    PathNode.LineTo(206.49f, 67.35f),
                    PathNode.CurveTo(205.94194f, 66.591324f, 205.26501f, 65.9347f, 204.49f, 65.41f),
                    PathNode.LineTo(137.0f, 18.77f),
                    PathNode.LineTo(136.9f, 18.7f),
                    PathNode.CurveTo(131.5234f, 15.112807f, 124.51659f, 15.112807f, 119.14f, 18.7f),
                    PathNode.LineTo(119.04f, 18.77f),
                    PathNode.LineTo(51.45f, 65.42f),
                    PathNode.CurveTo(50.674984f, 65.944695f, 49.998055f, 66.60132f, 49.45f, 67.36f),
                    PathNode.LineTo(9.45f, 123.36f),
                    PathNode.CurveTo(7.632318f, 125.67505f, 7.232686f, 128.80124f, 8.409552f, 131.4991f),
                    PathNode.CurveTo(9.586417f, 134.19695f, 12.149672f, 136.03067f, 15.083033f, 136.27321f),
                    PathNode.CurveTo(18.016394f, 136.51575f, 20.846014f, 135.12793f, 22.45f, 132.66f),
                    PathNode.LineTo(24.0f, 130.57f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(11.581722f, 192.0f, 8.0f, 195.58173f, 8.0f, 200.0f),
                    PathNode.CurveTo(8.0f, 204.41827f, 11.581722f, 208.0f, 16.0f, 208.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.CurveTo(244.41827f, 208.0f, 248.0f, 204.41827f, 248.0f, 200.0f),
                    PathNode.CurveTo(248.0f, 195.58173f, 244.41827f, 192.0f, 240.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 80.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.CurveTo(148.41827f, 80.0f, 152.0f, 83.58172f, 152.0f, 88.0f),
                    PathNode.CurveTo(152.0f, 92.41828f, 148.41827f, 96.0f, 144.0f, 96.0f),
                    PathNode.LineTo(112.0f, 96.0f),
                    PathNode.CurveTo(107.58172f, 96.0f, 104.0f, 92.41828f, 104.0f, 88.0f),
                    PathNode.CurveTo(104.0f, 83.58172f, 107.58172f, 80.0f, 112.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.64f, 120.0f),
                    PathNode.LineTo(128.0f, 146.17f),
                    PathNode.LineTo(91.36f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 125.83f),
                    PathNode.LineTo(114.24f, 156.0f),
                    PathNode.LineTo(72.0f, 186.17f),
                    PathNode.Close,
                    PathNode.MoveTo(91.36f, 192.0f),
                    PathNode.LineTo(128.0f, 165.83f),
                    PathNode.LineTo(164.64f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 186.17f),
                    PathNode.LineTo(141.76f, 156.0f),
                    PathNode.LineTo(184.0f, 125.83f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _barn!!
    }

private var _barn: ImageVector? = null
