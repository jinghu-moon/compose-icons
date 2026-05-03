package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorFillIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 156.000 176.000 L 156.000 152.000 L 176.000 152.000 L 176.000 168.000 C 176.000 172.418 172.418 176.000 168.000 176.000 ZM 140.000 176.000 L 140.000 152.000 L 116.000 152.000 L 116.000 176.000 ZM 176.000 88.000 C 176.000 83.582 172.418 80.000 168.000 80.000 L 88.000 80.000 C 83.582 80.000 80.000 83.582 80.000 88.000 L 80.000 136.000 L 176.000 136.000 ZM 152.000 24.000 L 104.000 24.000 C 64.235 24.000 32.000 56.235 32.000 96.000 L 32.000 208.000 C 32.000 212.418 35.582 216.000 40.000 216.000 L 76.580 216.000 C 78.096 216.001 79.482 215.145 80.160 213.790 L 91.060 192.000 L 88.000 192.000 C 74.745 192.000 64.000 181.255 64.000 168.000 L 64.000 88.000 C 64.000 74.745 74.745 64.000 88.000 64.000 L 168.000 64.000 C 181.255 64.000 192.000 74.745 192.000 88.000 L 192.000 168.000 C 192.000 181.255 181.255 192.000 168.000 192.000 L 164.940 192.000 L 175.840 213.790 C 176.518 215.145 177.904 216.001 179.420 216.000 L 216.000 216.000 C 220.418 216.000 224.000 212.418 224.000 208.000 L 224.000 96.000 C 224.000 56.235 191.764 24.000 152.000 24.000 ZM 147.060 192.000 L 108.940 192.000 L 99.840 210.210 C 99.219 211.450 99.285 212.924 100.015 214.104 C 100.744 215.283 102.033 216.001 103.420 216.000 L 152.580 216.000 C 153.967 216.001 155.256 215.283 155.985 214.104 C 156.714 212.924 156.781 211.450 156.160 210.210 ZM 80.000 168.000 C 80.000 172.418 83.582 176.000 88.000 176.000 L 100.000 176.000 L 100.000 152.000 L 80.000 152.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _subway!!
    }

private var _subway: ImageVector? = null
