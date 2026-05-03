package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GearFine: ImageVector
    get() {
        if (_gearFine != null) return _gearFine!!
        _gearFine = phosphorFillIcon(
            name = "GearFine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 120.0f),
                    PathNode.LineTo(223.66f, 120.0f),
                    PathNode.CurveTo(222.72456f, 108.59179f, 219.73662f, 97.44627f, 214.84f, 87.1f),
                    PathNode.LineTo(222.07f, 82.93f),
                    PathNode.CurveTo(225.89734f, 80.72086f, 227.20914f, 75.82733f, 225.0f, 72.0f),
                    PathNode.CurveTo(222.79086f, 68.17267f, 217.89734f, 66.86086f, 214.07f, 69.07f),
                    PathNode.LineTo(206.82f, 73.26f),
                    PathNode.CurveTo(200.27614f, 63.876133f, 192.12387f, 55.723858f, 182.74f, 49.18f),
                    PathNode.LineTo(186.93f, 41.93f),
                    PathNode.CurveTo(189.13914f, 38.102665f, 187.82733f, 33.20914f, 184.0f, 31.0f),
                    PathNode.CurveTo(180.17267f, 28.790861f, 175.27916f, 30.102667f, 173.07f, 33.93f),
                    PathNode.LineTo(168.9f, 41.16f),
                    PathNode.CurveTo(158.55373f, 36.26338f, 147.4082f, 33.275436f, 136.0f, 32.34f),
                    PathNode.LineTo(136.0f, 24.0f),
                    PathNode.CurveTo(136.0f, 19.581722f, 132.41827f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(123.58172f, 16.0f, 120.0f, 19.581722f, 120.0f, 24.0f),
                    PathNode.LineTo(120.0f, 32.34f),
                    PathNode.CurveTo(108.59179f, 33.275436f, 97.44627f, 36.26338f, 87.1f, 41.16f),
                    PathNode.LineTo(82.93f, 33.93f),
                    PathNode.CurveTo(80.72086f, 30.102667f, 75.82733f, 28.790861f, 72.0f, 31.0f),
                    PathNode.CurveTo(68.17267f, 33.20914f, 66.86086f, 38.102665f, 69.07f, 41.93f),
                    PathNode.LineTo(73.26f, 49.18f),
                    PathNode.CurveTo(63.876133f, 55.723858f, 55.723858f, 63.876133f, 49.18f, 73.26f),
                    PathNode.LineTo(41.93f, 69.07f),
                    PathNode.CurveTo(38.102665f, 66.86086f, 33.20914f, 68.17267f, 31.0f, 72.0f),
                    PathNode.CurveTo(28.790861f, 75.82733f, 30.102667f, 80.72086f, 33.93f, 82.93f),
                    PathNode.LineTo(41.16f, 87.1f),
                    PathNode.CurveTo(36.26338f, 97.44627f, 33.275436f, 108.59179f, 32.34f, 120.0f),
                    PathNode.LineTo(24.0f, 120.0f),
                    PathNode.CurveTo(19.581722f, 120.0f, 16.0f, 123.58172f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 132.41827f, 19.581722f, 136.0f, 24.0f, 136.0f),
                    PathNode.LineTo(32.34f, 136.0f),
                    PathNode.CurveTo(33.275436f, 147.4082f, 36.26338f, 158.55373f, 41.16f, 168.9f),
                    PathNode.LineTo(33.93f, 173.07f),
                    PathNode.CurveTo(30.792362f, 174.87964f, 29.262054f, 178.57162f, 30.199417f, 182.07031f),
                    PathNode.CurveTo(31.136778f, 185.56902f, 34.307907f, 188.0014f, 37.93f, 188.0f),
                    PathNode.CurveTo(39.334625f, 188.00435f, 40.71514f, 187.63506f, 41.93f, 186.93f),
                    PathNode.LineTo(49.18f, 182.74f),
                    PathNode.CurveTo(55.723858f, 192.12387f, 63.876133f, 200.27614f, 73.26f, 206.82f),
                    PathNode.LineTo(69.07f, 214.07f),
                    PathNode.CurveTo(66.86086f, 217.89734f, 68.17267f, 222.79086f, 72.0f, 225.0f),
                    PathNode.CurveTo(75.82733f, 227.20914f, 80.72086f, 225.89734f, 82.93f, 222.07f),
                    PathNode.LineTo(87.1f, 214.84f),
                    PathNode.CurveTo(97.44627f, 219.73662f, 108.59179f, 222.72456f, 120.0f, 223.66f),
                    PathNode.LineTo(120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 236.41827f, 123.58172f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(132.41827f, 240.0f, 136.0f, 236.41827f, 136.0f, 232.0f),
                    PathNode.LineTo(136.0f, 223.66f),
                    PathNode.CurveTo(147.4082f, 222.72456f, 158.55373f, 219.73662f, 168.9f, 214.84f),
                    PathNode.LineTo(173.07f, 222.07f),
                    PathNode.CurveTo(175.27916f, 225.89734f, 180.17267f, 227.20914f, 184.0f, 225.0f),
                    PathNode.CurveTo(187.82733f, 222.79086f, 189.13914f, 217.89734f, 186.93f, 214.07f),
                    PathNode.LineTo(182.74f, 206.82f),
                    PathNode.CurveTo(192.12387f, 200.27614f, 200.27614f, 192.12387f, 206.82f, 182.74f),
                    PathNode.LineTo(214.07f, 186.93f),
                    PathNode.CurveTo(215.90785f, 187.99129f, 218.0921f, 188.27881f, 220.14198f, 187.7293f),
                    PathNode.CurveTo(222.19188f, 187.17978f, 223.93942f, 185.83827f, 225.0f, 184.0f),
                    PathNode.CurveTo(227.21175f, 180.17538f, 225.90445f, 175.282f, 222.08f, 173.07f),
                    PathNode.LineTo(214.85f, 168.9f),
                    PathNode.CurveTo(219.74661f, 158.55373f, 222.73456f, 147.4082f, 223.67f, 136.0f),
                    PathNode.LineTo(232.0f, 136.0f),
                    PathNode.CurveTo(236.41827f, 136.0f, 240.0f, 132.41827f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 123.58172f, 236.41827f, 120.0f, 232.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 128.0f),
                    PathNode.CurveTo(71.991646f, 110.82832f, 79.8746f, 94.605225f, 93.38f, 84.0f),
                    PathNode.LineTo(118.76f, 128.0f),
                    PathNode.LineTo(93.38f, 172.0f),
                    PathNode.CurveTo(79.8746f, 161.39478f, 71.991646f, 145.17168f, 72.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(120.881294f, 184.00754f, 113.82721f, 182.64967f, 107.22f, 180.0f),
                    PathNode.LineTo(132.62f, 136.0f),
                    PathNode.LineTo(183.42f, 136.0f),
                    PathNode.CurveTo(179.40733f, 163.53015f, 155.82101f, 183.95857f, 128.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.62f, 120.0f),
                    PathNode.LineTo(107.22f, 76.0f),
                    PathNode.CurveTo(123.15778f, 69.63304f, 141.1351f, 70.925964f, 155.99776f, 79.50807f),
                    PathNode.CurveTo(170.86041f, 88.09019f, 180.96703f, 103.01371f, 183.42f, 120.0f),
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
        return _gearFine!!
    }

private var _gearFine: ImageVector? = null
