package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BellRinging: ImageVector
    get() {
        if (_bellRinging != null) return _bellRinging!!
        _bellRinging = phosphorBoldIcon(
            name = "BellRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 225.810 74.650 C 224.110 75.539 222.219 76.002 220.300 76.000 C 215.813 76.008 211.698 73.512 209.630 69.530 C 202.336 55.076 191.282 42.854 177.630 34.150 C 173.869 31.926 171.614 27.833 171.744 23.466 C 171.873 19.098 174.366 15.146 178.252 13.148 C 182.138 11.151 186.803 11.423 190.430 13.860 C 207.663 24.873 221.655 40.273 230.970 58.480 C 232.431 61.308 232.707 64.601 231.740 67.634 C 230.772 70.667 228.639 73.190 225.810 74.650 ZM 46.370 69.530 C 53.664 55.076 64.718 42.854 78.370 34.150 C 82.216 31.972 84.554 27.855 84.454 23.436 C 84.354 19.017 81.832 15.011 77.891 13.009 C 73.950 11.007 69.228 11.334 65.600 13.860 C 48.367 24.873 34.375 40.273 25.060 58.480 C 22.014 64.362 24.310 71.600 30.190 74.650 C 31.890 75.539 33.781 76.002 35.700 76.000 C 40.187 76.008 44.302 73.512 46.370 69.530 ZM 219.880 167.880 C 224.484 173.923 225.266 182.053 221.899 188.864 C 218.532 195.674 211.597 199.989 204.000 200.000 L 171.810 200.000 C 169.701 222.620 150.718 239.915 128.000 239.915 C 105.282 239.915 86.299 222.620 84.190 200.000 L 52.000 200.000 C 44.397 200.000 37.452 195.690 34.077 188.877 C 30.703 182.065 31.483 173.928 36.090 167.880 C 43.260 158.550 51.820 141.260 51.970 111.940 C 51.987 69.958 86.033 35.938 128.015 35.955 C 169.997 35.972 204.017 70.018 204.000 112.000 C 204.150 141.260 212.710 158.550 219.880 167.880 ZM 147.600 200.000 L 108.400 200.000 C 110.293 209.321 118.488 216.020 128.000 216.020 C 137.512 216.020 145.707 209.321 147.600 200.000 ZM 196.340 176.000 C 188.180 163.000 180.150 142.430 180.000 112.060 C 180.017 83.341 156.749 60.047 128.030 60.030 C 99.311 60.013 76.017 83.281 76.000 112.000 C 75.850 142.420 67.820 163.000 59.660 176.000 Z"),
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
        return _bellRinging!!
    }

private var _bellRinging: ImageVector? = null
