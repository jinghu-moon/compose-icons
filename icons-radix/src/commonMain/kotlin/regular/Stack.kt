package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = radixIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.838 8.277 C 13.058 8.202 13.308 8.288 13.431 8.496 C 13.553 8.704 13.508 8.964 13.336 9.120 L 13.254 9.181 L 7.754 12.431 C 7.597 12.523 7.403 12.523 7.246 12.431 L 1.746 9.181 L 1.664 9.120 C 1.492 8.964 1.447 8.704 1.569 8.496 C 1.692 8.288 1.942 8.202 2.162 8.277 L 2.254 8.319 L 7.500 11.419 L 12.746 8.319 L 12.838 8.277 ZM 7.306 1.789 C 7.450 1.728 7.616 1.738 7.754 1.819 L 13.254 5.069 C 13.406 5.159 13.500 5.323 13.500 5.500 C 13.500 5.677 13.406 5.841 13.254 5.931 L 7.754 9.181 C 7.597 9.273 7.403 9.273 7.246 9.181 L 1.746 5.931 C 1.594 5.841 1.500 5.677 1.500 5.500 C 1.500 5.323 1.594 5.159 1.746 5.069 L 7.246 1.819 L 7.306 1.789 ZM 2.982 5.500 L 7.500 8.169 L 12.017 5.500 L 7.500 2.830 L 2.982 5.500 Z"),
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
        return _stack!!
    }

private var _stack: ImageVector? = null
