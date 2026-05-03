package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Pencil2: ImageVector
    get() {
        if (_pencil2 != null) return _pencil2!!
        _pencil2 = radixIcon(
            name = "Pencil2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 3.000 L 4.900 3.000 C 4.472 3.000 4.180 3.000 3.955 3.019 C 3.736 3.037 3.624 3.070 3.546 3.109 C 3.358 3.205 3.205 3.358 3.109 3.546 C 3.070 3.624 3.036 3.736 3.019 3.955 C 3.000 4.180 3.000 4.472 3.000 4.900 L 3.000 11.100 C 3.000 11.528 3.000 11.820 3.019 12.045 C 3.036 12.264 3.070 12.376 3.109 12.454 L 3.191 12.588 C 3.284 12.715 3.405 12.819 3.546 12.891 L 3.612 12.919 C 3.687 12.946 3.791 12.968 3.955 12.981 C 4.180 13.000 4.472 13.000 4.900 13.000 L 11.099 13.000 C 11.528 13.000 11.820 13.000 12.045 12.981 C 12.264 12.964 12.376 12.930 12.454 12.891 L 12.588 12.809 C 12.715 12.716 12.818 12.595 12.891 12.454 L 12.919 12.388 C 12.946 12.313 12.968 12.209 12.981 12.045 C 13.000 11.820 13.000 11.528 13.000 11.100 L 13.000 7.000 L 14.000 6.000 L 14.000 11.100 C 14.000 11.511 14.000 11.851 13.977 12.126 C 13.960 12.337 13.928 12.535 13.861 12.723 L 13.782 12.908 C 13.614 13.237 13.359 13.513 13.046 13.705 L 12.908 13.782 C 12.665 13.906 12.407 13.955 12.126 13.977 C 11.851 14.000 11.511 14.000 11.099 14.000 L 4.900 14.000 C 4.489 14.000 4.149 14.000 3.874 13.977 C 3.663 13.960 3.465 13.928 3.277 13.861 L 3.092 13.782 C 2.763 13.614 2.487 13.359 2.295 13.046 L 2.218 12.908 C 2.094 12.665 2.045 12.407 2.022 12.126 C 2.000 11.851 2.000 11.511 2.000 11.100 L 2.000 4.900 C 2.000 4.489 2.000 4.149 2.022 3.874 C 2.045 3.593 2.094 3.335 2.218 3.092 C 2.409 2.716 2.716 2.410 3.092 2.218 C 3.334 2.094 3.593 2.046 3.874 2.023 C 4.149 2.000 4.489 2.000 4.900 2.000 L 10.000 2.000 L 9.000 3.000 ZM 12.224 1.082 C 12.418 0.954 12.682 0.976 12.853 1.147 L 14.853 3.147 L 14.918 3.225 C 15.046 3.419 15.024 3.683 14.853 3.854 L 10.911 7.796 C 10.835 7.872 10.747 7.935 10.651 7.983 L 6.724 9.947 C 6.531 10.043 6.299 10.006 6.146 9.854 C 5.994 9.701 5.956 9.469 6.053 9.276 L 8.017 5.349 C 8.065 5.253 8.128 5.165 8.204 5.089 L 12.146 1.147 L 12.224 1.082 ZM 8.911 5.796 L 7.872 7.872 L 8.127 8.127 L 10.204 7.089 L 13.793 3.500 L 12.500 2.207 L 8.911 5.796 Z"),
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
        return _pencil2!!
    }

private var _pencil2: ImageVector? = null
