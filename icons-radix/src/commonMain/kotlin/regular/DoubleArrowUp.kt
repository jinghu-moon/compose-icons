package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DoubleArrowUp: ImageVector
    get() {
        if (_doubleArrowUp != null) return _doubleArrowUp!!
        _doubleArrowUp = radixIcon(
            name = "DoubleArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.147 8.146 C 7.342 7.951 7.658 7.951 7.854 8.146 L 11.854 12.146 L 11.918 12.225 C 12.046 12.419 12.025 12.683 11.854 12.854 C 11.683 13.024 11.419 13.046 11.225 12.918 L 11.147 12.854 L 7.500 9.207 L 3.854 12.854 L 3.776 12.918 C 3.582 13.046 3.318 13.024 3.147 12.854 C 2.976 12.683 2.954 12.419 3.082 12.225 L 3.147 12.146 L 7.147 8.146 ZM 7.147 2.146 C 7.342 1.951 7.658 1.951 7.854 2.146 L 11.854 6.146 L 11.918 6.225 C 12.046 6.419 12.025 6.683 11.854 6.853 C 11.683 7.024 11.419 7.046 11.225 6.918 L 11.147 6.853 L 7.500 3.207 L 3.854 6.853 L 3.776 6.918 C 3.582 7.046 3.318 7.024 3.147 6.853 C 2.976 6.683 2.954 6.419 3.082 6.225 L 3.147 6.146 L 7.147 2.146 Z"),
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
        return _doubleArrowUp!!
    }

private var _doubleArrowUp: ImageVector? = null
