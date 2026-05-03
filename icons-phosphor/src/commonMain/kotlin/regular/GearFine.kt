package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GearFine: ImageVector
    get() {
        if (_gearFine != null) return _gearFine!!
        _gearFine = phosphorRegularIcon(
            name = "GearFine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 120.0f),
                    PathNode.LineTo(215.63f, 120.0f),
                    PathNode.CurveTo(214.73056f, 109.99975f, 212.11214f, 100.22974f, 207.89f, 91.12f),
                    PathNode.LineTo(222.07f, 82.93f),
                    PathNode.CurveTo(225.89734f, 80.72086f, 227.20914f, 75.82733f, 225.0f, 72.0f),
                    PathNode.CurveTo(222.79086f, 68.17267f, 217.89734f, 66.86086f, 214.07f, 69.07f),
                    PathNode.LineTo(199.87f, 77.27f),
                    PathNode.CurveTo(194.06902f, 69.078995f, 186.921f, 61.930996f, 178.73f, 56.13f),
                    PathNode.LineTo(186.93f, 41.93f),
                    PathNode.CurveTo(189.13914f, 38.102665f, 187.82733f, 33.20914f, 184.0f, 31.0f),
                    PathNode.CurveTo(180.17267f, 28.790861f, 175.27916f, 30.102667f, 173.07f, 33.93f),
                    PathNode.LineTo(164.88f, 48.11f),
                    PathNode.CurveTo(155.77025f, 43.887856f, 146.00024f, 41.269436f, 136.0f, 40.37f),
                    PathNode.LineTo(136.0f, 24.0f),
                    PathNode.CurveTo(136.0f, 19.581722f, 132.41827f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(123.58172f, 16.0f, 120.0f, 19.581722f, 120.0f, 24.0f),
                    PathNode.LineTo(120.0f, 40.37f),
                    PathNode.CurveTo(109.99975f, 41.269436f, 100.22974f, 43.887856f, 91.12f, 48.11f),
                    PathNode.LineTo(82.93f, 33.93f),
                    PathNode.CurveTo(80.72086f, 30.102667f, 75.82733f, 28.790861f, 72.0f, 31.0f),
                    PathNode.CurveTo(68.17267f, 33.20914f, 66.86086f, 38.102665f, 69.07f, 41.93f),
                    PathNode.LineTo(77.27f, 56.13f),
                    PathNode.CurveTo(69.078995f, 61.930996f, 61.930996f, 69.078995f, 56.13f, 77.27f),
                    PathNode.LineTo(41.93f, 69.07f),
                    PathNode.CurveTo(38.102665f, 66.86086f, 33.20914f, 68.17267f, 31.0f, 72.0f),
                    PathNode.CurveTo(28.790861f, 75.82733f, 30.102667f, 80.72086f, 33.93f, 82.93f),
                    PathNode.LineTo(48.11f, 91.12f),
                    PathNode.CurveTo(43.887856f, 100.22974f, 41.269436f, 109.99975f, 40.37f, 120.0f),
                    PathNode.LineTo(24.0f, 120.0f),
                    PathNode.CurveTo(19.581722f, 120.0f, 16.0f, 123.58172f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 132.41827f, 19.581722f, 136.0f, 24.0f, 136.0f),
                    PathNode.LineTo(40.37f, 136.0f),
                    PathNode.CurveTo(41.269436f, 146.00024f, 43.887856f, 155.77025f, 48.11f, 164.88f),
                    PathNode.LineTo(33.93f, 173.07f),
                    PathNode.CurveTo(30.792362f, 174.87964f, 29.262054f, 178.57162f, 30.199417f, 182.07031f),
                    PathNode.CurveTo(31.136778f, 185.56902f, 34.307907f, 188.0014f, 37.93f, 188.0f),
                    PathNode.CurveTo(39.334625f, 188.00435f, 40.71514f, 187.63506f, 41.93f, 186.93f),
                    PathNode.LineTo(56.13f, 178.73f),
                    PathNode.CurveTo(61.930996f, 186.921f, 69.078995f, 194.06902f, 77.27f, 199.87f),
                    PathNode.LineTo(69.07f, 214.07f),
                    PathNode.CurveTo(66.86086f, 217.89734f, 68.17267f, 222.79086f, 72.0f, 225.0f),
                    PathNode.CurveTo(75.82733f, 227.20914f, 80.72086f, 225.89734f, 82.93f, 222.07f),
                    PathNode.LineTo(91.12f, 207.89f),
                    PathNode.CurveTo(100.22974f, 212.11214f, 109.99975f, 214.73056f, 120.0f, 215.63f),
                    PathNode.LineTo(120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 236.41827f, 123.58172f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(132.41827f, 240.0f, 136.0f, 236.41827f, 136.0f, 232.0f),
                    PathNode.LineTo(136.0f, 215.63f),
                    PathNode.CurveTo(146.00024f, 214.73056f, 155.77025f, 212.11214f, 164.88f, 207.89f),
                    PathNode.LineTo(173.07f, 222.07f),
                    PathNode.CurveTo(175.27916f, 225.89734f, 180.17267f, 227.20914f, 184.0f, 225.0f),
                    PathNode.CurveTo(187.82733f, 222.79086f, 189.13914f, 217.89734f, 186.93f, 214.07f),
                    PathNode.LineTo(178.73f, 199.87f),
                    PathNode.CurveTo(186.921f, 194.06902f, 194.06902f, 186.921f, 199.87f, 178.73f),
                    PathNode.LineTo(214.07f, 186.93f),
                    PathNode.CurveTo(215.90785f, 187.99129f, 218.0921f, 188.27881f, 220.14198f, 187.7293f),
                    PathNode.CurveTo(222.19188f, 187.17978f, 223.93942f, 185.83827f, 225.0f, 184.0f),
                    PathNode.CurveTo(227.21175f, 180.17538f, 225.90445f, 175.282f, 222.08f, 173.07f),
                    PathNode.LineTo(207.9f, 164.88f),
                    PathNode.CurveTo(212.1187f, 155.76964f, 214.73372f, 145.99963f, 215.63f, 136.0f),
                    PathNode.LineTo(232.0f, 136.0f),
                    PathNode.CurveTo(236.41827f, 136.0f, 240.0f, 132.41827f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 123.58172f, 236.41827f, 120.0f, 232.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(164.64941f, 56.043575f, 195.4317f, 83.58154f, 199.54f, 120.0f),
                    PathNode.LineTo(132.62f, 120.0f),
                    PathNode.LineTo(99.16f, 62.05f),
                    PathNode.CurveTo(108.24969f, 58.054955f, 118.07111f, 55.994637f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 128.0f),
                    PathNode.CurveTo(56.01239f, 105.12749f, 66.891594f, 83.62149f, 85.31f, 70.06f),
                    PathNode.LineTo(118.76f, 128.0f),
                    PathNode.LineTo(85.31f, 185.94f),
                    PathNode.CurveTo(66.891594f, 172.37851f, 56.01239f, 150.87251f, 56.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(118.07465f, 200.02112f, 108.25337f, 197.97786f, 99.16f, 194.0f),
                    PathNode.LineTo(132.62f, 136.0f),
                    PathNode.LineTo(199.54f, 136.0f),
                    PathNode.CurveTo(195.4317f, 172.41846f, 164.64941f, 199.95642f, 128.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gearFine!!
    }

private var _gearFine: ImageVector? = null
