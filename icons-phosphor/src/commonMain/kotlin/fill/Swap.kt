package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Swap: ImageVector
    get() {
        if (_swap != null) return _swap!!
        _swap = phosphorFillIcon(
            name = "Swap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(224.0f, 160.83656f, 216.83656f, 168.0f, 208.0f, 168.0f),
                    PathNode.LineTo(112.0f, 168.0f),
                    PathNode.LineTo(112.0f, 184.0f),
                    PathNode.CurveTo(112.00255f, 187.23764f, 110.05338f, 190.15764f, 107.062325f, 191.39697f),
                    PathNode.CurveTo(104.07126f, 192.63632f, 100.62809f, 191.95064f, 98.34f, 189.66f),
                    PathNode.LineTo(74.34f, 165.66f),
                    PathNode.CurveTo(72.83778f, 164.15945f, 71.993706f, 162.12328f, 71.993706f, 160.0f),
                    PathNode.CurveTo(71.993706f, 157.87672f, 72.83778f, 155.84055f, 74.34f, 154.34f),
                    PathNode.LineTo(98.34f, 130.34f),
                    PathNode.CurveTo(100.62809f, 128.04936f, 104.07126f, 127.36368f, 107.062325f, 128.60303f),
                    PathNode.CurveTo(110.05338f, 129.84236f, 112.00255f, 132.76234f, 112.0f, 136.0f),
                    PathNode.LineTo(112.0f, 152.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(96.0f, 48.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(96.0f, 60.418278f, 92.41828f, 64.0f, 88.0f, 64.0f),
                    PathNode.CurveTo(83.58172f, 64.0f, 80.0f, 60.418278f, 80.0f, 56.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.CurveTo(80.0f, 39.163445f, 87.163445f, 32.0f, 96.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 192.0f),
                    PathNode.CurveTo(163.58173f, 192.0f, 160.0f, 195.58173f, 160.0f, 200.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 104.0f),
                    PathNode.LineTo(144.0f, 104.0f),
                    PathNode.LineTo(144.0f, 120.0f),
                    PathNode.CurveTo(143.99745f, 123.237656f, 145.94662f, 126.15764f, 148.93768f, 127.39698f),
                    PathNode.CurveTo(151.92874f, 128.63632f, 155.3719f, 127.95064f, 157.66f, 125.66f),
                    PathNode.LineTo(181.66f, 101.66f),
                    PathNode.CurveTo(183.16223f, 100.159454f, 184.00629f, 98.123276f, 184.00629f, 96.0f),
                    PathNode.CurveTo(184.00629f, 93.876724f, 183.16223f, 91.840546f, 181.66f, 90.34f),
                    PathNode.LineTo(157.66f, 66.34f),
                    PathNode.CurveTo(155.3719f, 64.04936f, 151.92874f, 63.363674f, 148.93768f, 64.60302f),
                    PathNode.CurveTo(145.94662f, 65.84236f, 143.99745f, 68.762344f, 144.0f, 72.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.CurveTo(39.163445f, 88.0f, 32.0f, 95.163445f, 32.0f, 104.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(168.83656f, 224.0f, 176.0f, 216.83656f, 176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.CurveTo(176.0f, 195.58173f, 172.41827f, 192.0f, 168.0f, 192.0f),
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
        return _swap!!
    }

private var _swap: ImageVector? = null
