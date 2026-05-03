package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TextAlignTop: ImageVector
    get() {
        if (_textAlignTop != null) return _textAlignTop!!
        _textAlignTop = radixIcon(
            name = "TextAlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.500 1.100 C 3.606 1.100 3.708 1.142 3.783 1.217 L 5.783 3.217 C 5.939 3.373 5.939 3.628 5.783 3.784 C 5.627 3.940 5.373 3.939 5.217 3.784 L 3.900 2.467 L 3.900 9.500 C 3.900 9.721 3.721 9.901 3.500 9.901 C 3.279 9.901 3.100 9.721 3.100 9.500 L 3.100 2.467 L 1.783 3.784 L 1.720 3.834 C 1.565 3.937 1.353 3.920 1.217 3.784 C 1.080 3.647 1.064 3.436 1.166 3.281 L 1.217 3.217 L 3.217 1.217 C 3.292 1.142 3.394 1.100 3.500 1.100 ZM 14.500 8.000 C 14.776 8.000 15.000 8.224 15.000 8.500 C 15.000 8.776 14.776 9.000 14.500 9.000 L 8.500 9.000 C 8.224 9.000 8.000 8.776 8.000 8.500 C 8.000 8.224 8.224 8.000 8.500 8.000 L 14.500 8.000 ZM 14.500 5.000 C 14.776 5.000 15.000 5.224 15.000 5.500 C 15.000 5.776 14.776 6.000 14.500 6.000 L 8.500 6.000 C 8.224 6.000 8.000 5.776 8.000 5.500 C 8.000 5.224 8.224 5.000 8.500 5.000 L 14.500 5.000 ZM 14.500 2.000 C 14.776 2.000 15.000 2.224 15.000 2.500 C 15.000 2.776 14.776 3.000 14.500 3.000 L 8.500 3.000 C 8.224 3.000 8.000 2.776 8.000 2.500 C 8.000 2.224 8.224 2.000 8.500 2.000 L 14.500 2.000 Z"),
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
        return _textAlignTop!!
    }

private var _textAlignTop: ImageVector? = null
