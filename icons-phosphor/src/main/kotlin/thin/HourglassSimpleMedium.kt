package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HourglassSimpleMedium: ImageVector
    get() {
        if (_hourglassSimpleMedium != null) return _hourglassSimpleMedium!!
        _hourglassSimpleMedium = phosphorThinIcon(
            name = "HourglassSimpleMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 133.780 128.000 L 208.460 56.490 C 211.892 53.062 212.923 47.904 211.071 43.420 C 209.220 38.937 204.851 36.008 200.000 36.000 L 56.000 36.000 C 51.144 35.996 46.764 38.920 44.905 43.407 C 43.046 47.893 44.074 53.058 47.510 56.490 L 47.580 56.550 L 122.220 128.000 L 47.610 199.450 L 47.540 199.510 C 44.108 202.938 43.077 208.096 44.929 212.580 C 46.780 217.064 51.149 219.992 56.000 220.000 L 200.000 220.000 C 204.870 220.000 209.257 217.056 211.104 212.550 C 212.951 208.043 211.890 202.867 208.420 199.450 ZM 87.840 84.000 L 168.160 84.000 L 128.000 122.460 ZM 52.330 46.470 C 52.930 44.971 54.385 43.991 56.000 44.000 L 200.000 44.000 C 201.604 43.998 203.054 44.955 203.683 46.430 C 204.313 47.905 204.001 49.613 202.890 50.770 L 176.510 76.000 L 79.510 76.000 L 53.170 50.800 C 52.028 49.666 51.694 47.949 52.330 46.470 ZM 203.670 209.530 C 203.070 211.029 201.615 212.009 200.000 212.000 L 56.000 212.000 C 54.389 212.001 52.934 211.036 52.309 209.551 C 51.685 208.066 52.012 206.351 53.140 205.200 L 124.000 137.370 L 124.000 168.000 C 124.000 170.209 125.791 172.000 128.000 172.000 C 130.209 172.000 132.000 170.209 132.000 168.000 L 132.000 137.370 L 202.800 205.170 C 203.963 206.304 204.309 208.037 203.670 209.530 Z"),
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
        return _hourglassSimpleMedium!!
    }

private var _hourglassSimpleMedium: ImageVector? = null
