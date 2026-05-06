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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.5 10c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-8C2.224 11 2 10.776 2 10.5 2 10.224 2.224 10 2.5 10h8ZM7.5 7C7.776 7 8 7.224 8 7.5 8 7.776 7.776 8 7.5 8h-5C2.224 8 2 7.776 2 7.5 2 7.224 2.224 7 2.5 7h5ZM12.5 4c.276 0 .5 .224 .5 .5C13 4.776 12.776 5 12.5 5h-10C2.224 5 2 4.776 2 4.5 2 4.224 2.224 4 2.5 4h10Z"),
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
        return _textAlignLeft!!
    }

private var _textAlignLeft: ImageVector? = null
