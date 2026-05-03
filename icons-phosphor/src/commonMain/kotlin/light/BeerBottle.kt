package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) return _beerBottle!!
        _beerBottle = phosphorLightIcon(
            name = "BeerBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.24f, 43.76f),
                    PathNode.LineTo(212.24f, 11.76f),
                    PathNode.CurveTo(209.87592f, 9.557129f, 206.19193f, 9.622129f, 203.90703f, 11.907025f),
                    PathNode.CurveTo(201.62213f, 14.191922f, 201.55713f, 17.875921f, 203.76f, 20.24f),
                    PathNode.LineTo(206.87f, 23.35f),
                    PathNode.LineTo(149.49f, 66.35f),
                    PathNode.LineTo(110.82f, 74.09f),
                    PathNode.CurveTo(109.65903f, 74.31857f, 108.59318f, 74.88981f, 107.76f, 75.73f),
                    PathNode.LineTo(24.44f, 159.07f),
                    PathNode.CurveTo(15.850265f, 167.66124f, 15.850265f, 181.58876f, 24.44f, 190.18f),
                    PathNode.LineTo(65.82f, 231.56f),
                    PathNode.CurveTo(74.411224f, 240.14973f, 88.338776f, 240.14973f, 96.93f, 231.56f),
                    PathNode.LineTo(180.24f, 148.24f),
                    PathNode.CurveTo(181.08018f, 147.40681f, 181.65143f, 146.34097f, 181.88f, 145.18f),
                    PathNode.LineTo(189.62f, 106.51f),
                    PathNode.LineTo(232.62f, 49.13f),
                    PathNode.LineTo(235.73f, 52.24f),
                    PathNode.CurveTo(238.09407f, 54.44287f, 241.77808f, 54.377872f, 244.06297f, 52.092976f),
                    PathNode.CurveTo(246.34787f, 49.80808f, 246.41289f, 46.124077f, 244.21f, 43.76f),
                    PathNode.Close,
                    PathNode.MoveTo(88.44f, 223.07f),
                    PathNode.CurveTo(84.535f, 226.9738f, 78.205f, 226.9738f, 74.3f, 223.07f),
                    PathNode.LineTo(32.93f, 181.7f),
                    PathNode.CurveTo(29.02618f, 177.795f, 29.02618f, 171.465f, 32.93f, 167.56f),
                    PathNode.LineTo(40.0f, 160.49f),
                    PathNode.LineTo(95.51f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 207.51f),
                    PathNode.LineTo(48.49f, 152.0f),
                    PathNode.LineTo(96.0f, 104.49f),
                    PathNode.LineTo(151.51f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.2f, 100.4f),
                    PathNode.CurveTo(178.66054f, 101.113976f, 178.29117f, 101.94166f, 178.12f, 102.82f),
                    PathNode.LineTo(170.47f, 141.0f),
                    PathNode.LineTo(160.0f, 151.51f),
                    PathNode.LineTo(104.49f, 96.0f),
                    PathNode.LineTo(115.0f, 85.53f),
                    PathNode.LineTo(153.22f, 77.88f),
                    PathNode.CurveTo(154.09834f, 77.70884f, 154.92603f, 77.339455f, 155.64f, 76.8f),
                    PathNode.LineTo(215.48f, 31.92f),
                    PathNode.LineTo(224.12f, 40.56f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _beerBottle!!
    }

private var _beerBottle: ImageVector? = null
