package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = phosphorThinIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.810 225.210 C 219.283 226.870 217.742 227.999 216.000 228.000 C 215.589 228.000 215.181 227.936 214.790 227.810 L 128.000 200.200 L 41.210 227.810 C 40.819 227.936 40.411 228.000 40.000 228.000 C 38.030 227.996 36.357 226.559 36.055 224.612 C 35.754 222.666 36.914 220.790 38.790 220.190 L 114.790 196.000 L 38.790 171.810 C 37.381 171.417 36.300 170.286 35.969 168.861 C 35.639 167.436 36.113 165.944 37.205 164.971 C 38.296 163.998 39.832 163.699 41.210 164.190 L 128.000 191.800 L 214.790 164.190 C 216.168 163.699 217.704 163.998 218.796 164.971 C 219.887 165.944 220.361 167.436 220.031 168.861 C 219.700 170.286 218.619 171.417 217.210 171.810 L 141.210 196.000 L 217.210 220.190 C 219.313 220.859 220.477 223.106 219.810 225.210 ZM 72.000 108.000 C 72.000 89.000 81.380 69.150 99.120 50.730 C 107.171 42.351 116.156 34.922 125.900 28.590 C 127.187 27.796 128.813 27.796 130.100 28.590 C 139.844 34.922 148.829 42.351 156.880 50.730 C 174.620 69.150 184.000 89.000 184.000 108.000 C 184.010 138.374 159.804 163.219 129.440 164.000 C 128.960 164.000 128.440 164.000 128.000 164.000 C 127.560 164.000 127.000 164.000 126.560 164.000 C 96.196 163.219 71.990 138.374 72.000 108.000 ZM 128.000 156.000 C 139.046 156.000 148.000 147.046 148.000 136.000 C 148.000 118.610 133.630 105.470 128.000 101.000 C 122.370 105.480 108.000 118.620 108.000 136.000 C 108.000 147.046 116.954 156.000 128.000 156.000 ZM 80.000 108.000 C 80.005 124.845 88.840 140.455 103.280 149.130 C 101.123 145.090 99.996 140.580 100.000 136.000 C 100.000 110.160 124.730 93.370 125.780 92.670 C 127.124 91.773 128.876 91.773 130.220 92.670 C 131.270 93.370 156.000 110.160 156.000 136.000 C 156.004 140.580 154.877 145.090 152.720 149.130 C 167.160 140.455 175.995 124.845 176.000 108.000 C 176.000 71.630 137.510 43.240 128.000 36.790 C 118.500 43.250 80.000 71.680 80.000 108.000 Z"),
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
        return _campfire!!
    }

private var _campfire: ImageVector? = null
