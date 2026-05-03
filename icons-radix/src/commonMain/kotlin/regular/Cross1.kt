package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Cross1: ImageVector
    get() {
        if (_cross1 != null) return _cross1!!
        _cross1 = radixIcon(
            name = "Cross1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.225 2.082 C 12.419 1.954 12.683 1.976 12.854 2.147 C 13.025 2.318 13.046 2.582 12.918 2.776 L 12.854 2.854 L 8.207 7.500 L 12.854 12.147 L 12.918 12.225 C 13.046 12.419 13.025 12.683 12.854 12.854 C 12.683 13.025 12.419 13.046 12.225 12.918 L 12.147 12.854 L 7.500 8.207 L 2.854 12.854 C 2.658 13.049 2.342 13.049 2.147 12.854 C 1.951 12.658 1.951 12.342 2.147 12.147 L 6.793 7.500 L 2.147 2.854 L 2.082 2.776 C 1.954 2.582 1.976 2.318 2.147 2.147 C 2.318 1.976 2.582 1.954 2.776 2.082 L 2.854 2.147 L 7.500 6.793 L 12.147 2.147 L 12.225 2.082 Z"),
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
        return _cross1!!
    }

private var _cross1: ImageVector? = null
