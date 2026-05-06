package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Calendar: ImageVector
    get() {
        if (_calendar != null) return _calendar!!
        _calendar = radixIcon(
            name = "Calendar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.5 1c.276 0 .5 .224 .5 .5v.5h1.5C13.328 2 14 2.672 14 3.5v9C14 13.328 13.328 14 12.5 14h-10C1.672 14 1 13.328 1 12.5v-9C1 2.672 1.672 2 2.5 2h1.5v-.5C4 1.224 4.224 1 4.5 1 4.776 1 5 1.224 5 1.5v.5h5v-.5C10 1.224 10.224 1 10.5 1ZM2 12.5l.01 .101c.04 .195 .194 .35 .39 .39L2.5 13h10l.101-.01c.195-.04 .35-.194 .39-.39L13 12.5v-6.5h-11v6.5ZM3.5 11c.276 0 .5 .224 .5 .5C4 11.776 3.776 12 3.5 12 3.224 12 3 11.776 3 11.5 3 11.224 3.224 11 3.5 11ZM5.5 11c.276 0 .5 .224 .5 .5C6 11.776 5.776 12 5.5 12 5.224 12 5 11.776 5 11.5 5 11.224 5.224 11 5.5 11ZM7.5 11c.276 0 .5 .224 .5 .5C8 11.776 7.776 12 7.5 12 7.224 12 7 11.776 7 11.5 7 11.224 7.224 11 7.5 11ZM9.5 11c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C9.224 12 9 11.776 9 11.5 9 11.224 9.224 11 9.5 11ZM3.5 9C3.776 9 4 9.224 4 9.5 4 9.776 3.776 10 3.5 10 3.224 10 3 9.776 3 9.5 3 9.224 3.224 9 3.5 9ZM5.5 9C5.776 9 6 9.224 6 9.5 6 9.776 5.776 10 5.5 10 5.224 10 5 9.776 5 9.5 5 9.224 5.224 9 5.5 9ZM7.5 9C7.776 9 8 9.224 8 9.5 8 9.776 7.776 10 7.5 10 7.224 10 7 9.776 7 9.5 7 9.224 7.224 9 7.5 9ZM9.5 9c.276 0 .5 .224 .5 .5C10 9.776 9.776 10 9.5 10 9.224 10 9 9.776 9 9.5 9 9.224 9.224 9 9.5 9ZM11.5 9c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C11.224 10 11 9.776 11 9.5 11 9.224 11.224 9 11.5 9ZM7.5 7C7.776 7 8 7.224 8 7.5 8 7.776 7.776 8 7.5 8 7.224 8 7 7.776 7 7.5 7 7.224 7.224 7 7.5 7ZM9.5 7c.276 0 .5 .224 .5 .5C10 7.776 9.776 8 9.5 8 9.224 8 9 7.776 9 7.5 9 7.224 9.224 7 9.5 7ZM11.5 7c.276 0 .5 .224 .5 .5C12 7.776 11.776 8 11.5 8 11.224 8 11 7.776 11 7.5 11 7.224 11.224 7 11.5 7ZM2.399 3.01C2.171 3.056 2 3.258 2 3.5v1.5h11v-1.5c0-.242-.171-.444-.399-.49L12.5 3h-1.5v.5C11 3.776 10.776 4 10.5 4 10.224 4 10 3.776 10 3.5v-.5h-5v.5C5 3.776 4.776 4 4.5 4 4.224 4 4 3.776 4 3.5v-.5h-1.5l-.101 .01Z"),
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
        return _calendar!!
    }

private var _calendar: ImageVector? = null
