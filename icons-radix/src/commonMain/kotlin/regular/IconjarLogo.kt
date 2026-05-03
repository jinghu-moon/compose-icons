package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.IconjarLogo: ImageVector
    get() {
        if (_iconjarLogo != null) return _iconjarLogo!!
        _iconjarLogo = radixIcon(
            name = "IconjarLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 4.000 C 12.695 4.001 12.828 4.865 12.133 5.128 C 11.641 5.333 11.728 5.831 12.133 6.094 C 12.828 6.533 13.089 7.324 12.974 8.056 L 12.162 12.478 L 12.123 12.639 C 11.894 13.434 11.179 14.000 10.337 14.000 L 4.660 14.000 L 4.494 13.993 C 3.726 13.924 3.089 13.381 2.875 12.639 L 2.836 12.478 L 2.025 8.056 C 1.904 7.312 2.258 6.525 2.895 6.123 C 3.274 5.849 3.374 5.394 2.980 5.194 L 2.895 5.158 C 2.243 4.910 2.295 4.109 2.876 4.010 L 3.000 4.000 L 12.000 4.000 ZM 4.110 5.000 C 4.205 5.214 4.242 5.439 4.229 5.656 C 4.195 6.224 3.845 6.670 3.480 6.934 L 3.454 6.952 L 3.428 6.968 C 3.131 7.156 2.955 7.546 3.012 7.896 L 3.817 12.284 L 3.861 12.438 C 3.992 12.781 4.310 13.000 4.660 13.000 L 10.337 13.000 C 10.688 13.000 11.006 12.780 11.137 12.438 L 11.181 12.284 L 11.986 7.894 C 12.048 7.485 11.896 7.127 11.599 6.940 L 11.587 6.932 C 11.195 6.676 10.833 6.228 10.798 5.649 C 10.784 5.413 10.828 5.194 10.912 5.000 L 9.057 5.000 C 9.022 5.147 9.000 5.312 9.000 5.500 C 9.001 6.496 9.954 7.149 9.954 8.350 C 9.954 9.270 9.498 9.842 8.621 9.842 C 8.132 9.842 7.579 9.461 7.578 8.758 C 7.578 7.897 8.199 7.346 8.200 6.250 C 8.200 5.818 8.084 5.377 7.905 5.000 L 4.110 5.000 ZM 7.500 0.003 C 8.195 0.003 8.751 0.282 8.750 0.750 C 8.750 0.997 8.575 1.121 8.423 1.228 C 8.305 1.311 8.200 1.385 8.200 1.500 C 8.202 2.000 12.500 1.501 12.500 2.500 C 12.500 2.776 12.276 3.000 12.000 3.000 L 3.000 3.000 C 2.724 3.000 2.500 2.776 2.500 2.500 C 2.500 1.501 6.798 2.000 6.800 1.500 C 6.800 1.385 6.695 1.311 6.576 1.228 C 6.424 1.121 6.250 0.997 6.250 0.750 C 6.250 0.281 6.805 0.003 7.500 0.003 Z"),
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
        return _iconjarLogo!!
    }

private var _iconjarLogo: ImageVector? = null
