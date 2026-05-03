package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BellSimpleRinging: ImageVector
    get() {
        if (_bellSimpleRinging != null) return _bellSimpleRinging!!
        _bellSimpleRinging = phosphorBoldIcon(
            name = "BellSimpleRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 228.000 C 172.000 234.627 166.627 240.000 160.000 240.000 L 96.000 240.000 C 89.373 240.000 84.000 234.627 84.000 228.000 C 84.000 221.373 89.373 216.000 96.000 216.000 L 160.000 216.000 C 166.627 216.000 172.000 221.373 172.000 228.000 ZM 230.940 58.480 C 221.625 40.273 207.633 24.873 190.400 13.860 C 186.773 11.423 182.108 11.151 178.222 13.148 C 174.336 15.146 171.843 19.098 171.714 23.466 C 171.584 27.833 173.839 31.926 177.600 34.150 C 191.252 42.854 202.306 55.076 209.600 69.530 C 211.672 73.521 215.803 76.019 220.300 76.000 C 222.219 76.002 224.110 75.539 225.810 74.650 C 231.690 71.600 233.986 64.362 230.940 58.480 ZM 46.370 69.530 C 53.664 55.076 64.718 42.854 78.370 34.150 C 82.216 31.972 84.554 27.855 84.454 23.436 C 84.354 19.017 81.832 15.011 77.891 13.009 C 73.950 11.007 69.228 11.334 65.600 13.860 C 48.367 24.873 34.375 40.273 25.060 58.480 C 22.014 64.362 24.310 71.600 30.190 74.650 C 31.890 75.539 33.781 76.002 35.700 76.000 C 40.187 76.008 44.302 73.512 46.370 69.530 ZM 219.880 167.880 C 224.484 173.923 225.266 182.053 221.899 188.864 C 218.532 195.674 211.597 199.989 204.000 200.000 L 52.000 200.000 C 44.397 200.000 37.452 195.690 34.077 188.877 C 30.703 182.065 31.483 173.928 36.090 167.880 C 43.260 158.550 51.820 141.260 51.970 111.940 C 51.987 69.958 86.033 35.938 128.015 35.955 C 169.997 35.972 204.017 70.018 204.000 112.000 C 204.150 141.260 212.710 158.550 219.880 167.880 ZM 196.340 176.000 C 188.180 163.000 180.150 142.430 180.000 112.060 C 180.017 83.341 156.749 60.047 128.030 60.030 C 99.311 60.013 76.017 83.281 76.000 112.000 C 75.850 142.420 67.820 163.000 59.660 176.000 Z"),
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
        return _bellSimpleRinging!!
    }

private var _bellSimpleRinging: ImageVector? = null
