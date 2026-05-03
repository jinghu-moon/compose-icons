package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DoubleArrowDown: ImageVector
    get() {
        if (_doubleArrowDown != null) return _doubleArrowDown!!
        _doubleArrowDown = radixIcon(
            name = "DoubleArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.225 8.082 C 11.419 7.954 11.683 7.976 11.854 8.147 C 12.025 8.318 12.046 8.582 11.918 8.776 L 11.854 8.854 L 7.854 12.854 C 7.658 13.049 7.342 13.049 7.147 12.854 L 3.147 8.854 L 3.082 8.776 C 2.954 8.582 2.976 8.318 3.147 8.147 C 3.318 7.976 3.582 7.954 3.776 8.082 L 3.854 8.147 L 7.500 11.793 L 11.147 8.147 L 11.225 8.082 ZM 11.225 2.082 C 11.419 1.954 11.683 1.976 11.854 2.147 C 12.025 2.318 12.046 2.582 11.918 2.776 L 11.854 2.854 L 7.854 6.854 C 7.658 7.049 7.342 7.049 7.147 6.854 L 3.147 2.854 L 3.082 2.776 C 2.954 2.582 2.976 2.318 3.147 2.147 C 3.318 1.976 3.582 1.954 3.776 2.082 L 3.854 2.147 L 7.500 5.793 L 11.147 2.147 L 11.225 2.082 Z"),
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
        return _doubleArrowDown!!
    }

private var _doubleArrowDown: ImageVector? = null
