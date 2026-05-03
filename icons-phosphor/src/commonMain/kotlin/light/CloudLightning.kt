package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorLightIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 18.0f),
                    PathNode.CurveTo(124.62381f, 18.006062f, 96.64201f, 37.74426f, 86.11f, 67.3f),
                    PathNode.CurveTo(85.53628f, 66.998665f, 84.91873f, 66.789444f, 84.28f, 66.68f),
                    PathNode.CurveTo(81.543175f, 66.22778f, 78.77393f, 66.00036f, 76.0f, 66.0f),
                    PathNode.CurveTo(48.38576f, 66.0f, 26.0f, 88.385765f, 26.0f, 116.0f),
                    PathNode.CurveTo(26.0f, 143.61424f, 48.38576f, 166.0f, 76.0f, 166.0f),
                    PathNode.LineTo(117.4f, 166.0f),
                    PathNode.LineTo(98.85f, 196.91f),
                    PathNode.CurveTo(97.7358f, 198.76453f, 97.70629f, 201.07527f, 98.77276f, 202.95764f),
                    PathNode.CurveTo(99.83923f, 204.84001f, 101.83651f, 206.00246f, 104.0f, 206.0f),
                    PathNode.LineTo(133.4f, 206.0f),
                    PathNode.LineTo(114.85f, 236.91f),
                    PathNode.CurveTo(113.14344f, 239.75427f, 114.065735f, 243.44344f, 116.91f, 245.15f),
                    PathNode.CurveTo(119.754265f, 246.85657f, 123.44344f, 245.93427f, 125.15f, 243.09f),
                    PathNode.LineTo(149.15f, 203.09f),
                    PathNode.CurveTo(150.2642f, 201.23547f, 150.29372f, 198.92473f, 149.22723f, 197.04236f),
                    PathNode.CurveTo(148.16077f, 195.15999f, 146.16348f, 193.99754f, 144.0f, 194.0f),
                    PathNode.LineTo(114.6f, 194.0f),
                    PathNode.LineTo(131.4f, 166.0f),
                    PathNode.LineTo(156.0f, 166.0f),
                    PathNode.CurveTo(196.86908f, 166.0f, 230.0f, 132.86906f, 230.0f, 92.0f),
                    PathNode.CurveTo(230.0f, 51.130928f, 196.86908f, 18.0f, 156.0f, 18.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 154.0f),
                    PathNode.LineTo(76.0f, 154.0f),
                    PathNode.CurveTo(61.677025f, 153.98296f, 48.580406f, 145.91377f, 42.124397f, 133.12833f),
                    PathNode.CurveTo(35.668392f, 120.342865f, 36.949905f, 105.01345f, 45.439148f, 93.477394f),
                    PathNode.CurveTo(53.92839f, 81.94134f, 68.18301f, 76.15867f, 82.31f, 78.52f),
                    PathNode.CurveTo(82.57156f, 78.56199f, 82.835335f, 78.5887f, 83.1f, 78.6f),
                    PathNode.CurveTo(82.54478f, 81.590744f, 82.17739f, 84.61333f, 82.0f, 87.65f),
                    PathNode.CurveTo(81.8067f, 90.96371f, 84.33629f, 93.8067f, 87.65f, 94.0f),
                    PathNode.CurveTo(90.96371f, 94.1933f, 93.8067f, 91.66371f, 94.0f, 88.35f),
                    PathNode.CurveTo(95.95538f, 54.604168f, 124.55795f, 28.629622f, 158.33553f, 29.925648f),
                    PathNode.CurveTo(192.11311f, 31.221674f, 218.64125f, 59.311558f, 218.00508f, 93.108f),
                    PathNode.CurveTo(217.36891f, 126.90445f, 189.80243f, 153.97607f, 156.0f, 154.0f),
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
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
