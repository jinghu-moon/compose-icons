package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BorderDashed: ImageVector
    get() {
        if (_borderDashed != null) return _borderDashed!!
        _borderDashed = radixIcon(
            name = "BorderDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 7c.276 0 .5 .224 .5 .5C3.5 7.776 3.276 8 3 8h-2.5C.224 8 0 7.776 0 7.5 0 7.224 .224 7 .5 7h2.5ZM8.75 7c.276 0 .5 .224 .5 .5C9.25 7.776 9.026 8 8.75 8h-2.5C5.974 8 5.75 7.776 5.75 7.5 5.75 7.224 5.974 7 6.25 7h2.5ZM14.5 7c.276 0 .5 .224 .5 .5C15 7.776 14.776 8 14.5 8h-2.5c-.276 0-.5-.224-.5-.5C11.5 7.224 11.724 7 12 7h2.5Z"),
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
        return _borderDashed!!
    }

private var _borderDashed: ImageVector? = null
