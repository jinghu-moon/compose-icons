package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorFillIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 161.94f),
                    PathNode.LineTo(120.0f, 227.28f),
                    PathNode.CurveTo(120.00761f, 228.4256f, 119.52364f, 229.51947f, 118.67078f, 230.28436f),
                    PathNode.CurveTo(117.81792f, 231.04927f, 116.67802f, 231.41177f, 115.54f, 231.28f),
                    PathNode.CurveTo(77.89351f, 226.65645f, 45.726166f, 201.95653f, 31.54f, 166.78f),
                    PathNode.CurveTo(31.118843f, 165.71791f, 31.171974f, 164.5264f, 31.685995f, 163.50601f),
                    PathNode.CurveTo(32.200012f, 162.48561f, 33.12585f, 161.73373f, 34.23f, 161.44f),
                    PathNode.LineTo(97.32f, 144.5f),
                    PathNode.CurveTo(98.97583f, 144.06549f, 100.72461f, 144.73283f, 101.67f, 146.16f),
                    PathNode.CurveTo(105.48998f, 151.68613f, 110.94033f, 155.8814f, 117.26f, 158.16f),
                    PathNode.CurveTo(118.890175f, 158.70103f, 119.992966f, 160.2224f, 120.0f, 161.94f),
                    PathNode.Close,
                    PathNode.MoveTo(128.06f, 24.0f),
                    PathNode.CurveTo(125.927895f, 23.984009f, 123.87761f, 24.8198f, 122.36432f, 26.321827f),
                    PathNode.CurveTo(120.85103f, 27.823854f, 119.99994f, 29.867832f, 120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 88.0f),
                    PathNode.CurveTo(119.96672f, 92.38132f, 123.48872f, 95.9615f, 127.87f, 96.0f),
                    PathNode.CurveTo(143.47003f, 95.932686f, 156.84518f, 107.1242f, 159.53046f, 122.49153f),
                    PathNode.CurveTo(162.21571f, 137.85887f, 153.42844f, 152.923f, 138.73f, 158.15f),
                    PathNode.CurveTo(137.10031f, 158.69566f, 136.0013f, 160.22137f, 136.0f, 161.94f),
                    PathNode.LineTo(136.0f, 227.28f),
                    PathNode.CurveTo(135.99274f, 228.42365f, 136.47536f, 229.5157f, 137.32591f, 230.28024f),
                    PathNode.CurveTo(138.17647f, 231.04478f, 139.3136f, 231.40869f, 140.45f, 231.28f),
                    PathNode.CurveTo(195.16362f, 224.80888f, 235.33688f, 176.79121f, 232.0495f, 121.79441f),
                    PathNode.CurveTo(228.7621f, 66.7976f, 183.15489f, 23.907402f, 128.06f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.06f, 125.49f),
                    PathNode.CurveTo(96.43231f, 120.76451f, 97.84979f, 116.180756f, 100.21f, 112.07f),
                    PathNode.LineTo(100.21f, 112.0f),
                    PathNode.CurveTo(101.83107f, 109.20008f, 101.60611f, 105.6994f, 99.64f, 103.13f),
                    PathNode.CurveTo(98.96743f, 102.26573f, 98.1316f, 101.54202f, 97.18f, 101.0f),
                    PathNode.LineTo(48.85f, 73.06f),
                    PathNode.CurveTo(47.010933f, 71.99954f, 44.82578f, 71.71354f, 42.77574f, 72.26497f),
                    PathNode.CurveTo(40.7257f, 72.81639f, 38.978897f, 74.160034f, 37.92f, 76.0f),
                    PathNode.CurveTo(26.28109f, 96.15767f, 21.732286f, 119.634f, 25.0f, 142.68f),
                    PathNode.CurveTo(25.155973f, 143.81786f, 25.793516f, 144.83377f, 26.750296f, 145.46907f),
                    PathNode.CurveTo(27.707079f, 146.10437f, 28.890778f, 146.29776f, 30.0f, 146.0f),
                    PathNode.LineTo(93.22f, 129.0f),
                    PathNode.CurveTo(94.8254f, 128.55635f, 95.9784f, 127.15113f, 96.1f, 125.49f),
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
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
