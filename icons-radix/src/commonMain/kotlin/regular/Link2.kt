package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Link2: ImageVector
    get() {
        if (_link2 != null) return _link2!!
        _link2 = radixIcon(
            name = "Link2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.689 6.375 C 3.883 6.247 4.147 6.269 4.318 6.440 C 4.513 6.635 4.513 6.952 4.318 7.147 L 3.699 7.766 C 3.379 8.086 3.207 8.259 3.098 8.391 L 3.005 8.512 C 2.545 9.188 2.537 10.044 2.954 10.679 L 3.039 10.793 C 3.140 10.917 3.303 11.080 3.611 11.389 C 4.023 11.801 4.177 11.951 4.321 12.046 L 4.442 12.119 C 5.062 12.461 5.854 12.426 6.488 11.995 L 6.609 11.903 C 6.741 11.793 6.915 11.622 7.235 11.301 L 7.853 10.682 C 8.049 10.487 8.365 10.487 8.560 10.682 C 8.756 10.877 8.755 11.194 8.560 11.389 L 7.942 12.008 C 7.646 12.304 7.434 12.517 7.240 12.678 L 7.050 12.823 C 6.118 13.455 4.922 13.526 3.961 12.996 L 3.772 12.882 C 3.521 12.717 3.281 12.473 2.904 12.097 C 2.622 11.815 2.414 11.608 2.258 11.417 L 2.118 11.228 C 1.468 10.238 1.503 8.944 2.178 7.950 L 2.322 7.760 C 2.483 7.566 2.696 7.354 2.992 7.058 L 3.611 6.440 L 3.689 6.375 ZM 8.914 5.378 C 9.109 5.183 9.426 5.184 9.621 5.378 C 9.816 5.573 9.816 5.890 9.621 6.085 L 6.086 9.620 C 5.891 9.816 5.574 9.816 5.379 9.620 C 5.184 9.425 5.184 9.108 5.379 8.913 L 8.914 5.378 ZM 8.139 2.059 C 9.104 1.501 10.299 1.509 11.227 2.118 L 11.417 2.258 C 11.608 2.414 11.814 2.622 12.097 2.905 C 12.473 3.281 12.717 3.521 12.882 3.773 L 12.996 3.961 C 13.490 4.859 13.462 5.960 12.941 6.861 L 12.822 7.050 C 12.736 7.176 12.632 7.301 12.499 7.443 L 12.008 7.943 L 11.389 8.561 C 11.193 8.756 10.877 8.756 10.682 8.561 C 10.487 8.366 10.486 8.049 10.682 7.854 L 11.301 7.236 L 11.768 6.759 C 11.875 6.645 11.943 6.566 11.995 6.489 L 12.076 6.360 C 12.429 5.750 12.438 5.021 12.119 4.443 L 12.046 4.322 C 11.951 4.177 11.800 4.023 11.389 3.612 C 11.080 3.303 10.916 3.141 10.793 3.039 L 10.679 2.954 C 10.083 2.563 9.294 2.546 8.640 2.924 L 8.512 3.005 C 8.434 3.058 8.355 3.125 8.241 3.232 L 7.765 3.700 L 7.146 4.319 C 6.951 4.514 6.635 4.514 6.439 4.319 C 6.244 4.123 6.244 3.807 6.439 3.612 L 7.057 2.992 L 7.557 2.502 C 7.700 2.369 7.824 2.264 7.950 2.178 L 8.139 2.059 Z"),
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
        return _link2!!
    }

private var _link2: ImageVector? = null
