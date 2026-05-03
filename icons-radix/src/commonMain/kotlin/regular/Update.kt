package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Update: ImageVector
    get() {
        if (_update != null) return _update!!
        _update = radixIcon(
            name = "Update",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.988 1.563 C 8.041 1.280 8.313 1.093 8.596 1.146 L 8.865 1.202 C 11.629 1.840 14.053 4.238 14.053 7.703 C 14.053 9.240 13.354 10.448 12.538 11.366 C 11.953 12.025 11.283 12.559 10.745 12.968 L 12.382 12.968 C 12.658 12.968 12.882 13.192 12.882 13.468 C 12.882 13.744 12.658 13.968 12.382 13.968 L 9.382 13.968 C 9.106 13.968 8.882 13.744 8.882 13.468 L 8.882 10.468 C 8.882 10.192 9.106 9.968 9.382 9.968 C 9.658 9.968 9.882 10.192 9.882 10.468 L 9.882 12.314 L 10.064 12.176 C 10.598 11.771 11.216 11.284 11.758 10.674 C 12.473 9.870 13.010 8.898 13.010 7.703 C 13.010 4.692 10.850 2.631 8.404 2.171 L 8.302 2.141 C 8.078 2.049 7.942 1.810 7.988 1.563 ZM 0.861 7.297 C 0.861 5.761 1.560 4.553 2.376 3.634 C 2.961 2.976 3.631 2.442 4.169 2.032 L 2.532 2.032 C 2.256 2.032 2.032 1.808 2.032 1.532 C 2.032 1.256 2.256 1.033 2.532 1.032 L 5.532 1.032 C 5.808 1.032 6.032 1.256 6.032 1.532 L 6.032 4.532 C 6.032 4.808 5.808 5.032 5.532 5.032 C 5.256 5.032 5.032 4.808 5.032 4.532 L 5.032 2.687 L 4.850 2.824 C 4.316 3.229 3.698 3.716 3.156 4.326 C 2.441 5.130 1.904 6.102 1.904 7.297 C 1.904 10.341 4.111 12.415 6.589 12.844 C 6.873 12.893 7.063 13.163 7.014 13.446 C 6.965 13.730 6.695 13.920 6.412 13.871 C 3.500 13.367 0.861 10.913 0.861 7.297 Z"),
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
        return _update!!
    }

private var _update: ImageVector? = null
