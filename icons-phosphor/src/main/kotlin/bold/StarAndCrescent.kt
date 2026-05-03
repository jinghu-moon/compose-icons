package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) return _starAndCrescent!!
        _starAndCrescent = phosphorBoldIcon(
            name = "StarAndCrescent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 157.460 195.720 C 131.992 182.747 115.956 156.582 115.956 128.000 C 115.956 99.418 131.992 73.253 157.460 60.280 C 161.473 58.229 163.998 54.102 163.998 49.595 C 163.998 45.088 161.473 40.961 157.460 38.910 C 115.390 17.462 64.051 28.366 34.330 65.062 C 4.610 101.758 4.610 154.242 34.330 190.938 C 64.051 227.634 115.390 238.538 157.460 217.090 C 161.473 215.039 163.998 210.912 163.998 206.405 C 163.998 201.898 161.473 197.771 157.460 195.720 ZM 112.000 204.000 C 70.026 204.000 36.000 169.974 36.000 128.000 C 36.000 86.026 70.026 52.000 112.000 52.000 C 116.550 51.996 121.091 52.394 125.570 53.190 C 104.215 72.192 91.999 99.415 91.999 128.000 C 91.999 156.585 104.215 183.808 125.570 202.810 C 121.091 203.606 116.550 204.004 112.000 204.000 ZM 248.750 117.000 L 224.470 106.500 L 222.350 79.080 C 221.975 74.200 218.674 70.036 214.008 68.558 C 209.342 67.080 204.246 68.585 201.130 72.360 L 184.130 92.940 L 158.870 86.690 C 154.184 85.534 149.261 87.298 146.376 91.168 C 143.491 95.037 143.205 100.259 145.650 104.420 L 159.540 128.000 L 145.660 151.580 C 143.215 155.741 143.501 160.963 146.386 164.832 C 149.271 168.702 154.194 170.466 158.880 169.310 L 184.140 163.060 L 201.140 183.640 C 203.421 186.403 206.817 188.002 210.400 188.000 C 211.628 188.002 212.850 187.813 214.020 187.440 C 218.685 185.962 221.985 181.799 222.360 176.920 L 224.480 149.500 L 248.750 139.000 C 253.125 137.092 255.954 132.773 255.954 128.000 C 255.954 123.227 253.125 118.908 248.750 117.000 ZM 208.310 130.350 C 204.220 132.115 201.445 135.999 201.100 140.440 L 200.710 145.440 L 197.840 142.000 C 195.561 139.240 192.169 137.641 188.590 137.640 C 187.619 137.637 186.652 137.755 185.710 137.990 L 180.820 139.200 L 183.820 134.130 C 186.034 130.372 186.034 125.708 183.820 121.950 L 180.820 116.880 L 185.710 118.090 C 190.186 119.198 194.901 117.643 197.840 114.090 L 200.710 110.610 L 201.100 115.610 C 201.445 120.051 204.220 123.935 208.310 125.700 L 213.710 128.030 Z"),
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
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
