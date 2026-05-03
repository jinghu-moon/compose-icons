package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneTransfer: ImageVector
    get() {
        if (_phoneTransfer != null) return _phoneTransfer!!
        _phoneTransfer = phosphorFillIcon(
            name = "PhoneTransfer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 72.000 C 136.000 67.582 139.582 64.000 144.000 64.000 L 196.690 64.000 L 178.340 45.660 C 175.214 42.534 175.214 37.466 178.340 34.340 C 181.466 31.214 186.534 31.214 189.660 34.340 L 221.660 66.340 C 223.162 67.841 224.006 69.877 224.006 72.000 C 224.006 74.123 223.162 76.159 221.660 77.660 L 189.660 109.660 C 186.534 112.786 181.466 112.786 178.340 109.660 C 175.214 106.534 175.214 101.466 178.340 98.340 L 196.690 80.000 L 144.000 80.000 C 139.582 80.000 136.000 76.418 136.000 72.000 ZM 214.360 166.460 L 167.250 145.350 L 167.140 145.290 C 162.169 143.161 156.458 143.688 151.960 146.690 C 151.699 146.862 151.449 147.049 151.210 147.250 L 126.870 168.000 C 111.450 160.510 95.530 144.710 88.040 129.490 L 108.820 104.780 C 109.020 104.530 109.210 104.280 109.390 104.010 C 112.323 99.528 112.819 93.874 110.710 88.950 L 110.710 88.830 L 89.540 41.640 C 86.718 35.139 79.955 31.269 72.920 32.130 C 44.888 35.810 23.946 59.728 24.000 88.000 C 24.000 167.400 88.600 232.000 168.000 232.000 C 196.272 232.054 220.190 211.112 223.870 183.080 C 224.731 176.045 220.861 169.282 214.360 166.460 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _phoneTransfer!!
    }

private var _phoneTransfer: ImageVector? = null
