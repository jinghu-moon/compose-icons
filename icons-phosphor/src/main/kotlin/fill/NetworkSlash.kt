package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NetworkSlash: ImageVector
    get() {
        if (_networkSlash != null) return _networkSlash!!
        _networkSlash = phosphorFillIcon(
            name = "NetworkSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(98.08f, 59.41f),
                    PathNode.CurveTo(96.73481f, 57.930054f, 95.99273f, 55.99993f, 96.0f, 54.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.CurveTo(96.0f, 31.163445f, 103.163445f, 24.0f, 112.0f, 24.0f),
                    PathNode.LineTo(144.0f, 24.0f),
                    PathNode.CurveTo(152.83656f, 24.0f, 160.0f, 31.163445f, 160.0f, 40.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.CurveTo(160.0f, 80.836555f, 152.83656f, 88.0f, 144.0f, 88.0f),
                    PathNode.LineTo(127.61f, 88.0f),
                    PathNode.CurveTo(125.35566f, 87.99978f, 123.20605f, 87.04843f, 121.69f, 85.38f),
                    PathNode.Close,
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(102.64f, 112.0f),
                    PathNode.LineTo(24.0f, 112.0f),
                    PathNode.CurveTo(19.581722f, 112.0f, 16.0f, 115.58172f, 16.0f, 120.0f),
                    PathNode.CurveTo(16.0f, 124.41828f, 19.581722f, 128.0f, 24.0f, 128.0f),
                    PathNode.LineTo(56.0f, 128.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.CurveTo(39.163445f, 160.0f, 32.0f, 167.16344f, 32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.CurveTo(88.836555f, 224.0f, 96.0f, 216.83656f, 96.0f, 208.0f),
                    PathNode.LineTo(96.0f, 176.0f),
                    PathNode.CurveTo(96.0f, 167.16344f, 88.836555f, 160.0f, 80.0f, 160.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.LineTo(117.19f, 128.0f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 112.0f),
                    PathNode.LineTo(164.0f, 112.0f),
                    PathNode.CurveTo(159.58173f, 112.0f, 156.0f, 115.58172f, 156.0f, 120.0f),
                    PathNode.CurveTo(156.0f, 124.41828f, 159.58173f, 128.0f, 164.0f, 128.0f),
                    PathNode.LineTo(184.0f, 128.0f),
                    PathNode.LineTo(184.0f, 150.83f),
                    PathNode.CurveTo(184.0f, 155.24828f, 187.58173f, 158.83f, 192.0f, 158.83f),
                    PathNode.CurveTo(196.41827f, 158.83f, 200.0f, 155.24828f, 200.0f, 150.83f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.LineTo(232.0f, 128.0f),
                    PathNode.CurveTo(236.41827f, 128.0f, 240.0f, 124.41828f, 240.0f, 120.0f),
                    PathNode.CurveTo(240.0f, 115.58172f, 236.41827f, 112.0f, 232.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _networkSlash!!
    }

private var _networkSlash: ImageVector? = null
