package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TextAlignJustify: ImageVector
    get() {
        if (_textAlignJustify != null) return _textAlignJustify!!
        _textAlignJustify = radixIcon(
            name = "TextAlignJustify",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.601 10.010 C 12.829 10.056 13.000 10.258 13.000 10.500 C 13.000 10.742 12.829 10.944 12.601 10.990 L 12.500 11.000 L 2.500 11.000 C 2.224 11.000 2.000 10.776 2.000 10.500 C 2.000 10.224 2.224 10.000 2.500 10.000 L 12.500 10.000 L 12.601 10.010 ZM 12.601 7.010 C 12.829 7.056 13.000 7.258 13.000 7.500 C 13.000 7.742 12.829 7.944 12.601 7.990 L 12.500 8.000 L 2.500 8.000 C 2.224 8.000 2.000 7.776 2.000 7.500 C 2.000 7.224 2.224 7.000 2.500 7.000 L 12.500 7.000 L 12.601 7.010 ZM 12.601 4.010 C 12.829 4.056 13.000 4.258 13.000 4.500 C 13.000 4.742 12.829 4.944 12.601 4.990 L 12.500 5.000 L 2.500 5.000 C 2.224 5.000 2.000 4.776 2.000 4.500 C 2.000 4.224 2.224 4.000 2.500 4.000 L 12.500 4.000 L 12.601 4.010 Z"),
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
        return _textAlignJustify!!
    }

private var _textAlignJustify: ImageVector? = null
