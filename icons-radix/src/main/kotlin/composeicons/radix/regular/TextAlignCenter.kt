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
                pathData = parseSvgPathData("M11.5 10c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-8C3.224 11 3 10.776 3 10.5 3 10.224 3.224 10 3.5 10h8ZM10.5 7c.276 0 .5 .224 .5 .5C11 7.776 10.776 8 10.5 8h-6C4.224 8 4 7.776 4 7.5 4 7.224 4.224 7 4.5 7h6ZM12.5 4c.276 0 .5 .224 .5 .5C13 4.776 12.776 5 12.5 5h-10C2.224 5 2 4.776 2 4.5 2 4.224 2.224 4 2.5 4h10Z"),
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
