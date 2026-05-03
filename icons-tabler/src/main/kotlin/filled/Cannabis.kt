package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cannabis: ImageVector
    get() {
        if (_cannabis != null) return _cannabis!!
        _cannabis = tablerFilledIcon(
            name = "Cannabis",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.894 1.553 C 14.366 4.498 15.064 6.581 15.138 8.365 L 15.139 8.456 L 15.171 8.434 C 16.006 7.883 16.929 7.480 17.901 7.243 L 18.253 7.164 C 18.767 7.057 19.290 7.000 19.815 6.995 L 20.068 7.002 C 20.392 7.024 20.686 7.202 20.855 7.480 C 21.024 7.757 21.047 8.100 20.918 8.398 C 19.969 10.585 19.100 11.993 18.016 13.062 L 17.955 13.120 L 18.205 13.175 Q 18.655 13.283 19.074 13.434 L 19.350 13.538 C 19.936 13.773 20.356 14.017 20.600 14.200 C 20.859 14.394 21.008 14.702 21.000 15.026 C 20.991 15.350 20.827 15.649 20.558 15.830 L 20.359 15.942 L 19.226 16.529 C 18.659 16.818 18.060 17.113 17.822 17.199 Q 17.699 17.244 17.578 17.282 L 17.504 17.301 L 17.520 17.343 C 17.847 18.255 17.976 19.132 17.997 19.805 L 18.000 20.000 C 18.000 20.552 17.552 21.000 17.000 21.000 C 15.743 21.000 14.230 20.271 12.999 19.353 L 13.000 22.000 C 13.000 22.552 12.552 23.000 12.000 23.000 C 11.448 23.000 11.000 22.552 11.000 22.000 L 11.000 19.353 C 9.840 20.219 8.430 20.916 7.219 20.993 L 7.000 21.000 C 6.448 21.000 6.000 20.552 6.000 20.000 C 6.000 19.376 6.098 18.536 6.379 17.642 L 6.495 17.301 L 6.422 17.281 L 6.178 17.200 C 5.835 17.075 4.736 16.514 4.072 16.168 L 3.552 15.894 C 3.242 15.739 3.035 15.434 3.004 15.089 C 2.973 14.744 3.123 14.408 3.400 14.200 C 3.644 14.017 4.064 13.773 4.650 13.538 C 5.022 13.388 5.405 13.267 5.795 13.175 L 6.044 13.120 L 5.984 13.062 C 4.960 12.052 4.128 10.740 3.240 8.755 L 3.083 8.398 C 2.962 8.120 2.974 7.803 3.115 7.535 C 3.255 7.266 3.510 7.076 3.807 7.018 L 3.956 7.001 L 4.014 6.998 C 4.600 6.983 5.185 7.036 5.758 7.157 C 6.720 7.347 7.642 7.701 8.485 8.202 L 8.755 8.371 L 8.755 8.334 C 8.727 6.740 9.130 5.154 9.850 3.630 L 9.989 3.345 C 10.444 2.437 10.903 1.759 11.227 1.365 C 11.442 1.104 11.775 0.969 12.111 1.008 C 12.448 1.046 12.742 1.251 12.893 1.554"),
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
        return _cannabis!!
    }

private var _cannabis: ImageVector? = null
