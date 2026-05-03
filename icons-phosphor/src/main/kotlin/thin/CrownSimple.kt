package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) return _crownSimple!!
        _crownSimple = phosphorThinIcon(
            name = "CrownSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.180 77.210 C 224.348 74.850 218.534 76.027 215.000 80.080 L 177.190 120.840 L 138.900 35.000 C 136.936 30.738 132.667 28.011 127.974 28.022 C 123.281 28.033 119.025 30.779 117.080 35.050 L 78.810 120.840 L 41.000 80.080 C 37.444 76.062 31.653 74.893 26.817 77.217 C 21.981 79.541 19.275 84.793 20.190 90.080 L 20.190 90.230 L 42.880 194.130 C 43.912 199.851 48.896 204.010 54.710 204.000 L 201.290 204.000 C 207.080 203.999 212.043 199.864 213.090 194.170 L 235.780 90.270 L 235.780 90.120 C 236.762 84.818 234.053 79.519 229.180 77.210 ZM 227.940 88.660 L 205.260 192.540 L 205.260 192.700 C 204.921 194.610 203.260 196.001 201.320 196.000 L 54.710 196.000 C 52.770 196.001 51.109 194.610 50.770 192.700 L 50.770 192.540 L 28.060 88.660 C 27.752 86.880 28.675 85.114 30.313 84.352 C 31.950 83.589 33.896 84.019 35.060 85.400 C 35.081 85.431 35.109 85.459 35.140 85.480 L 77.140 130.720 C 78.053 131.707 79.402 132.169 80.729 131.950 C 82.055 131.730 83.183 130.859 83.730 129.630 L 124.450 38.320 C 125.109 36.917 126.520 36.022 128.070 36.022 C 129.620 36.022 131.031 36.917 131.690 38.320 L 172.430 129.670 C 172.977 130.899 174.105 131.770 175.431 131.990 C 176.758 132.209 178.107 131.747 179.020 130.760 L 221.020 85.520 C 221.051 85.499 221.079 85.471 221.100 85.440 C 222.264 84.059 224.210 83.629 225.847 84.392 C 227.485 85.154 228.408 86.920 228.100 88.700 Z"),
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
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
