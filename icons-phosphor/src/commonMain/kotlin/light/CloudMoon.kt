package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = phosphorLightIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 74.0f),
                    PathNode.CurveTo(167.24406f, 73.99945f, 162.49902f, 74.454865f, 157.83f, 75.36f),
                    PathNode.CurveTo(155.79291f, 44.54893f, 133.80785f, 18.712114f, 103.72f, 11.77f),
                    PathNode.CurveTo(101.69772f, 11.302332f, 99.57737f, 11.913093f, 98.11374f, 13.384865f),
                    PathNode.CurveTo(96.65011f, 14.856637f, 96.05112f, 16.980347f, 96.53f, 19.0f),
                    PathNode.CurveTo(100.97689f, 38.47051f, 95.10436f, 58.85987f, 80.98212f, 72.98212f),
                    PathNode.CurveTo(66.85987f, 87.10436f, 46.47051f, 92.97689f, 27.0f, 88.53f),
                    PathNode.CurveTo(24.986214f, 88.06787f, 22.876328f, 88.67438f, 21.415352f, 90.13535f),
                    PathNode.CurveTo(19.954376f, 91.59633f, 19.347872f, 93.706215f, 19.81f, 95.72f),
                    PathNode.CurveTo(24.205004f, 114.66886f, 36.26325f, 130.94568f, 53.11f, 140.67f),
                    PathNode.CurveTo(41.061455f, 155.65547f, 38.673794f, 176.22249f, 46.968792f, 193.56969f),
                    PathNode.CurveTo(55.263786f, 210.91689f, 72.771614f, 221.97038f, 92.0f, 222.0f),
                    PathNode.LineTo(172.0f, 222.0f),
                    PathNode.CurveTo(212.86908f, 222.0f, 246.0f, 188.86908f, 246.0f, 148.0f),
                    PathNode.CurveTo(246.0f, 107.13093f, 212.86908f, 74.0f, 172.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(34.22f, 101.76f),
                    PathNode.QuadTo(37.1f, 102.0f, 40.0f, 102.0f),
                    PathNode.CurveTo(78.641655f, 101.95592f, 109.95592f, 70.641655f, 110.0f, 32.0f),
                    PathNode.CurveTo(110.0f, 30.06f, 109.92f, 28.12f, 109.76f, 26.2f),
                    PathNode.CurveTo(131.30902f, 34.8122f, 145.59186f, 55.50733f, 146.0f, 78.71f),
                    PathNode.CurveTo(125.61906f, 86.34759f, 109.61038f, 102.535355f, 102.2f, 123.0f),
                    PathNode.CurveTo(98.84286f, 122.32066f, 95.42516f, 121.985596f, 92.0f, 122.0f),
                    PathNode.CurveTo(81.235466f, 121.98846f, 70.75768f, 125.46935f, 62.14f, 131.92f),
                    PathNode.CurveTo(49.477444f, 125.59362f, 39.552303f, 114.8722f, 34.22f, 101.76f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 210.0f),
                    PathNode.LineTo(92.0f, 210.0f),
                    PathNode.CurveTo(77.57909f, 209.98918f, 64.40696f, 201.81635f, 57.993416f, 188.9001f),
                    PathNode.CurveTo(51.57987f, 175.98386f, 53.030228f, 160.55022f, 61.73782f, 149.05498f),
                    PathNode.CurveTo(70.44541f, 137.55972f, 84.909546f, 131.98398f, 99.08f, 134.66f),
                    PathNode.CurveTo(98.544235f, 137.63599f, 98.18693f, 140.64136f, 98.01f, 143.66f),
                    PathNode.CurveTo(97.8167f, 146.97371f, 100.34629f, 149.81671f, 103.66f, 150.01f),
                    PathNode.CurveTo(106.97371f, 150.2033f, 109.8167f, 147.6737f, 110.01f, 144.36f),
                    PathNode.CurveTo(110.26279f, 140.22307f, 110.93286f, 136.12224f, 112.01f, 132.12f),
                    PathNode.CurveTo(112.01f, 131.97f, 112.09f, 131.83f, 112.12f, 131.69f),
                    PathNode.CurveTo(120.53969f, 100.65645f, 151.26904f, 81.19398f, 182.9238f, 86.84634f),
                    PathNode.CurveTo(214.57857f, 92.498695f, 236.67308f, 121.39355f, 233.83205f, 153.42323f),
                    PathNode.CurveTo(230.991f, 185.45291f, 204.15544f, 210.00764f, 172.0f, 210.0f),
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
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
