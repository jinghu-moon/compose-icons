package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Frame: ImageVector
    get() {
        if (_frame != null) return _frame!!
        _frame = radixIcon(
            name = "Frame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.5 1c.276 0 .5 .224 .5 .5v2.5h2.5l.101 .01c.228 .047 .399 .249 .399 .49 0 .242-.171 .444-.399 .49L13.5 5h-2.5v5h2.5l.101 .01c.228 .047 .399 .248 .399 .49 0 .242-.171 .444-.399 .49L13.5 11h-2.5v2.5l-.01 .101c-.047 .228-.248 .399-.49 .399-.242 0-.444-.171-.49-.399L10 13.5v-2.5h-5v2.5C5 13.776 4.776 14 4.5 14 4.224 14 4 13.776 4 13.5v-2.5h-2.5C1.224 11 1 10.776 1 10.5 1 10.224 1.224 10 1.5 10h2.5v-5h-2.5C1.224 5 1 4.776 1 4.5 1 4.224 1.224 4 1.5 4h2.5v-2.5C4 1.224 4.224 1 4.5 1 4.776 1 5 1.224 5 1.5v2.5h5v-2.5C10 1.224 10.224 1 10.5 1ZM5 10h5v-5h-5v5Z"),
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
        return _frame!!
    }

private var _frame: ImageVector? = null
