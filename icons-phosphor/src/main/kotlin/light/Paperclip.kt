package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorLightIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.25f, 123.76f),
                    PathNode.CurveTo(209.37666f, 124.88541f, 210.0097f, 126.412544f, 210.0097f, 128.005f),
                    PathNode.CurveTo(210.0097f, 129.59746f, 209.37666f, 131.12459f, 208.25f, 132.25f),
                    PathNode.LineTo(126.19f, 214.25f),
                    PathNode.CurveTo(105.09548f, 235.33623f, 70.90123f, 235.32951f, 49.815f, 214.235f),
                    PathNode.CurveTo(28.728767f, 193.14047f, 28.735483f, 158.94623f, 49.83f, 137.86f),
                    PathNode.LineTo(149.1f, 37.14f),
                    PathNode.CurveTo(163.93437f, 22.291824f, 187.99683f, 22.280632f, 202.845f, 37.114998f),
                    PathNode.CurveTo(217.69319f, 51.949368f, 217.70439f, 76.011826f, 202.87f, 90.86f),
                    PathNode.LineTo(103.59f, 191.54f),
                    PathNode.CurveTo(95.00473f, 200.14183f, 81.07184f, 200.15527f, 72.47f, 191.57f),
                    PathNode.CurveTo(63.868164f, 182.98473f, 63.854733f, 169.05183f, 72.44f, 160.45f),
                    PathNode.LineTo(155.72f, 75.78f),
                    PathNode.CurveTo(158.04512f, 73.41622f, 161.84622f, 73.38488f, 164.21f, 75.71f),
                    PathNode.CurveTo(166.57378f, 78.03512f, 166.60512f, 81.83622f, 164.28f, 84.2f),
                    PathNode.LineTo(81.0f, 168.91f),
                    PathNode.CurveTo(77.084305f, 172.80637f, 77.068634f, 179.1393f, 80.965f, 183.055f),
                    PathNode.CurveTo(84.86137f, 186.9707f, 91.1943f, 186.98637f, 95.11f, 183.09f),
                    PathNode.LineTo(194.35f, 82.4f),
                    PathNode.CurveTo(204.51204f, 72.254524f, 204.52547f, 55.792034f, 194.38f, 45.63f),
                    PathNode.CurveTo(184.23453f, 35.46796f, 167.77203f, 35.45453f, 157.61f, 45.6f),
                    PathNode.LineTo(58.33f, 146.28f),
                    PathNode.CurveTo(41.916096f, 162.67458f, 41.90043f, 189.2711f, 58.295f, 205.685f),
                    PathNode.CurveTo(74.689575f, 222.0989f, 101.286095f, 222.11458f, 117.7f, 205.72f),
                    PathNode.LineTo(199.76f, 123.72f),
                    PathNode.CurveTo(200.89072f, 122.598625f, 202.42084f, 121.97275f, 204.01329f, 121.980255f),
                    PathNode.CurveTo(205.60576f, 121.987755f, 207.12991f, 122.62802f, 208.25f, 123.76f),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
