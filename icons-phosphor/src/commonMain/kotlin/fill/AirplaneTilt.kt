package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) return _airplaneTilt!!
        _airplaneTilt = phosphorFillIcon(
            name = "AirplaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.52f, 197.26f),
                    PathNode.CurveTo(216.58224f, 200.18054f, 215.85698f, 203.452f, 213.66f, 205.65f),
                    PathNode.LineTo(189.66f, 229.65f),
                    PathNode.CurveTo(188.16006f, 231.15358f, 186.12381f, 231.99902f, 184.0f, 232.0f),
                    PathNode.CurveTo(183.73688f, 232.01468f, 183.47313f, 232.01468f, 183.21f, 232.0f),
                    PathNode.CurveTo(180.82484f, 231.76518f, 178.67061f, 230.47339f, 177.34f, 228.48f),
                    PathNode.LineTo(133.27f, 162.36f),
                    PathNode.LineTo(112.0f, 183.59f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.CurveTo(111.999016f, 210.11891f, 111.157455f, 212.15088f, 109.66f, 213.65f),
                    PathNode.CurveTo(109.66f, 213.65f, 95.66f, 227.71f, 93.78f, 229.53f),
                    PathNode.CurveTo(92.99847f, 230.3483f, 92.05047f, 230.9894f, 91.0f, 231.41f),
                    PathNode.CurveTo(86.92419f, 233.07022f, 82.27278f, 231.12654f, 80.59f, 227.06f),
                    PathNode.LineTo(80.53f, 226.91f),
                    PathNode.LineTo(65.83f, 190.15f),
                    PathNode.LineTo(29.0f, 175.42f),
                    PathNode.CurveTo(26.50434f, 174.42163f, 24.676867f, 172.23668f, 24.135403f, 169.60384f),
                    PathNode.CurveTo(23.593937f, 166.97098f, 24.410864f, 164.2422f, 26.31f, 162.34f),
                    PathNode.LineTo(42.31f, 146.34f),
                    PathNode.CurveTo(43.81892f, 144.83272f, 45.86724f, 143.99034f, 48.0f, 144.0f),
                    PathNode.LineTo(72.4f, 144.0f),
                    PathNode.LineTo(93.67f, 122.73f),
                    PathNode.LineTo(27.56f, 78.65f),
                    PathNode.CurveTo(25.56333f, 77.32083f, 24.268412f, 75.1659f, 24.032043f, 72.77895f),
                    PathNode.CurveTo(23.795673f, 70.392006f, 24.642796f, 68.024956f, 26.34f, 66.33f),
                    PathNode.LineTo(50.34f, 42.33f),
                    PathNode.CurveTo(52.538006f, 40.133015f, 55.809452f, 39.40776f, 58.73f, 40.47f),
                    PathNode.LineTo(144.67f, 71.72f),
                    PathNode.LineTo(176.2f, 40.19f),
                    PathNode.CurveTo(187.13524f, 29.254763f, 204.86476f, 29.254763f, 215.8f, 40.19f),
                    PathNode.CurveTo(226.73524f, 51.125237f, 226.73524f, 68.85476f, 215.8f, 79.79f),
                    PathNode.LineTo(184.27f, 111.32f),
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
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
