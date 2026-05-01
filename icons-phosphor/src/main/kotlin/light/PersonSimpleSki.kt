package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) return _personSimpleSki!!
        _personSimpleSki = phosphorLightIcon(
            name = "PersonSimpleSki",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 86.0f),
                    PathNode.CurveTo(186.3594f, 86.0f, 198.0f, 74.359406f, 198.0f, 60.0f),
                    PathNode.CurveTo(198.0f, 45.6406f, 186.3594f, 34.0f, 172.0f, 34.0f),
                    PathNode.CurveTo(157.6406f, 34.0f, 146.0f, 45.6406f, 146.0f, 60.0f),
                    PathNode.CurveTo(146.0f, 74.359406f, 157.6406f, 86.0f, 172.0f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 46.0f),
                    PathNode.CurveTo(179.73198f, 46.0f, 186.0f, 52.268013f, 186.0f, 60.0f),
                    PathNode.CurveTo(186.0f, 67.73199f, 179.73198f, 74.0f, 172.0f, 74.0f),
                    PathNode.CurveTo(164.26802f, 74.0f, 158.0f, 67.73199f, 158.0f, 60.0f),
                    PathNode.CurveTo(158.0f, 52.268013f, 164.26802f, 46.0f, 172.0f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.32f, 85.76f),
                    PathNode.LineTo(149.79f, 118.27f),
                    PathNode.LineTo(155.79f, 124.27f),
                    PathNode.CurveTo(156.91165f, 125.37723f, 158.42392f, 125.99866f, 160.0f, 126.0f),
                    PathNode.LineTo(200.0f, 126.0f),
                    PathNode.CurveTo(203.3137f, 126.0f, 206.0f, 123.313705f, 206.0f, 120.0f),
                    PathNode.CurveTo(206.0f, 116.686295f, 203.3137f, 114.0f, 200.0f, 114.0f),
                    PathNode.LineTo(162.49f, 114.0f),
                    PathNode.LineTo(132.24f, 83.75f),
                    PathNode.CurveTo(129.89746f, 81.41037f, 126.10254f, 81.41037f, 123.76f, 83.75f),
                    PathNode.LineTo(112.59f, 94.92f),
                    PathNode.LineTo(41.68f, 74.24f),
                    PathNode.CurveTo(38.49884f, 73.312164f, 35.16784f, 75.13884f, 34.24f, 78.32f),
                    PathNode.CurveTo(33.31216f, 81.50116f, 35.13884f, 84.83216f, 38.32f, 85.76f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 96.48f),
                    PathNode.LineTo(132.14f, 100.62f),
                    PathNode.LineTo(125.73f, 98.75f),
                    PathNode.Close,
                    PathNode.MoveTo(235.33f, 202.58f),
                    PathNode.CurveTo(218.6471f, 213.72426f, 197.88474f, 216.90636f, 178.63f, 211.27f),
                    PathNode.LineTo(22.32f, 165.75f),
                    PathNode.CurveTo(19.13884f, 164.82216f, 17.312162f, 161.49117f, 18.24f, 158.31f),
                    PathNode.CurveTo(19.16784f, 155.12885f, 22.49884f, 153.30215f, 25.68f, 154.23f),
                    PathNode.LineTo(102.81f, 176.69f),
                    PathNode.LineTo(132.55f, 147.0f),
                    PathNode.LineTo(86.35f, 133.8f),
                    PathNode.CurveTo(83.163315f, 132.88873f, 81.31873f, 129.56668f, 82.23f, 126.38f),
                    PathNode.CurveTo(83.14127f, 123.19331f, 86.46332f, 121.348724f, 89.65f, 122.26f),
                    PathNode.LineTo(145.65f, 138.26f),
                    PathNode.CurveTo(147.68863f, 138.84724f, 149.2656f, 140.46744f, 149.79752f, 142.5212f),
                    PathNode.CurveTo(150.32945f, 144.57497f, 149.73724f, 146.75696f, 148.24f, 148.26f),
                    PathNode.LineTo(116.0f, 180.52f),
                    PathNode.LineTo(182.0f, 199.75f),
                    PathNode.CurveTo(197.85123f, 204.39441f, 214.94565f, 201.77605f, 228.68f, 192.6f),
                    PathNode.CurveTo(231.44142f, 190.7609f, 235.1709f, 191.50858f, 237.01f, 194.27f),
                    PathNode.CurveTo(238.8491f, 197.03142f, 238.10143f, 200.7609f, 235.34f, 202.6f),
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
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
