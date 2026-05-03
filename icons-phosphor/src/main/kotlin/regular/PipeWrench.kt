package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PipeWrench: ImageVector
    get() {
        if (_pipeWrench != null) return _pipeWrench!!
        _pipeWrench = phosphorRegularIcon(
            name = "PipeWrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.280 55.000 L 220.110 54.830 L 175.210 12.550 C 168.955 6.408 158.922 6.444 152.710 12.630 L 108.170 56.870 L 106.630 55.310 C 96.767 46.324 81.585 46.667 72.138 56.090 C 62.691 65.513 62.309 80.694 71.270 90.580 L 72.730 92.060 L 52.690 112.000 C 49.689 115.001 48.002 119.071 48.002 123.315 C 48.002 127.559 49.689 131.629 52.690 134.630 L 65.370 147.310 C 71.614 153.533 81.716 153.533 87.960 147.310 L 107.890 127.660 L 120.000 140.000 L 120.000 140.000 L 120.000 140.000 L 55.310 205.370 C 48.493 211.573 45.643 221.024 47.893 229.962 C 50.142 238.900 57.127 245.875 66.068 248.112 C 75.010 250.349 84.456 247.485 90.650 240.660 L 179.320 151.310 C 185.550 145.065 185.550 134.955 179.320 128.710 L 143.630 92.660 L 156.560 80.000 L 156.660 80.090 L 194.000 115.400 C 200.262 121.559 210.318 121.519 216.530 115.310 L 220.240 111.600 C 227.742 104.098 231.956 93.924 231.956 83.315 C 231.956 72.706 227.742 62.532 220.240 55.030 ZM 76.690 136.000 L 64.000 123.330 L 84.000 103.450 L 96.690 116.310 ZM 79.310 229.370 C 77.116 231.970 73.643 233.110 70.334 232.317 C 67.026 231.524 64.448 228.934 63.670 225.621 C 62.893 222.309 64.050 218.842 66.660 216.660 L 131.330 151.290 C 137.540 145.048 137.540 134.962 131.330 128.720 L 82.630 79.310 C 79.594 75.743 79.801 70.443 83.107 67.125 C 86.412 63.806 91.711 63.578 95.290 66.600 L 168.000 140.000 ZM 209.000 100.280 L 205.250 104.000 C 205.202 103.942 205.148 103.888 205.090 103.840 L 167.690 68.500 C 161.426 62.468 151.499 62.521 145.300 68.620 L 132.370 81.290 L 119.430 68.230 L 164.000 24.000 L 164.170 24.160 L 209.050 66.420 C 218.347 75.805 218.311 90.939 208.970 100.280 Z"),
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
        return _pipeWrench!!
    }

private var _pipeWrench: ImageVector? = null
