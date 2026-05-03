package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = phosphorThinIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.780 162.130 L 173.560 141.000 C 169.841 139.391 165.561 139.767 162.180 142.000 C 162.047 142.084 161.920 142.178 161.800 142.280 L 137.000 163.420 C 135.879 164.104 134.491 164.182 133.300 163.630 C 117.060 155.790 100.250 139.110 92.410 123.060 C 91.847 121.878 91.914 120.492 92.590 119.370 L 113.790 94.160 C 113.890 94.040 113.980 93.910 114.070 93.780 C 116.296 90.404 116.672 86.133 115.070 82.420 L 93.900 35.280 C 91.801 30.376 86.716 27.446 81.420 28.090 C 55.387 31.522 35.946 53.742 36.000 80.000 C 36.000 157.200 98.800 220.000 176.000 220.000 C 202.258 220.054 224.478 200.613 227.910 174.580 C 228.549 169.310 225.649 164.246 220.780 162.130 ZM 220.000 173.580 C 217.079 195.628 198.240 212.077 176.000 212.000 C 103.220 212.000 44.000 152.780 44.000 80.000 C 43.923 57.760 60.372 38.921 82.420 36.000 C 82.580 35.990 82.740 35.990 82.900 36.000 C 84.514 36.014 85.961 36.996 86.570 38.490 L 107.680 85.630 C 108.180 86.798 108.094 88.135 107.450 89.230 L 86.260 114.430 C 86.160 114.560 86.060 114.680 85.970 114.820 C 83.674 118.331 83.378 122.786 85.190 126.570 C 93.880 144.360 111.800 162.150 129.790 170.840 C 133.600 172.640 138.075 172.310 141.580 169.970 L 141.950 169.690 L 166.780 148.570 C 167.858 147.912 169.186 147.811 170.350 148.300 L 217.560 169.460 C 219.196 170.141 220.189 171.818 220.000 173.580 Z"),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
