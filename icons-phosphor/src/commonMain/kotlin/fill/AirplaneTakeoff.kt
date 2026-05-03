package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) return _airplaneTakeoff!!
        _airplaneTakeoff = phosphorFillIcon(
            name = "AirplaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 216.0f),
                    PathNode.CurveTo(176.0f, 220.41827f, 172.41827f, 224.0f, 168.0f, 224.0f),
                    PathNode.LineTo(24.0f, 224.0f),
                    PathNode.CurveTo(19.581722f, 224.0f, 16.0f, 220.41827f, 16.0f, 216.0f),
                    PathNode.CurveTo(16.0f, 211.58173f, 19.581722f, 208.0f, 24.0f, 208.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.CurveTo(172.41827f, 208.0f, 176.0f, 211.58173f, 176.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(246.31f, 86.76f),
                    PathNode.LineTo(227.67f, 62.87f),
                    PathNode.LineTo(227.55f, 62.72f),
                    PathNode.CurveTo(215.09015f, 47.3726f, 193.25743f, 43.489716f, 176.27f, 53.6f),
                    PathNode.LineTo(124.7f, 84.38f),
                    PathNode.LineTo(70.76f, 64.54f),
                    PathNode.CurveTo(68.95729f, 63.867817f, 66.97271f, 63.867817f, 65.17f, 64.54f),
                    PathNode.LineTo(58.0f, 67.27f),
                    PathNode.LineTo(57.68f, 67.4f),
                    PathNode.CurveTo(52.696117f, 69.53934f, 49.13532f, 74.05782f, 48.220432f, 79.40373f),
                    PathNode.CurveTo(47.305546f, 84.749664f, 49.161148f, 90.19509f, 53.15f, 93.87f),
                    PathNode.LineTo(75.0f, 115.06f),
                    PathNode.LineTo(54.83f, 127.26f),
                    PathNode.LineTo(26.57f, 117.72f),
                    PathNode.CurveTo(24.569914f, 117.0461f, 22.384558f, 117.18987f, 20.49f, 118.12f),
                    PathNode.LineTo(17.49f, 119.59f),
                    PathNode.CurveTo(12.615663f, 121.768166f, 9.148901f, 126.23404f, 8.247438f, 131.49626f),
                    PathNode.CurveTo(7.345975f, 136.75847f, 9.128597f, 142.12361f, 13.0f, 145.8f),
                    PathNode.LineTo(49.0f, 181.07f),
                    PathNode.LineTo(49.12f, 181.19f),
                    PathNode.CurveTo(56.494205f, 188.15994f, 66.253136f, 192.0485f, 76.4f, 192.06f),
                    PathNode.CurveTo(83.52325f, 192.04842f, 90.515366f, 190.14336f, 96.66f, 186.54f),
                    PathNode.LineTo(244.07f, 98.54f),
                    PathNode.CurveTo(246.03761f, 97.36416f, 247.40634f, 95.40079f, 247.829f, 93.1479f),
                    PathNode.CurveTo(248.25165f, 90.89502f, 247.68764f, 88.56906f, 246.28f, 86.76f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
