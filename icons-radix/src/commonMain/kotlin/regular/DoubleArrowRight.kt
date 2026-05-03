package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DoubleArrowRight: ImageVector
    get() {
        if (_doubleArrowRight != null) return _doubleArrowRight!!
        _doubleArrowRight = radixIcon(
            name = "DoubleArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.147 3.147 C 2.318 2.976 2.582 2.954 2.776 3.082 L 2.854 3.147 L 6.854 7.147 C 7.049 7.342 7.049 7.658 6.854 7.854 L 2.854 11.854 L 2.776 11.918 C 2.582 12.046 2.318 12.025 2.147 11.854 C 1.976 11.683 1.954 11.419 2.082 11.225 L 2.147 11.147 L 5.793 7.500 L 2.147 3.854 L 2.082 3.776 C 1.954 3.582 1.976 3.318 2.147 3.147 ZM 8.147 3.147 C 8.318 2.976 8.582 2.954 8.776 3.082 L 8.854 3.147 L 12.854 7.147 C 13.049 7.342 13.049 7.658 12.854 7.854 L 8.854 11.854 L 8.776 11.918 C 8.582 12.046 8.318 12.025 8.147 11.854 C 7.976 11.683 7.954 11.419 8.082 11.225 L 8.147 11.147 L 11.793 7.500 L 8.147 3.854 L 8.082 3.776 C 7.954 3.582 7.976 3.318 8.147 3.147 Z"),
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
        return _doubleArrowRight!!
    }

private var _doubleArrowRight: ImageVector? = null
