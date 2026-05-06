package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Padding: ImageVector
    get() {
        if (_padding != null) return _padding!!
        _padding = radixIcon(
            name = "Padding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.333 1.01C13.269 1.105 14 1.896 14 2.857v9.285l-.01 .19c-.089 .874-.783 1.568-1.657 1.657L12.143 14h-9.285l-.19-.01C1.793 13.901 1.099 13.207 1.01 12.333L1 12.143v-9.285C1 1.896 1.731 1.105 2.667 1.01L2.857 1h9.285l.19 .01ZM2.857 2C2.384 2 2 2.384 2 2.857v9.285c0 .473 .384 .857 .857 .857h9.285c.473 0 .857-.384 .857-.857v-9.285C13 2.384 12.616 2 12.143 2h-9.285ZM4.5 10c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C4.224 11 4 10.776 4 10.5 4 10.224 4.224 10 4.5 10ZM7.5 10c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C7.224 11 7 10.776 7 10.5 7 10.224 7.224 10 7.5 10ZM10.5 10c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C10.224 11 10 10.776 10 10.5c0-.276 .224-.5 .5-.5ZM4.5 7c.276 0 .5 .224 .5 .5C5 7.776 4.776 8 4.5 8 4.224 8 4 7.776 4 7.5 4 7.224 4.224 7 4.5 7ZM10.5 7c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C10.224 8 10 7.776 10 7.5 10 7.224 10.224 7 10.5 7ZM4.5 4c.276 0 .5 .224 .5 .5C5 4.776 4.776 5 4.5 5 4.224 5 4 4.776 4 4.5 4 4.224 4.224 4 4.5 4ZM7.5 4c.276 0 .5 .224 .5 .5C8 4.776 7.776 5 7.5 5 7.224 5 7 4.776 7 4.5 7 4.224 7.224 4 7.5 4ZM10.5 4c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C10.224 5 10 4.776 10 4.5 10 4.224 10.224 4 10.5 4Z"),
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
        return _padding!!
    }

private var _padding: ImageVector? = null
