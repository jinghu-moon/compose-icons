package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TextAlignBottom: ImageVector
    get() {
        if (_textAlignBottom != null) return _textAlignBottom!!
        _textAlignBottom = radixIcon(
            name = "TextAlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.500 13.900 C 3.606 13.900 3.708 13.858 3.783 13.783 L 5.783 11.783 C 5.939 11.627 5.939 11.373 5.783 11.216 C 5.627 11.060 5.373 11.061 5.217 11.216 L 3.900 12.533 L 3.900 5.500 C 3.900 5.279 3.721 5.099 3.500 5.099 C 3.279 5.099 3.100 5.279 3.100 5.500 L 3.100 12.533 L 1.783 11.216 L 1.720 11.166 C 1.565 11.063 1.353 11.080 1.217 11.216 C 1.080 11.353 1.064 11.564 1.166 11.719 L 1.217 11.783 L 3.217 13.783 C 3.292 13.858 3.394 13.900 3.500 13.900 ZM 14.500 7.000 C 14.776 7.000 15.000 6.776 15.000 6.500 C 15.000 6.224 14.776 6.000 14.500 6.000 L 8.500 6.000 C 8.224 6.000 8.000 6.224 8.000 6.500 C 8.000 6.776 8.224 7.000 8.500 7.000 L 14.500 7.000 ZM 14.500 10.000 C 14.776 10.000 15.000 9.776 15.000 9.500 C 15.000 9.224 14.776 9.000 14.500 9.000 L 8.500 9.000 C 8.224 9.000 8.000 9.224 8.000 9.500 C 8.000 9.776 8.224 10.000 8.500 10.000 L 14.500 10.000 ZM 14.500 13.000 C 14.776 13.000 15.000 12.776 15.000 12.500 C 15.000 12.224 14.776 12.000 14.500 12.000 L 8.500 12.000 C 8.224 12.000 8.000 12.224 8.000 12.500 C 8.000 12.776 8.224 13.000 8.500 13.000 L 14.500 13.000 Z"),
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
        return _textAlignBottom!!
    }

private var _textAlignBottom: ImageVector? = null
