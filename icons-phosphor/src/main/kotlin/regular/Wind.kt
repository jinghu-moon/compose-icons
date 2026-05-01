package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorRegularIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 184.0f),
                    PathNode.CurveTo(184.0f, 201.67311f, 169.67311f, 216.0f, 152.0f, 216.0f),
                    PathNode.CurveTo(138.3f, 216.0f, 125.05f, 207.07f, 120.5f, 194.78f),
                    PathNode.CurveTo(119.05968f, 190.66373f, 121.181496f, 186.15224f, 125.270615f, 184.63652f),
                    PathNode.CurveTo(129.35973f, 183.12083f, 133.90944f, 185.15942f, 135.5f, 189.22f),
                    PathNode.CurveTo(137.74f, 195.27f, 145.0f, 200.0f, 152.0f, 200.0f),
                    PathNode.CurveTo(160.83656f, 200.0f, 168.0f, 192.83656f, 168.0f, 184.0f),
                    PathNode.CurveTo(168.0f, 175.16344f, 160.83656f, 168.0f, 152.0f, 168.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(35.581722f, 168.0f, 32.0f, 164.41827f, 32.0f, 160.0f),
                    PathNode.CurveTo(32.0f, 155.58173f, 35.581722f, 152.0f, 40.0f, 152.0f),
                    PathNode.LineTo(152.0f, 152.0f),
                    PathNode.CurveTo(169.67311f, 152.0f, 184.0f, 166.32689f, 184.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 104.0f),
                    PathNode.CurveTo(137.67311f, 104.0f, 152.0f, 89.67311f, 152.0f, 72.0f),
                    PathNode.CurveTo(152.0f, 54.32689f, 137.67311f, 40.0f, 120.0f, 40.0f),
                    PathNode.CurveTo(106.3f, 40.0f, 93.05f, 48.93f, 88.5f, 61.22f),
                    PathNode.CurveTo(87.05968f, 65.33627f, 89.181496f, 69.84776f, 93.270615f, 71.36346f),
                    PathNode.CurveTo(97.359726f, 72.87916f, 101.90943f, 70.84058f, 103.5f, 66.78f),
                    PathNode.CurveTo(105.74f, 60.73f, 113.0f, 56.0f, 120.0f, 56.0f),
                    PathNode.CurveTo(128.83656f, 56.0f, 136.0f, 63.163445f, 136.0f, 72.0f),
                    PathNode.CurveTo(136.0f, 80.836555f, 128.83656f, 88.0f, 120.0f, 88.0f),
                    PathNode.LineTo(24.0f, 88.0f),
                    PathNode.CurveTo(19.581722f, 88.0f, 16.0f, 91.58172f, 16.0f, 96.0f),
                    PathNode.CurveTo(16.0f, 100.41828f, 19.581722f, 104.0f, 24.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 72.0f),
                    PathNode.CurveTo(194.3f, 72.0f, 181.05f, 80.93f, 176.5f, 93.22f),
                    PathNode.CurveTo(175.05968f, 97.33627f, 177.18149f, 101.84776f, 181.27061f, 103.36346f),
                    PathNode.CurveTo(185.35973f, 104.87916f, 189.90944f, 102.84058f, 191.5f, 98.78f),
                    PathNode.CurveTo(193.74f, 92.73f, 201.0f, 88.0f, 208.0f, 88.0f),
                    PathNode.CurveTo(216.83656f, 88.0f, 224.0f, 95.163445f, 224.0f, 104.0f),
                    PathNode.CurveTo(224.0f, 112.836555f, 216.83656f, 120.0f, 208.0f, 120.0f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.CurveTo(27.581722f, 120.0f, 24.0f, 123.58172f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 132.41827f, 27.581722f, 136.0f, 32.0f, 136.0f),
                    PathNode.LineTo(208.0f, 136.0f),
                    PathNode.CurveTo(225.67311f, 136.0f, 240.0f, 121.67311f, 240.0f, 104.0f),
                    PathNode.CurveTo(240.0f, 86.32689f, 225.67311f, 72.0f, 208.0f, 72.0f),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
