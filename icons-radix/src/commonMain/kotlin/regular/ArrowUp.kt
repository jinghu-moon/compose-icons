package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = radixIcon(
            name = "ArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.225 2.082 C 7.419 1.954 7.683 1.976 7.853 2.147 L 11.854 6.147 L 11.918 6.225 C 12.046 6.419 12.024 6.683 11.854 6.854 C 11.683 7.025 11.419 7.046 11.225 6.918 L 11.146 6.854 L 8.000 3.707 L 8.000 12.500 C 8.000 12.776 7.776 13.000 7.500 13.000 C 7.224 13.000 7.000 12.776 7.000 12.500 L 7.000 3.707 L 3.853 6.854 C 3.658 7.049 3.342 7.049 3.146 6.854 C 2.951 6.658 2.951 6.342 3.146 6.147 L 7.146 2.147 L 7.225 2.082 Z"),
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
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
