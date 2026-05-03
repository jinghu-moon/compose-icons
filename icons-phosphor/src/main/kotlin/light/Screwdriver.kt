package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) return _screwdriver!!
        _screwdriver = phosphorLightIcon(
            name = "Screwdriver",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.240 51.740 C 206.580 54.083 206.580 57.877 204.240 60.220 L 148.240 116.220 C 145.890 118.529 142.118 118.512 139.789 116.181 C 137.461 113.850 137.448 110.077 139.760 107.730 L 195.760 51.730 C 198.105 49.393 201.900 49.398 204.240 51.740 ZM 246.000 58.410 C 246.034 71.259 240.928 83.588 231.820 92.650 L 178.580 145.890 C 175.963 148.522 172.402 149.999 168.690 149.990 L 152.000 149.990 C 150.895 149.990 150.000 150.885 150.000 151.990 L 150.000 168.820 C 149.994 171.870 148.998 174.836 147.160 177.270 C 146.993 177.488 146.813 177.695 146.620 177.890 L 138.620 185.890 C 135.994 188.516 132.433 189.991 128.720 189.991 C 125.007 189.991 121.446 188.516 118.820 185.890 L 98.700 165.770 L 20.240 244.240 C 17.876 246.443 14.192 246.378 11.907 244.093 C 9.622 241.808 9.557 238.124 11.760 235.760 L 90.220 157.290 L 70.100 137.170 L 70.100 137.170 C 67.474 134.544 65.999 130.983 65.999 127.270 C 65.999 123.557 67.474 119.996 70.100 117.370 L 78.100 109.370 C 78.290 109.172 78.497 108.991 78.720 108.830 C 81.153 106.991 84.120 105.998 87.170 106.000 L 104.000 106.000 C 105.105 106.000 106.000 105.105 106.000 104.000 L 106.000 87.300 C 105.991 83.585 107.467 80.021 110.100 77.400 L 163.330 24.160 C 177.182 10.312 198.011 6.171 216.107 13.668 C 234.202 21.165 246.000 38.823 246.000 58.410 ZM 234.000 58.410 C 233.996 43.680 225.122 30.401 211.513 24.764 C 197.904 19.126 182.240 22.238 171.820 32.650 L 118.580 85.880 C 118.206 86.257 117.997 86.768 118.000 87.300 L 118.000 104.000 C 118.000 111.732 111.732 118.000 104.000 118.000 L 87.170 118.000 C 86.821 117.999 86.477 118.085 86.170 118.250 L 78.560 125.860 C 78.184 126.235 77.973 126.744 77.973 127.275 C 77.973 127.806 78.184 128.315 78.560 128.690 L 78.560 128.690 L 127.290 177.420 C 128.070 178.195 129.330 178.195 130.110 177.420 L 137.730 169.810 C 137.895 169.503 137.981 169.159 137.980 168.810 L 137.980 152.000 C 137.980 144.268 144.248 138.000 151.980 138.000 L 168.670 138.000 C 169.200 137.998 169.707 137.786 170.080 137.410 L 223.310 84.180 C 230.174 77.364 234.024 68.083 234.000 58.410 Z"),
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
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
