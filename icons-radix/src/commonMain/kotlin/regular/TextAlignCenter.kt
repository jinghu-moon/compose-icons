package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TextAlignCenter: ImageVector
    get() {
        if (_textAlignCenter != null) return _textAlignCenter!!
        _textAlignCenter = radixIcon(
            name = "TextAlignCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.500 10.000 C 11.776 10.000 12.000 10.224 12.000 10.500 C 12.000 10.776 11.776 11.000 11.500 11.000 L 3.500 11.000 C 3.224 11.000 3.000 10.776 3.000 10.500 C 3.000 10.224 3.224 10.000 3.500 10.000 L 11.500 10.000 ZM 10.500 7.000 C 10.776 7.000 11.000 7.224 11.000 7.500 C 11.000 7.776 10.776 8.000 10.500 8.000 L 4.500 8.000 C 4.224 8.000 4.000 7.776 4.000 7.500 C 4.000 7.224 4.224 7.000 4.500 7.000 L 10.500 7.000 ZM 12.500 4.000 C 12.776 4.000 13.000 4.224 13.000 4.500 C 13.000 4.776 12.776 5.000 12.500 5.000 L 2.500 5.000 C 2.224 5.000 2.000 4.776 2.000 4.500 C 2.000 4.224 2.224 4.000 2.500 4.000 L 12.500 4.000 Z"),
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
        return _textAlignCenter!!
    }

private var _textAlignCenter: ImageVector? = null
