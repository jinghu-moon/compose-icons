package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NetworkSlash: ImageVector
    get() {
        if (_networkSlash != null) return _networkSlash!!
        _networkSlash = phosphorDuotoneIcon(
            name = "NetworkSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 176.0f),
                    PathNode.LineTo(88.0f, 208.0f),
                    PathNode.CurveTo(88.0f, 212.41827f, 84.41828f, 216.0f, 80.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(43.581722f, 216.0f, 40.0f, 212.41827f, 40.0f, 208.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.CurveTo(40.0f, 171.58173f, 43.581722f, 168.0f, 48.0f, 168.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.CurveTo(84.41828f, 168.0f, 88.0f, 171.58173f, 88.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 32.0f),
                    PathNode.LineTo(112.0f, 32.0f),
                    PathNode.CurveTo(107.58172f, 32.0f, 104.0f, 35.581722f, 104.0f, 40.0f),
                    PathNode.LineTo(104.0f, 72.0f),
                    PathNode.CurveTo(104.0f, 76.41828f, 107.58172f, 80.0f, 112.0f, 80.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.CurveTo(148.41827f, 80.0f, 152.0f, 76.41828f, 152.0f, 72.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(152.0f, 35.581722f, 148.41827f, 32.0f, 144.0f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 54.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.CurveTo(96.0f, 31.163445f, 103.163445f, 24.0f, 112.0f, 24.0f),
                    PathNode.LineTo(144.0f, 24.0f),
                    PathNode.CurveTo(152.83656f, 24.0f, 160.0f, 31.163445f, 160.0f, 40.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.CurveTo(160.0f, 80.836555f, 152.83656f, 88.0f, 144.0f, 88.0f),
                    PathNode.LineTo(127.61f, 88.0f),
                    PathNode.CurveTo(123.19172f, 88.0f, 119.61f, 84.41828f, 119.61f, 80.0f),
                    PathNode.CurveTo(119.61f, 75.58172f, 123.19172f, 72.0f, 127.61f, 72.0f),
                    PathNode.LineTo(144.0f, 72.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(112.0f, 40.0f),
                    PathNode.LineTo(112.0f, 54.0f),
                    PathNode.CurveTo(112.0f, 58.418278f, 108.41828f, 62.0f, 104.0f, 62.0f),
                    PathNode.CurveTo(99.58172f, 62.0f, 96.0f, 58.418278f, 96.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.92f, 210.62f),
                    PathNode.CurveTo(215.88303f, 212.7287f, 216.56061f, 215.73003f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(214.82729f, 221.2251f, 212.55025f, 223.29443f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(206.91493f, 224.49586f, 203.9919f, 223.53516f, 202.08f, 221.38f),
                    PathNode.LineTo(117.19f, 128.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.LineTo(80.0f, 160.0f),
                    PathNode.CurveTo(88.836555f, 160.0f, 96.0f, 167.16344f, 96.0f, 176.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(96.0f, 216.83656f, 88.836555f, 224.0f, 80.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.CurveTo(32.0f, 167.16344f, 39.163445f, 160.0f, 48.0f, 160.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.LineTo(56.0f, 128.0f),
                    PathNode.LineTo(24.0f, 128.0f),
                    PathNode.CurveTo(19.581722f, 128.0f, 16.0f, 124.41828f, 16.0f, 120.0f),
                    PathNode.CurveTo(16.0f, 115.58172f, 19.581722f, 112.0f, 24.0f, 112.0f),
                    PathNode.LineTo(102.64f, 112.0f),
                    PathNode.LineTo(42.08f, 45.38f),
                    PathNode.CurveTo(40.116978f, 43.271305f, 39.439384f, 40.26998f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(41.17271f, 34.774906f, 43.44975f, 32.70557f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(49.085068f, 31.50414f, 52.008102f, 32.46484f, 53.92f, 34.62f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 176.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(80.0f, 208.0f),
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
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _networkSlash!!
    }

private var _networkSlash: ImageVector? = null
