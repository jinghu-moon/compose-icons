package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorLightIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(183.05f, 58.0f),
                    PathNode.LineTo(72.0f, 58.0f),
                    PathNode.CurveTo(52.86257f, 58.000595f, 34.559826f, 65.83641f, 21.350657f, 79.68412f),
                    PathNode.CurveTo(8.14149f, 93.53183f, 1.177807f, 112.183846f, 2.08f, 131.3f),
                    PathNode.CurveTo(3.72f, 167.0f, 33.0f, 196.24f, 68.62f, 197.92f),
                    PathNode.CurveTo(83.93f, 198.63f, 99.62f, 192.15f, 116.62f, 178.08f),
                    PathNode.CurveTo(123.23571f, 172.60986f, 132.80429f, 172.60986f, 139.42f, 178.08f),
                    PathNode.CurveTo(149.75f, 186.66f, 165.6f, 198.0f, 184.0f, 198.0f),
                    PathNode.CurveTo(202.72742f, 198.00165f, 220.67459f, 190.49915f, 233.82921f, 177.16977f),
                    PathNode.CurveTo(246.98381f, 163.8404f, 254.24881f, 145.79576f, 254.0f, 127.07f),
                    PathNode.CurveTo(253.5f, 89.0f, 221.67f, 58.0f, 183.05f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(225.28f, 168.74f),
                    PathNode.CurveTo(214.41002f, 179.82382f, 199.52435f, 186.04782f, 184.0f, 186.0f),
                    PathNode.CurveTo(169.47f, 186.0f, 156.0f, 176.23f, 147.07f, 168.87f),
                    PathNode.CurveTo(136.0159f, 159.73654f, 120.0341f, 159.73654f, 108.98f, 168.87f),
                    PathNode.LineTo(108.98f, 168.87f),
                    PathNode.CurveTo(94.4f, 180.96f, 81.38f, 186.54f, 69.2f, 185.97f),
                    PathNode.CurveTo(39.42898f, 184.3567f, 15.660904f, 160.56276f, 14.08f, 130.79f),
                    PathNode.CurveTo(13.316863f, 114.94387f, 19.077917f, 99.476776f, 30.0214f, 87.99102f),
                    PathNode.CurveTo(40.96488f, 76.50529f, 56.135506f, 70.00352f, 72.0f, 70.0f),
                    PathNode.LineTo(183.05f, 70.0f),
                    PathNode.CurveTo(215.14f, 70.0f, 241.59f, 95.67f, 242.0f, 127.23f),
                    PathNode.CurveTo(242.2469f, 142.75423f, 236.2183f, 157.72112f, 225.28f, 168.74f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 96.0f),
                    PathNode.CurveTo(182.0f, 99.313705f, 179.3137f, 102.0f, 176.0f, 102.0f),
                    PathNode.LineTo(80.0f, 102.0f),
                    PathNode.CurveTo(76.686295f, 102.0f, 74.0f, 99.313705f, 74.0f, 96.0f),
                    PathNode.CurveTo(74.0f, 92.686295f, 76.686295f, 90.0f, 80.0f, 90.0f),
                    PathNode.LineTo(176.0f, 90.0f),
                    PathNode.CurveTo(179.3137f, 90.0f, 182.0f, 92.686295f, 182.0f, 96.0f),
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
        return _visor!!
    }

private var _visor: ImageVector? = null
