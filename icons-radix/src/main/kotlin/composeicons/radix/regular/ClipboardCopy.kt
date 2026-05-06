package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ClipboardCopy: ImageVector
    get() {
        if (_clipboardCopy != null) return _clipboardCopy!!
        _clipboardCopy = radixIcon(
            name = "ClipboardCopy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.5 14c.276 0 .5 .224 .5 .5C9 14.776 8.776 15 8.5 15 8.224 15 8 14.776 8 14.5 8 14.224 8.224 14 8.5 14ZM10.5 14c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C10.224 15 10 14.776 10 14.5c0-.276 .224-.5 .5-.5ZM12.5 14c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C12.224 15 12 14.776 12 14.5c0-.276 .224-.5 .5-.5ZM14.5 14c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C14.224 15 14 14.776 14 14.5c0-.276 .224-.5 .5-.5ZM10.25 0C10.664 0 11 .336 11 .75v.25h.5C12.328 1 13 1.672 13 2.5v4.5h-1v-4.5C12 2.224 11.776 2 11.5 2h-.5v.25C11 2.664 10.664 3 10.25 3h-5.5C4.336 3 4 2.664 4 2.25v-.25h-.5C3.224 2 3 2.224 3 2.5v10c0 .276 .224 .5 .5 .5h3.5v1h-3.5C2.672 14 2 13.328 2 12.5v-10C2 1.672 2.672 1 3.5 1h.5v-.25C4 .336 4.336 0 4.75 0h5.5ZM8.5 12c.276 0 .5 .224 .5 .5C9 12.776 8.776 13 8.5 13 8.224 13 8 12.776 8 12.5 8 12.224 8.224 12 8.5 12ZM14.5 12c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C14.224 13 14 12.776 14 12.5c0-.276 .224-.5 .5-.5ZM8.5 10c.276 0 .5 .224 .5 .5C9 10.776 8.776 11 8.5 11 8.224 11 8 10.776 8 10.5 8 10.224 8.224 10 8.5 10ZM14.5 10c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C14.224 11 14 10.776 14 10.5c0-.276 .224-.5 .5-.5ZM8.5 8C8.776 8 9 8.224 9 8.5 9 8.776 8.776 9 8.5 9 8.224 9 8 8.776 8 8.5 8 8.224 8.224 8 8.5 8ZM10.5 8c.276 0 .5 .224 .5 .5C11 8.776 10.776 9 10.5 9 10.224 9 10 8.776 10 8.5 10 8.224 10.224 8 10.5 8ZM12.5 8c.276 0 .5 .224 .5 .5C13 8.776 12.776 9 12.5 9 12.224 9 12 8.776 12 8.5 12 8.224 12.224 8 12.5 8ZM14.5 8c.276 0 .5 .224 .5 .5C15 8.776 14.776 9 14.5 9 14.224 9 14 8.776 14 8.5 14 8.224 14.224 8 14.5 8ZM5 2h5v-1h-5v1Z"),
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
        return _clipboardCopy!!
    }

private var _clipboardCopy: ImageVector? = null
