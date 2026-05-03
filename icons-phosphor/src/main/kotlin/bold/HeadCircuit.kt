package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HeadCircuit: ImageVector
    get() {
        if (_headCircuit != null) return _headCircuit!!
        _headCircuit = phosphorBoldIcon(
            name = "HeadCircuit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 203.910 230.510 C 204.306 233.669 203.430 236.856 201.476 239.369 C 199.522 241.882 196.649 243.516 193.490 243.910 C 192.995 243.969 192.498 243.999 192.000 244.000 C 185.955 243.991 180.861 239.488 180.110 233.490 L 172.110 169.490 C 171.577 165.221 173.371 160.994 176.810 158.410 C 194.353 145.203 204.472 124.363 204.000 102.410 C 204.000 101.600 203.930 100.810 203.890 100.010 L 189.620 100.010 L 166.520 127.730 C 167.502 130.376 168.003 133.177 168.000 136.000 C 168.029 146.123 161.722 155.182 152.219 158.667 C 142.715 162.153 132.046 159.321 125.524 151.580 C 119.001 143.839 118.018 132.844 123.065 124.069 C 128.112 115.294 138.109 110.615 148.080 112.360 L 174.780 80.360 C 177.052 77.608 180.431 76.010 184.000 76.000 L 197.910 76.000 C 187.431 52.910 165.006 37.541 139.690 36.100 Q 137.850 36.000 136.000 36.000 L 136.000 55.230 C 145.407 60.661 149.994 71.734 147.182 82.226 C 144.371 92.719 134.863 100.015 124.000 100.015 C 113.137 100.015 103.629 92.719 100.818 82.226 C 98.006 71.734 102.593 60.661 112.000 55.230 L 112.000 40.340 C 85.532 50.358 68.017 75.700 68.000 104.000 C 67.999 105.929 67.532 107.829 66.640 109.540 L 45.510 150.150 L 69.000 160.900 C 73.266 162.855 76.001 167.117 76.000 171.810 L 76.000 204.000 L 120.000 204.000 C 126.627 204.000 132.000 209.373 132.000 216.000 C 132.000 222.627 126.627 228.000 120.000 228.000 L 72.000 228.000 C 60.954 228.000 52.000 219.046 52.000 208.000 L 52.000 179.510 L 31.430 170.090 C 31.300 170.038 31.173 169.978 31.050 169.910 C 21.585 165.171 17.452 153.879 21.620 144.150 C 21.730 143.873 21.857 143.602 22.000 143.340 L 44.000 100.970 C 44.813 76.231 55.560 52.864 73.813 36.146 C 92.066 19.429 116.285 10.771 141.000 12.130 C 188.700 14.640 226.930 54.050 228.000 101.840 C 228.590 129.037 217.156 155.110 196.750 173.100 Z"),
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
        return _headCircuit!!
    }

private var _headCircuit: ImageVector? = null
