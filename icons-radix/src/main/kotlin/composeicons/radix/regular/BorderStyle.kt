package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BorderStyle: ImageVector
    get() {
        if (_borderStyle != null) return _borderStyle!!
        _borderStyle = radixIcon(
            name = "BorderStyle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.5 11c.276 0 .5 .224 .5 .5C2 11.776 1.776 12 1.5 12 1.224 12 1 11.776 1 11.5 1 11.224 1.224 11 1.5 11ZM3.5 11c.276 0 .5 .224 .5 .5C4 11.776 3.776 12 3.5 12 3.224 12 3 11.776 3 11.5 3 11.224 3.224 11 3.5 11ZM5.5 11c.276 0 .5 .224 .5 .5C6 11.776 5.776 12 5.5 12 5.224 12 5 11.776 5 11.5 5 11.224 5.224 11 5.5 11ZM7.5 11c.276 0 .5 .224 .5 .5C8 11.776 7.776 12 7.5 12 7.224 12 7 11.776 7 11.5 7 11.224 7.224 11 7.5 11ZM9.5 11c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C9.224 12 9 11.776 9 11.5 9 11.224 9.224 11 9.5 11ZM11.5 11c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C11.224 12 11 11.776 11 11.5c0-.276 .224-.5 .5-.5ZM13.5 11c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C13.224 12 13 11.776 13 11.5c0-.276 .224-.5 .5-.5ZM3.5 7C3.776 7 4 7.224 4 7.5 4 7.776 3.776 8 3.5 8h-2C1.224 8 1 7.776 1 7.5 1 7.224 1.224 7 1.5 7h2ZM8.5 7C8.776 7 9 7.224 9 7.5 9 7.776 8.776 8 8.5 8h-2C6.224 8 6 7.776 6 7.5 6 7.224 6.224 7 6.5 7h2ZM13.5 7c.276 0 .5 .224 .5 .5C14 7.776 13.776 8 13.5 8h-2C11.224 8 11 7.776 11 7.5 11 7.224 11.224 7 11.5 7h2ZM13.5 3c.276 0 .5 .224 .5 .5C14 3.776 13.776 4 13.5 4h-12C1.224 4 1 3.776 1 3.5 1 3.224 1.224 3 1.5 3h12Z"),
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
        return _borderStyle!!
    }

private var _borderStyle: ImageVector? = null
