package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FontBold: ImageVector
    get() {
        if (_fontBold != null) return _fontBold!!
        _fontBold = radixIcon(
            name = "FontBold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.028 3.000 C 10.137 3.000 11.054 3.982 11.054 5.185 C 11.054 6.085 10.604 6.819 9.703 7.236 C 10.866 7.449 11.518 8.628 11.518 9.481 C 11.517 10.513 10.990 12.000 9.277 12.000 L 5.105 12.000 C 4.709 12.000 4.424 11.912 4.252 11.736 C 4.084 11.556 4.000 11.272 4.000 10.883 L 4.000 4.117 C 4.000 3.720 4.086 3.436 4.258 3.264 C 4.434 3.088 4.717 3.000 5.105 3.000 L 9.028 3.000 ZM 5.800 10.631 L 8.379 10.631 C 8.900 10.631 9.630 10.121 9.630 9.299 C 9.630 8.476 8.900 8.003 8.379 8.003 L 5.800 8.003 L 5.800 10.631 ZM 5.800 6.695 L 8.180 6.695 C 8.539 6.695 9.277 6.359 9.277 5.500 C 9.277 4.641 8.480 4.369 8.180 4.369 L 5.800 4.369 L 5.800 6.695 Z"),
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
        return _fontBold!!
    }

private var _fontBold: ImageVector? = null
