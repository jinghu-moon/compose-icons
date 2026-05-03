package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TextAlignRight: ImageVector
    get() {
        if (_textAlignRight != null) return _textAlignRight!!
        _textAlignRight = radixIcon(
            name = "TextAlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.500 10.000 C 12.776 10.000 13.000 10.224 13.000 10.500 C 13.000 10.776 12.776 11.000 12.500 11.000 L 4.500 11.000 C 4.224 11.000 4.000 10.776 4.000 10.500 C 4.000 10.224 4.224 10.000 4.500 10.000 L 12.500 10.000 ZM 12.500 7.000 C 12.776 7.000 13.000 7.224 13.000 7.500 C 13.000 7.776 12.776 8.000 12.500 8.000 L 7.500 8.000 C 7.224 8.000 7.000 7.776 7.000 7.500 C 7.000 7.224 7.224 7.000 7.500 7.000 L 12.500 7.000 ZM 12.500 4.000 C 12.776 4.000 13.000 4.224 13.000 4.500 C 13.000 4.776 12.776 5.000 12.500 5.000 L 2.500 5.000 C 2.224 5.000 2.000 4.776 2.000 4.500 C 2.000 4.224 2.224 4.000 2.500 4.000 L 12.500 4.000 Z"),
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
        return _textAlignRight!!
    }

private var _textAlignRight: ImageVector? = null
