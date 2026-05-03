package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ReadCvLogo: ImageVector
    get() {
        if (_readCvLogo != null) return _readCvLogo!!
        _readCvLogo = phosphorBoldIcon(
            name = "ReadCvLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 211.480 35.320 L 81.230 12.320 C 76.005 11.396 70.627 12.585 66.280 15.628 C 61.932 18.670 58.972 23.315 58.050 28.540 L 28.300 197.540 C 26.387 208.414 33.648 218.780 44.520 220.700 L 174.770 243.700 L 174.770 243.700 C 175.932 243.906 177.110 244.010 178.290 244.010 C 188.008 244.015 196.324 237.033 198.000 227.460 L 227.750 58.460 C 228.662 53.234 227.460 47.860 224.408 43.520 C 221.357 39.180 216.706 36.230 211.480 35.320 ZM 175.000 219.360 L 52.630 197.750 L 81.000 36.640 L 203.370 58.250 ZM 91.900 67.000 C 93.053 60.476 99.275 56.120 105.800 57.270 L 173.000 69.140 C 179.236 70.096 183.666 75.717 183.139 82.004 C 182.612 88.290 177.308 93.095 171.000 93.000 C 170.296 92.999 169.594 92.939 168.900 92.820 L 101.630 80.900 C 95.106 79.747 90.750 73.525 91.900 67.000 ZM 85.000 106.390 C 85.553 103.255 87.330 100.468 89.939 98.643 C 92.548 96.818 95.775 96.105 98.910 96.660 L 166.130 108.540 C 172.246 109.641 176.509 115.230 175.955 121.419 C 175.402 127.609 170.214 132.352 164.000 132.350 C 163.296 132.349 162.594 132.289 161.900 132.170 L 94.690 120.290 C 88.182 119.118 83.848 112.902 85.000 106.390 ZM 78.000 145.780 C 79.153 139.256 85.375 134.900 91.900 136.050 L 125.540 142.000 C 131.671 143.074 135.963 148.658 135.424 154.859 C 134.885 161.060 129.694 165.820 123.470 165.820 C 122.766 165.820 122.063 165.757 121.370 165.630 L 87.760 159.700 C 84.617 159.154 81.821 157.378 79.990 154.766 C 78.158 152.155 77.442 148.921 78.000 145.780 Z"),
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
        return _readCvLogo!!
    }

private var _readCvLogo: ImageVector? = null
