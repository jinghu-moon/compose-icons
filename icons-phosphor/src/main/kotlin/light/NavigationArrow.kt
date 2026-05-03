package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorLightIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.650 108.100 L 60.720 42.830 L 60.590 42.830 C 55.535 41.088 49.929 42.377 46.143 46.153 C 42.357 49.928 41.052 55.530 42.780 60.590 C 42.780 60.590 42.780 60.680 42.780 60.720 L 108.100 236.650 C 110.010 242.288 115.327 246.060 121.280 246.000 L 121.540 246.000 C 127.618 245.960 132.954 241.948 134.680 236.120 L 134.680 235.970 L 156.820 156.870 L 236.000 134.730 L 236.150 134.730 C 241.920 132.949 245.899 127.669 246.019 121.632 C 246.140 115.594 242.375 110.159 236.680 108.150 ZM 232.650 123.200 L 150.390 146.200 C 148.372 146.765 146.795 148.342 146.230 150.360 L 123.230 232.620 C 123.002 233.451 122.231 234.015 121.370 233.980 C 120.487 234.058 119.676 233.488 119.450 232.630 C 119.454 232.590 119.454 232.550 119.450 232.510 L 54.110 56.620 C 53.885 55.908 54.075 55.130 54.603 54.603 C 55.130 54.075 55.908 53.885 56.620 54.110 L 232.530 119.370 L 232.650 119.370 C 233.463 119.644 234.010 120.407 234.010 121.265 C 234.010 122.123 233.463 122.886 232.650 123.160 Z"),
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
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
