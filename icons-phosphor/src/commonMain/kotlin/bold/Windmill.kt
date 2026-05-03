package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Windmill: ImageVector
    get() {
        if (_windmill != null) return _windmill!!
        _windmill = phosphorBoldIcon(
            name = "Windmill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 220.0f),
                    PathNode.LineTo(186.41f, 220.0f),
                    PathNode.LineTo(181.69f, 187.0f),
                    PathNode.CurveTo(190.64006f, 189.9784f, 200.45445f, 186.29852f, 205.24f, 178.17f),
                    PathNode.LineTo(217.24f, 157.84f),
                    PathNode.CurveTo(219.93674f, 153.26717f, 220.70477f, 147.80977f, 219.37488f, 142.67027f),
                    PathNode.CurveTo(218.04498f, 137.53076f, 214.72629f, 133.13086f, 210.15f, 130.44f),
                    PathNode.LineTo(178.58f, 111.86f),
                    PathNode.LineTo(217.24f, 46.18f),
                    PathNode.CurveTo(219.93442f, 41.60927f, 220.7022f, 36.1552f, 219.37436f, 31.018246f),
                    PathNode.CurveTo(218.04651f, 25.88129f, 214.73187f, 21.482483f, 210.16f, 18.79f),
                    PathNode.LineTo(189.82f, 6.79f),
                    PathNode.CurveTo(185.24806f, 4.096433f, 179.79309f, 3.330182f, 174.65599f, 4.659938f),
                    PathNode.CurveTo(169.51889f, 5.989693f, 165.12082f, 9.306439f, 162.43f, 13.88f),
                    PathNode.LineTo(143.84f, 45.43f),
                    PathNode.LineTo(78.15f, 6.77f),
                    PathNode.CurveTo(73.57806f, 4.076433f, 68.123085f, 3.310182f, 62.98599f, 4.639938f),
                    PathNode.CurveTo(57.848896f, 5.969693f, 53.45082f, 9.286439f, 50.76f, 13.86f),
                    PathNode.LineTo(38.76f, 34.19f),
                    PathNode.CurveTo(36.063255f, 38.76283f, 35.295223f, 44.22021f, 36.62512f, 49.359722f),
                    PathNode.CurveTo(37.955013f, 54.49923f, 41.27371f, 58.899136f, 45.85f, 61.59f),
                    PathNode.LineTo(77.43f, 80.17f),
                    PathNode.LineTo(38.77f, 145.85f),
                    PathNode.CurveTo(36.075584f, 150.42073f, 35.307804f, 155.8748f, 36.635647f, 161.01175f),
                    PathNode.CurveTo(37.963493f, 166.14873f, 41.278126f, 170.54752f, 45.85f, 173.24f),
                    PathNode.LineTo(66.19f, 185.24f),
                    PathNode.CurveTo(68.635994f, 186.68633f, 71.364265f, 187.59006f, 74.19f, 187.89f),
                    PathNode.LineTo(69.59f, 220.0f),
                    PathNode.LineTo(32.0f, 220.0f),
                    PathNode.CurveTo(25.372583f, 220.0f, 20.0f, 225.37259f, 20.0f, 232.0f),
                    PathNode.CurveTo(20.0f, 238.62741f, 25.372583f, 244.0f, 32.0f, 244.0f),
                    PathNode.LineTo(224.0f, 244.0f),
                    PathNode.CurveTo(230.62741f, 244.0f, 236.0f, 238.62741f, 236.0f, 232.0f),
                    PathNode.CurveTo(236.0f, 225.37259f, 230.62741f, 220.0f, 224.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.59f, 162.53f),
                    PathNode.LineTo(124.33f, 125.89f),
                    PathNode.LineTo(132.26f, 112.43f),
                    PathNode.LineTo(194.52f, 149.08f),
                    PathNode.Close,
                    PathNode.MoveTo(181.07f, 29.53f),
                    PathNode.LineTo(194.53f, 37.46f),
                    PathNode.LineTo(157.89f, 99.67f),
                    PathNode.LineTo(144.43f, 91.75f),
                    PathNode.Close,
                    PathNode.MoveTo(69.41f, 29.53f),
                    PathNode.LineTo(131.67f, 66.17f),
                    PathNode.LineTo(123.74f, 79.63f),
                    PathNode.LineTo(61.48f, 42.93f),
                    PathNode.Close,
                    PathNode.MoveTo(61.47f, 154.59f),
                    PathNode.LineTo(98.11f, 92.34f),
                    PathNode.LineTo(111.57f, 100.26f),
                    PathNode.LineTo(74.93f, 162.52f),
                    PathNode.Close,
                    PathNode.MoveTo(101.81f, 164.15f),
                    PathNode.LineTo(112.16f, 146.58f),
                    PathNode.LineTo(155.3f, 172.0f),
                    PathNode.LineTo(162.16f, 220.0f),
                    PathNode.LineTo(93.84f, 220.0f),
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
        return _windmill!!
    }

private var _windmill: ImageVector? = null
