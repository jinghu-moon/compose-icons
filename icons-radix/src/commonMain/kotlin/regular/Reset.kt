package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Reset: ImageVector
    get() {
        if (_reset != null) return _reset!!
        _reset = radixIcon(
            name = "Reset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.225 2.082 C 4.419 1.954 4.683 1.976 4.853 2.147 C 5.024 2.318 5.046 2.582 4.918 2.776 L 4.853 2.854 L 3.707 4.000 L 9.000 4.000 C 11.485 4.000 13.500 6.015 13.500 8.500 C 13.500 10.986 11.485 13.000 9.000 13.000 L 5.000 13.000 C 4.724 13.000 4.500 12.776 4.500 12.500 C 4.500 12.224 4.724 12.000 5.000 12.000 L 9.000 12.000 C 10.933 12.000 12.500 10.433 12.500 8.500 C 12.500 6.567 10.933 5.000 9.000 5.000 L 3.707 5.000 L 4.853 6.147 L 4.918 6.225 C 5.046 6.419 5.024 6.683 4.853 6.854 C 4.683 7.025 4.419 7.046 4.225 6.918 L 4.146 6.854 L 2.146 4.854 C 1.951 4.658 1.951 4.342 2.146 4.147 L 4.146 2.147 L 4.225 2.082 Z"),
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
        return _reset!!
    }

private var _reset: ImageVector? = null
