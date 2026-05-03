package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = phosphorThinIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.660 63.940 C 234.913 60.836 232.954 58.160 230.220 56.510 C 167.374 18.498 88.626 18.498 25.780 56.510 C 20.135 59.959 18.346 67.326 21.780 72.980 L 117.780 230.250 C 119.953 233.846 123.849 236.043 128.050 236.043 C 132.251 236.043 136.147 233.846 138.320 230.250 L 234.250 73.000 C 235.911 70.290 236.419 67.027 235.660 63.940 ZM 58.590 118.000 C 66.433 108.653 79.426 105.460 90.707 110.109 C 101.989 114.757 108.961 126.176 107.942 138.335 C 106.923 150.494 98.148 160.594 86.250 163.300 ZM 152.590 191.410 C 140.102 183.068 136.420 166.359 144.244 153.540 C 152.068 140.721 168.611 136.358 181.740 143.650 ZM 185.920 136.800 C 180.475 133.647 174.292 131.991 168.000 132.000 C 152.047 132.002 137.998 142.502 133.479 157.802 C 128.960 173.101 135.048 189.550 148.440 198.220 L 131.440 226.080 C 130.719 227.294 129.412 228.039 128.000 228.039 C 126.588 228.039 125.281 227.294 124.560 226.080 L 90.560 170.410 C 104.938 166.007 115.065 153.132 115.956 138.121 C 116.848 123.111 108.315 109.127 94.559 103.054 C 80.803 96.981 64.722 100.098 54.230 110.870 L 43.330 93.000 C 94.865 59.697 161.135 59.697 212.670 93.000 ZM 227.400 68.800 L 216.850 86.140 C 162.744 51.286 93.256 51.286 39.150 86.140 L 28.580 68.810 C 28.028 67.913 27.862 66.831 28.120 65.810 C 28.372 64.774 29.027 63.881 29.940 63.330 C 90.228 26.864 165.772 26.864 226.060 63.330 C 226.973 63.881 227.628 64.774 227.880 65.810 C 228.138 66.831 227.972 67.913 227.420 68.810 Z"),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null
