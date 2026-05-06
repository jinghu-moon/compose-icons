package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Filter: ImageVector
    get() {
        if (_filter != null) return _filter!!
        _filter = radixIcon(
            name = "Filter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.601 10.01c.228 .047 .399 .248 .399 .49 0 .242-.171 .444-.399 .49L9.5 11h-4C5.224 11 5 10.776 5 10.5 5 10.224 5.224 10 5.5 10h4l.101 .01ZM11.601 7.01c.228 .047 .399 .249 .399 .49 0 .242-.171 .444-.399 .49L11.5 8h-8C3.224 8 3 7.776 3 7.5 3 7.224 3.224 7 3.5 7h8l.101 .01ZM13.5 4c.276 0 .5 .224 .5 .5C14 4.776 13.776 5 13.5 5h-12C1.224 5 1 4.776 1 4.5 1 4.224 1.224 4 1.5 4h12Z"),
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
        return _filter!!
    }

private var _filter: ImageVector? = null
