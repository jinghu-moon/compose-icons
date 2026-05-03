package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tooth: ImageVector
    get() {
        if (_tooth != null) return _tooth!!
        _tooth = phosphorLightIcon(
            name = "Tooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 170.230 69.570 L 144.160 80.000 L 170.230 90.430 C 172.237 91.215 173.668 93.016 173.980 95.148 C 174.292 97.280 173.437 99.416 171.740 100.743 C 170.043 102.071 167.764 102.386 165.770 101.570 L 128.000 86.460 L 90.230 101.570 C 88.751 102.161 87.099 102.140 85.636 101.511 C 84.173 100.883 83.020 99.699 82.430 98.220 C 81.205 95.147 82.699 91.662 85.770 90.430 L 111.840 80.000 L 85.770 69.570 C 82.720 68.321 81.249 64.847 82.473 61.787 C 83.698 58.728 87.161 57.229 90.230 58.430 L 128.000 73.530 L 165.770 58.430 C 167.764 57.614 170.043 57.929 171.740 59.257 C 173.437 60.584 174.292 62.720 173.980 64.852 C 173.668 66.984 172.237 68.785 170.230 69.570 ZM 222.000 79.750 C 222.000 122.200 214.090 154.650 207.410 174.390 C 198.820 199.800 187.190 219.130 175.500 227.390 C 171.429 230.321 166.081 230.793 161.560 228.620 C 156.987 226.443 153.934 221.981 153.560 216.930 C 152.430 201.600 147.690 165.930 128.040 165.930 C 108.390 165.930 103.650 201.570 102.520 216.930 C 101.948 224.246 95.859 229.900 88.520 229.930 C 85.649 229.930 82.850 229.028 80.520 227.350 C 68.830 219.060 57.200 199.730 48.610 174.350 C 41.910 154.650 34.000 122.200 34.000 79.750 C 34.138 50.024 58.274 26.000 88.000 26.000 L 168.000 26.000 C 197.726 26.000 221.862 50.024 222.000 79.750 ZM 210.000 79.750 C 209.863 56.652 191.099 38.000 168.000 38.000 L 88.000 38.000 C 64.897 38.000 46.132 56.658 46.000 79.760 C 45.930 153.690 70.690 205.760 87.440 217.640 C 87.986 218.048 88.717 218.106 89.320 217.790 C 90.006 217.488 90.465 216.828 90.510 216.080 C 93.460 176.000 106.770 154.000 128.000 154.000 C 149.230 154.000 162.540 176.000 165.490 216.090 C 165.535 216.838 165.994 217.498 166.680 217.800 C 167.283 218.116 168.014 218.057 168.560 217.650 C 185.310 205.740 210.070 153.690 210.000 79.760 Z"),
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
        return _tooth!!
    }

private var _tooth: ImageVector? = null
