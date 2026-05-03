package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) return _eyeSlash!!
        _eyeSlash = phosphorFillIcon(
            name = "EyeSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 96.680 57.870 C 95.719 56.817 95.391 55.331 95.819 53.971 C 96.248 52.611 97.368 51.582 98.760 51.270 C 108.352 49.078 118.161 47.981 128.000 48.000 C 162.880 48.000 194.570 61.260 219.660 86.350 C 238.490 105.180 246.960 123.970 247.310 124.760 C 248.230 126.829 248.230 129.191 247.310 131.260 C 246.960 132.050 238.490 150.830 219.660 169.660 Q 215.380 173.920 210.870 177.730 C 209.226 179.126 206.770 178.967 205.320 177.370 ZM 213.920 210.620 C 215.883 212.729 216.561 215.730 215.694 218.478 C 214.827 221.225 212.550 223.294 209.733 223.895 C 206.915 224.496 203.992 223.535 202.080 221.380 L 180.000 197.130 C 163.625 204.373 145.905 208.077 128.000 208.000 C 93.120 208.000 61.430 194.740 36.340 169.660 C 17.510 150.830 9.000 132.050 8.690 131.260 C 7.770 129.191 7.770 126.829 8.690 124.760 C 9.000 124.000 17.510 105.180 36.340 86.350 C 43.863 78.792 52.255 72.153 61.340 66.570 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 ZM 148.430 162.370 L 95.740 104.370 C 84.548 119.705 85.677 140.795 98.443 154.848 C 111.209 168.900 132.094 172.043 148.430 162.370 Z"),
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
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
