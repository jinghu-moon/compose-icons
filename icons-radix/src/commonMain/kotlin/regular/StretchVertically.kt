package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.StretchVertically: ImageVector
    get() {
        if (_stretchVertically != null) return _stretchVertically!!
        _stretchVertically = radixIcon(
            name = "StretchVertically",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.500 14.000 C 13.776 14.000 14.000 14.224 14.000 14.500 C 14.000 14.776 13.776 15.000 13.500 15.000 L 1.500 15.000 C 1.224 15.000 1.000 14.776 1.000 14.500 C 1.000 14.224 1.224 14.000 1.500 14.000 L 6.000 14.000 L 6.000 1.000 L 1.500 1.000 C 1.224 1.000 1.000 0.776 1.000 0.500 C 1.000 0.224 1.224 0.000 1.500 0.000 L 13.500 0.000 C 13.776 0.000 14.000 0.224 14.000 0.500 C 14.000 0.776 13.776 1.000 13.500 1.000 L 9.000 1.000 L 9.000 14.000 L 13.500 14.000 Z"),
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
        return _stretchVertically!!
    }

private var _stretchVertically: ImageVector? = null
