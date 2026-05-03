package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Accessibility: ImageVector
    get() {
        if (_accessibility != null) return _accessibility!!
        _accessibility = radixIcon(
            name = "Accessibility",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.499 0.877 C 11.157 0.877 14.122 3.842 14.122 7.499 C 14.122 11.157 11.157 14.122 7.499 14.122 C 3.842 14.122 0.877 11.156 0.877 7.499 C 0.878 3.842 3.842 0.877 7.499 0.877 ZM 7.499 1.826 C 4.367 1.827 1.827 4.367 1.826 7.499 C 1.826 10.632 4.367 13.172 7.499 13.172 C 10.632 13.172 13.172 10.632 13.172 7.499 C 13.172 4.366 10.632 1.826 7.499 1.826 ZM 10.453 5.311 C 10.720 5.239 10.994 5.397 11.066 5.664 C 11.137 5.931 10.979 6.205 10.712 6.276 L 8.746 6.803 C 8.746 6.803 8.746 7.667 8.746 8.270 C 8.746 8.872 9.626 11.697 9.626 11.697 C 9.698 11.964 9.539 12.238 9.273 12.310 C 9.006 12.381 8.732 12.223 8.660 11.956 C 8.660 11.956 7.920 9.127 7.868 9.000 C 7.820 8.873 7.650 8.873 7.650 8.873 L 7.343 8.873 C 7.337 8.873 7.169 8.875 7.124 9.000 C 7.069 9.129 6.336 11.940 6.331 11.959 C 6.260 12.226 5.986 12.384 5.719 12.313 C 5.452 12.241 5.294 11.967 5.365 11.700 C 5.371 11.683 6.246 8.870 6.246 8.270 L 6.246 6.801 L 4.287 6.276 C 4.021 6.205 3.863 5.931 3.934 5.664 C 4.005 5.397 4.279 5.239 4.546 5.311 C 4.546 5.311 6.201 5.873 6.846 5.873 L 8.156 5.873 C 8.798 5.873 10.438 5.316 10.453 5.311 ZM 7.500 2.870 C 8.122 2.870 8.625 3.374 8.625 3.995 C 8.625 4.616 8.122 5.120 7.500 5.120 C 6.879 5.120 6.375 4.616 6.375 3.995 C 6.375 3.374 6.879 2.870 7.500 2.870 Z"),
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
        return _accessibility!!
    }

private var _accessibility: ImageVector? = null
