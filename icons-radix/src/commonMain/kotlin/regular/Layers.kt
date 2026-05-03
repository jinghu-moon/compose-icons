package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Layers: ImageVector
    get() {
        if (_layers != null) return _layers!!
        _layers = radixIcon(
            name = "Layers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.838 10.277 C 13.058 10.202 13.308 10.288 13.431 10.496 C 13.553 10.704 13.508 10.964 13.336 11.120 L 13.254 11.181 L 7.754 14.431 C 7.597 14.523 7.403 14.523 7.246 14.431 L 1.746 11.181 L 1.664 11.120 C 1.492 10.964 1.447 10.704 1.569 10.496 C 1.692 10.288 1.942 10.202 2.162 10.277 L 2.254 10.319 L 7.500 13.419 L 12.746 10.319 L 12.838 10.277 ZM 12.838 7.277 C 13.058 7.202 13.308 7.288 13.431 7.496 C 13.553 7.704 13.508 7.964 13.336 8.120 L 13.254 8.181 L 7.754 11.431 C 7.597 11.523 7.403 11.523 7.246 11.431 L 1.746 8.181 L 1.664 8.120 C 1.492 7.964 1.447 7.704 1.569 7.496 C 1.692 7.288 1.942 7.202 2.162 7.277 L 2.254 7.319 L 7.500 10.419 L 12.746 7.319 L 12.838 7.277 ZM 7.306 0.789 C 7.450 0.728 7.616 0.738 7.754 0.819 L 13.254 4.069 C 13.406 4.159 13.500 4.323 13.500 4.500 C 13.500 4.677 13.406 4.841 13.254 4.931 L 7.754 8.181 C 7.597 8.273 7.403 8.273 7.246 8.181 L 1.746 4.931 C 1.594 4.841 1.500 4.677 1.500 4.500 C 1.500 4.323 1.594 4.159 1.746 4.069 L 7.246 0.819 L 7.306 0.789 ZM 2.982 4.500 L 7.500 7.169 L 12.017 4.500 L 7.500 1.830 L 2.982 4.500 Z"),
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
        return _layers!!
    }

private var _layers: ImageVector? = null
