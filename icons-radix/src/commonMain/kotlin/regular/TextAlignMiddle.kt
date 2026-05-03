package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TextAlignMiddle: ImageVector
    get() {
        if (_textAlignMiddle != null) return _textAlignMiddle!!
        _textAlignMiddle = radixIcon(
            name = "TextAlignMiddle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.500 5.900 C 3.606 5.900 3.708 5.858 3.783 5.783 L 5.783 3.783 C 5.939 3.627 5.939 3.372 5.783 3.216 C 5.627 3.060 5.373 3.061 5.217 3.216 L 3.900 4.533 L 3.900 0.500 L 3.892 0.419 C 3.854 0.237 3.693 0.099 3.500 0.099 C 3.279 0.099 3.100 0.279 3.100 0.500 L 3.100 4.533 L 1.783 3.216 L 1.720 3.166 C 1.565 3.063 1.353 3.080 1.217 3.216 C 1.080 3.353 1.064 3.564 1.166 3.719 L 1.217 3.783 L 3.217 5.783 C 3.292 5.858 3.394 5.900 3.500 5.900 ZM 14.500 5.000 C 14.776 5.000 15.000 4.776 15.000 4.500 C 15.000 4.224 14.776 4.000 14.500 4.000 L 8.500 4.000 C 8.224 4.000 8.000 4.224 8.000 4.500 C 8.000 4.776 8.224 5.000 8.500 5.000 L 14.500 5.000 ZM 14.500 8.000 C 14.776 8.000 15.000 7.776 15.000 7.500 C 15.000 7.224 14.776 7.000 14.500 7.000 L 8.500 7.000 C 8.224 7.000 8.000 7.224 8.000 7.500 C 8.000 7.776 8.224 8.000 8.500 8.000 L 14.500 8.000 ZM 3.500 14.900 C 3.693 14.900 3.854 14.763 3.892 14.581 L 3.900 14.500 L 3.900 10.466 L 5.217 11.783 C 5.373 11.939 5.627 11.939 5.783 11.783 C 5.939 11.627 5.939 11.373 5.783 11.216 L 3.783 9.216 C 3.708 9.141 3.606 9.099 3.500 9.099 C 3.394 9.099 3.292 9.142 3.217 9.216 L 1.217 11.216 L 1.166 11.280 C 1.064 11.435 1.080 11.646 1.217 11.783 C 1.353 11.919 1.564 11.936 1.720 11.834 L 1.783 11.783 L 3.100 10.466 L 3.100 14.500 C 3.100 14.720 3.279 14.900 3.500 14.900 ZM 14.500 11.000 C 14.776 11.000 15.000 10.776 15.000 10.500 C 15.000 10.224 14.776 10.000 14.500 10.000 L 8.500 10.000 C 8.224 10.000 8.000 10.224 8.000 10.500 C 8.000 10.776 8.224 11.000 8.500 11.000 L 14.500 11.000 Z"),
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
        return _textAlignMiddle!!
    }

private var _textAlignMiddle: ImageVector? = null
