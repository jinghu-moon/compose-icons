package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneIncoming: ImageVector
    get() {
        if (_phoneIncoming != null) return _phoneIncoming!!
        _phoneIncoming = phosphorFillIcon(
            name = "PhoneIncoming",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 223.880 183.080 C 220.191 211.111 196.273 232.051 168.000 232.000 C 88.600 232.000 24.000 167.400 24.000 88.000 C 23.949 59.727 44.889 35.809 72.920 32.120 C 79.957 31.261 86.721 35.135 89.540 41.640 L 110.660 88.790 L 110.660 88.910 C 112.794 93.835 112.318 99.501 109.390 104.000 C 109.210 104.270 109.020 104.520 108.820 104.770 L 88.000 129.450 C 95.490 144.670 111.410 160.450 126.830 167.960 L 151.170 147.250 C 151.409 147.049 151.659 146.862 151.920 146.690 C 156.416 143.691 162.121 143.165 167.090 145.290 L 167.220 145.350 L 214.330 166.460 C 220.847 169.269 224.735 176.035 223.880 183.080 ZM 152.000 112.000 L 192.000 112.000 C 196.418 112.000 200.000 108.418 200.000 104.000 C 200.000 99.582 196.418 96.000 192.000 96.000 L 171.320 96.000 L 205.660 61.660 C 208.786 58.534 208.786 53.466 205.660 50.340 C 202.534 47.214 197.466 47.214 194.340 50.340 L 160.000 84.690 L 160.000 64.000 C 160.000 59.582 156.418 56.000 152.000 56.000 C 147.582 56.000 144.000 59.582 144.000 64.000 L 144.000 104.000 C 144.000 108.418 147.582 112.000 152.000 112.000 Z"),
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
        return _phoneIncoming!!
    }

private var _phoneIncoming: ImageVector? = null
