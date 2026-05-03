package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SpaceBetweenHorizontally: ImageVector
    get() {
        if (_spaceBetweenHorizontally != null) return _spaceBetweenHorizontally!!
        _spaceBetweenHorizontally = radixIcon(
            name = "SpaceBetweenHorizontally",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 8.000 C 6.000 8.552 5.552 9.000 5.000 9.000 L 1.000 9.000 L 1.000 13.500 C 1.000 13.776 0.776 14.000 0.500 14.000 C 0.224 14.000 -0.000 13.776 -0.000 13.500 L -0.000 1.500 C 0.000 1.224 0.224 1.000 0.500 1.000 C 0.776 1.000 1.000 1.224 1.000 1.500 L 1.000 6.000 L 5.000 6.000 C 5.552 6.000 6.000 6.448 6.000 7.000 L 6.000 8.000 ZM 10.000 9.000 C 9.448 9.000 9.000 8.552 9.000 8.000 L 9.000 7.000 C 9.000 6.448 9.448 6.000 10.000 6.000 L 14.000 6.000 L 14.000 1.500 C 14.000 1.224 14.224 1.000 14.500 1.000 C 14.776 1.000 15.000 1.224 15.000 1.500 L 15.000 13.500 C 15.000 13.776 14.776 14.000 14.500 14.000 C 14.224 14.000 14.000 13.776 14.000 13.500 L 14.000 9.000 L 10.000 9.000 Z"),
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
        return _spaceBetweenHorizontally!!
    }

private var _spaceBetweenHorizontally: ImageVector? = null
