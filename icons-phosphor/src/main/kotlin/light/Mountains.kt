package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorLightIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 78.0f),
                    PathNode.CurveTo(178.3594f, 78.0f, 190.0f, 66.359406f, 190.0f, 52.0f),
                    PathNode.CurveTo(190.0f, 37.6406f, 178.3594f, 26.0f, 164.0f, 26.0f),
                    PathNode.CurveTo(149.6406f, 26.0f, 138.0f, 37.6406f, 138.0f, 52.0f),
                    PathNode.CurveTo(138.0f, 66.359406f, 149.6406f, 78.0f, 164.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 38.0f),
                    PathNode.CurveTo(171.73198f, 38.0f, 178.0f, 44.268013f, 178.0f, 52.0f),
                    PathNode.CurveTo(178.0f, 59.731987f, 171.73198f, 66.0f, 164.0f, 66.0f),
                    PathNode.CurveTo(156.26802f, 66.0f, 150.0f, 59.731987f, 150.0f, 52.0f),
                    PathNode.CurveTo(150.0f, 44.268013f, 156.26802f, 38.0f, 164.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(253.16f, 196.94f),
                    PathNode.LineTo(198.6f, 104.86f),
                    PathNode.CurveTo(196.10104f, 100.605606f, 191.53403f, 97.9948f, 186.6f, 98.0f),
                    PathNode.LineTo(186.6f, 98.0f),
                    PathNode.CurveTo(181.66489f, 97.99072f, 177.096f, 100.6026f, 174.6f, 104.86f),
                    PathNode.LineTo(146.72f, 151.91f),
                    PathNode.LineTo(100.16f, 72.91f),
                    PathNode.CurveTo(97.64411f, 68.63586f, 93.054634f, 66.01182f, 88.095f, 66.01182f),
                    PathNode.CurveTo(83.13536f, 66.01182f, 78.54589f, 68.63586f, 76.03f, 72.91f),
                    PathNode.LineTo(2.83f, 197.0f),
                    PathNode.CurveTo(1.76051f, 198.85237f, 1.758008f, 201.134f, 2.823433f, 202.98871f),
                    PathNode.CurveTo(3.888859f, 204.84341f, 5.86108f, 205.99069f, 8.0f, 206.0f),
                    PathNode.LineTo(248.0f, 206.0f),
                    PathNode.CurveTo(250.15582f, 205.99962f, 252.14574f, 204.8427f, 253.21266f, 202.96939f),
                    PathNode.CurveTo(254.27957f, 201.09608f, 254.25948f, 198.79439f, 253.16f, 196.94f),
                    PathNode.Close,
                    PathNode.MoveTo(86.27f, 79.0f),
                    PathNode.CurveTo(86.6278f, 78.383194f, 87.286934f, 78.00355f, 88.0f, 78.00355f),
                    PathNode.CurveTo(88.713066f, 78.00355f, 89.3722f, 78.383194f, 89.73f, 79.0f),
                    PathNode.LineTo(115.07f, 122.0f),
                    PathNode.LineTo(60.93f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.5f, 194.0f),
                    PathNode.LineTo(53.86f, 134.0f),
                    PathNode.LineTo(122.15f, 134.0f),
                    PathNode.LineTo(141.45f, 166.77f),
                    PathNode.LineTo(141.45f, 166.77f),
                    PathNode.LineTo(157.45f, 193.97f),
                    PathNode.Close,
                    PathNode.MoveTo(171.43f, 194.0f),
                    PathNode.LineTo(153.58f, 163.71f),
                    PathNode.LineTo(184.83f, 111.0f),
                    PathNode.CurveTo(185.1851f, 110.38491f, 185.83978f, 110.00429f, 186.55f, 110.0f),
                    PathNode.CurveTo(187.2642f, 109.989365f, 187.92589f, 110.37406f, 188.27f, 111.0f),
                    PathNode.LineTo(237.47f, 194.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mountains!!
    }

private var _mountains: ImageVector? = null
