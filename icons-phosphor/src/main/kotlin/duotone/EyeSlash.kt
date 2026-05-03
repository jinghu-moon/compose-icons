package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) return _eyeSlash!!
        _eyeSlash = phosphorDuotoneIcon(
            name = "EyeSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 56.000 C 48.000 56.000 16.000 128.000 16.000 128.000 C 16.000 128.000 48.000 200.000 128.000 200.000 C 208.000 200.000 240.000 128.000 240.000 128.000 C 240.000 128.000 208.000 56.000 128.000 56.000 ZM 128.000 168.000 C 105.909 168.000 88.000 150.091 88.000 128.000 C 88.000 105.909 105.909 88.000 128.000 88.000 C 150.091 88.000 168.000 105.909 168.000 128.000 C 168.000 150.091 150.091 168.000 128.000 168.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 61.320 66.550 C 25.000 88.840 9.380 123.200 8.690 124.760 C 7.770 126.829 7.770 129.191 8.690 131.260 C 9.040 132.050 17.510 150.830 36.340 169.660 C 61.430 194.740 93.120 208.000 128.000 208.000 C 145.926 208.102 163.671 204.411 180.070 197.170 L 202.070 221.380 C 203.982 223.535 206.905 224.496 209.723 223.895 C 212.540 223.294 214.817 221.225 215.684 218.478 C 216.551 215.730 215.873 212.729 213.910 210.620 ZM 101.250 110.460 L 142.920 156.310 C 130.013 163.100 114.149 160.304 104.340 149.512 C 94.532 138.720 93.261 122.661 101.250 110.460 ZM 128.000 192.000 C 97.220 192.000 70.330 180.810 48.070 158.750 C 38.933 149.670 31.162 139.312 25.000 128.000 C 29.690 119.210 44.660 94.610 72.350 78.620 L 90.350 98.370 C 75.962 116.797 76.943 142.909 92.672 160.205 C 108.402 177.501 134.304 180.949 154.010 168.370 L 168.740 184.570 C 155.740 189.558 141.924 192.077 128.000 192.000 ZM 134.000 96.570 C 129.659 95.742 126.812 91.551 127.640 87.210 C 128.468 82.869 132.659 80.022 137.000 80.850 C 157.940 84.910 173.715 102.259 175.770 123.490 C 176.181 127.889 172.949 131.788 168.550 132.200 C 168.300 132.215 168.050 132.215 167.800 132.200 C 163.655 132.218 160.183 129.067 159.800 124.940 C 158.417 110.820 147.926 99.283 134.000 96.570 ZM 247.280 131.260 C 246.860 132.200 236.730 154.630 213.920 175.060 C 211.799 177.020 208.785 177.685 206.036 176.799 C 203.287 175.913 201.229 173.614 200.652 170.784 C 200.074 167.954 201.067 165.032 203.250 163.140 C 214.441 153.086 223.841 141.204 231.050 128.000 C 224.874 116.678 217.086 106.313 207.930 97.230 C 185.670 75.190 158.780 64.000 128.000 64.000 C 121.515 63.992 115.039 64.517 108.640 65.570 C 105.808 66.071 102.925 65.013 101.089 62.800 C 99.253 60.586 98.747 57.558 99.762 54.867 C 100.778 52.177 103.159 50.238 106.000 49.790 C 113.272 48.589 120.630 47.991 128.000 48.000 C 162.880 48.000 194.570 61.260 219.660 86.350 C 238.490 105.180 246.960 123.970 247.310 124.760 C 248.230 126.829 248.230 129.191 247.310 131.260 Z"),
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
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
