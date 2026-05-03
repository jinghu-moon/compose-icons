package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TextAlignLeft: ImageVector
    get() {
        if (_textAlignLeft != null) return _textAlignLeft!!
        _textAlignLeft = radixIcon(
            name = "TextAlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.500 10.000 C 10.776 10.000 11.000 10.224 11.000 10.500 C 11.000 10.776 10.776 11.000 10.500 11.000 L 2.500 11.000 C 2.224 11.000 2.000 10.776 2.000 10.500 C 2.000 10.224 2.224 10.000 2.500 10.000 L 10.500 10.000 ZM 7.500 7.000 C 7.776 7.000 8.000 7.224 8.000 7.500 C 8.000 7.776 7.776 8.000 7.500 8.000 L 2.500 8.000 C 2.224 8.000 2.000 7.776 2.000 7.500 C 2.000 7.224 2.224 7.000 2.500 7.000 L 7.500 7.000 ZM 12.500 4.000 C 12.776 4.000 13.000 4.224 13.000 4.500 C 13.000 4.776 12.776 5.000 12.500 5.000 L 2.500 5.000 C 2.224 5.000 2.000 4.776 2.000 4.500 C 2.000 4.224 2.224 4.000 2.500 4.000 L 12.500 4.000 Z"),
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
        return _textAlignLeft!!
    }

private var _textAlignLeft: ImageVector? = null
