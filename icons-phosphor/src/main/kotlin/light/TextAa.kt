package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorLightIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(85.43f, 53.45f),
                    PathNode.CurveTo(84.44088f, 51.345787f, 82.325096f, 50.00247f, 80.0f, 50.00247f),
                    PathNode.CurveTo(77.674904f, 50.00247f, 75.55912f, 51.345787f, 74.57f, 53.45f),
                    PathNode.LineTo(10.57f, 189.45f),
                    PathNode.CurveTo(9.158913f, 192.44891f, 10.446094f, 196.02391f, 13.445f, 197.435f),
                    PathNode.CurveTo(16.443907f, 198.84608f, 20.018913f, 197.5589f, 21.43f, 194.56f),
                    PathNode.LineTo(38.63f, 158.0f),
                    PathNode.LineTo(121.37f, 158.0f),
                    PathNode.LineTo(138.57f, 194.55f),
                    PathNode.CurveTo(139.9811f, 197.5489f, 143.55609f, 198.83609f, 146.555f, 197.425f),
                    PathNode.CurveTo(149.55391f, 196.01392f, 150.8411f, 192.43889f, 149.43f, 189.44f),
                    PathNode.Close,
                    PathNode.MoveTo(44.28f, 146.0f),
                    PathNode.LineTo(80.0f, 70.09f),
                    PathNode.LineTo(115.72f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 98.0f),
                    PathNode.CurveTo(187.79f, 98.0f, 178.29f, 101.28f, 171.77f, 107.74f),
                    PathNode.CurveTo(169.41727f, 110.076164f, 169.40384f, 113.877266f, 171.74f, 116.23f),
                    PathNode.CurveTo(174.07617f, 118.58273f, 177.87727f, 118.59616f, 180.23f, 116.26f),
                    PathNode.CurveTo(184.41f, 112.11f, 191.07f, 110.0f, 200.0f, 110.0f),
                    PathNode.CurveTo(214.34f, 110.0f, 226.0f, 119.87f, 226.0f, 132.0f),
                    PathNode.LineTo(226.0f, 139.24f),
                    PathNode.CurveTo(218.68803f, 133.20107f, 209.48308f, 129.92976f, 200.0f, 130.0f),
                    PathNode.CurveTo(179.05f, 130.0f, 162.0f, 145.25f, 162.0f, 164.0f),
                    PathNode.CurveTo(162.0f, 182.75f, 179.05f, 198.0f, 200.0f, 198.0f),
                    PathNode.CurveTo(209.48308f, 198.07024f, 218.68803f, 194.79893f, 226.0f, 188.76f),
                    PathNode.LineTo(226.0f, 192.0f),
                    PathNode.CurveTo(226.0f, 195.3137f, 228.6863f, 198.0f, 232.0f, 198.0f),
                    PathNode.CurveTo(235.3137f, 198.0f, 238.0f, 195.3137f, 238.0f, 192.0f),
                    PathNode.LineTo(238.0f, 132.0f),
                    PathNode.CurveTo(238.0f, 113.25f, 221.0f, 98.0f, 200.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 186.0f),
                    PathNode.CurveTo(185.66f, 186.0f, 174.0f, 176.13f, 174.0f, 164.0f),
                    PathNode.CurveTo(174.0f, 151.87f, 185.66f, 142.0f, 200.0f, 142.0f),
                    PathNode.CurveTo(214.34f, 142.0f, 226.0f, 151.87f, 226.0f, 164.0f),
                    PathNode.CurveTo(226.0f, 176.13f, 214.34f, 186.0f, 200.0f, 186.0f),
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
        return _textAa!!
    }

private var _textAa: ImageVector? = null
