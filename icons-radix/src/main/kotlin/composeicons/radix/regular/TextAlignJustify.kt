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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.601 10.01c.228 .047 .399 .248 .399 .49 0 .242-.171 .444-.399 .49L12.5 11h-10C2.224 11 2 10.776 2 10.5 2 10.224 2.224 10 2.5 10h10l.101 .01ZM12.601 7.01c.228 .047 .399 .249 .399 .49 0 .242-.171 .444-.399 .49L12.5 8h-10C2.224 8 2 7.776 2 7.5 2 7.224 2.224 7 2.5 7h10l.101 .01ZM12.601 4.01c.228 .047 .399 .249 .399 .49 0 .242-.171 .444-.399 .49L12.5 5h-10C2.224 5 2 4.776 2 4.5 2 4.224 2.224 4 2.5 4h10l.101 .01Z"),
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
        return _textAlignJustify!!
    }

private var _textAlignJustify: ImageVector? = null
