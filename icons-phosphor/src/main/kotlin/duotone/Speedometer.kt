package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorDuotoneIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 152.000 C 232.013 163.794 230.017 175.505 226.100 186.630 C 224.979 189.850 221.940 192.006 218.530 192.000 L 37.460 192.000 C 34.044 191.985 31.010 189.817 29.890 186.590 C 25.891 175.220 23.898 163.242 24.000 151.190 C 24.440 94.000 71.730 47.490 129.000 48.000 C 186.047 48.549 232.003 94.951 232.000 152.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 114.340 154.340 L 210.340 58.340 C 213.466 55.214 218.534 55.214 221.660 58.340 C 224.786 61.466 224.786 66.534 221.660 69.660 L 125.660 165.660 C 122.534 168.786 117.466 168.786 114.340 165.660 C 111.214 162.534 111.214 157.466 114.340 154.340 ZM 128.000 88.000 C 134.949 87.991 141.853 89.116 148.440 91.330 C 151.162 92.295 154.193 91.718 156.370 89.821 C 158.547 87.923 159.532 85.000 158.948 82.172 C 158.364 79.343 156.301 77.050 153.550 76.170 C 127.640 67.435 99.064 72.538 77.779 89.700 C 56.493 106.863 45.447 133.707 48.490 160.880 C 48.938 164.929 52.357 167.994 56.430 168.000 C 56.720 168.000 57.020 168.000 57.320 167.950 C 61.710 167.463 64.875 163.510 64.390 159.120 C 64.130 156.756 63.999 154.379 64.000 152.000 C 64.039 116.670 92.670 88.039 128.000 88.000 ZM 227.740 101.000 C 225.724 97.068 220.902 95.514 216.970 97.530 C 213.038 99.546 211.484 104.368 213.500 108.300 C 225.461 131.788 227.268 159.153 218.500 184.010 L 37.400 183.940 C 27.148 154.553 31.741 122.022 49.728 96.621 C 67.715 71.221 96.876 56.087 128.000 56.000 L 128.880 56.000 C 143.779 56.094 158.448 59.691 171.700 66.500 C 174.253 67.905 177.367 67.811 179.830 66.254 C 182.294 64.698 183.716 61.926 183.543 59.017 C 183.370 56.109 181.630 53.524 179.000 52.270 C 163.528 44.311 146.399 40.107 129.000 40.000 L 128.000 40.000 C 91.661 40.014 57.585 57.651 36.589 87.311 C 15.594 116.971 10.286 154.972 22.350 189.250 C 24.603 195.671 30.655 199.977 37.460 200.000 L 218.530 200.000 C 225.331 200.004 231.391 195.709 233.640 189.290 C 243.837 160.289 241.704 128.377 227.740 100.990 Z"),
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
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
