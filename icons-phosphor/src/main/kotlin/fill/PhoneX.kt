package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneX: ImageVector
    get() {
        if (_phoneX != null) return _phoneX!!
        _phoneX = phosphorFillIcon(
            name = "PhoneX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 146.340 98.340 L 164.690 80.000 L 146.340 61.660 C 143.214 58.534 143.214 53.466 146.340 50.340 C 149.466 47.214 154.534 47.214 157.660 50.340 L 176.000 68.690 L 194.340 50.340 C 197.466 47.214 202.534 47.214 205.660 50.340 C 208.786 53.466 208.786 58.534 205.660 61.660 L 187.320 80.000 L 205.660 98.340 C 208.786 101.466 208.786 106.534 205.660 109.660 C 202.534 112.786 197.466 112.786 194.340 109.660 L 176.000 91.310 L 157.660 109.660 C 154.534 112.786 149.466 112.786 146.340 109.660 C 143.214 106.534 143.214 101.466 146.340 98.340 ZM 214.340 166.460 L 167.230 145.350 L 167.100 145.290 C 162.131 143.165 156.426 143.691 151.930 146.690 C 151.669 146.862 151.419 147.049 151.180 147.250 L 126.870 168.000 C 111.450 160.510 95.530 144.710 88.040 129.490 L 108.820 104.780 C 109.020 104.530 109.210 104.280 109.390 104.010 C 112.323 99.528 112.819 93.874 110.710 88.950 L 110.710 88.830 L 89.540 41.640 C 86.721 35.135 79.957 31.261 72.920 32.120 C 44.889 35.809 23.949 59.727 24.000 88.000 C 24.000 167.400 88.600 232.000 168.000 232.000 C 196.273 232.051 220.191 211.111 223.880 183.080 C 224.741 176.045 220.871 169.282 214.370 166.460 Z"),
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
        return _phoneX!!
    }

private var _phoneX: ImageVector? = null
