package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StickyNoteAddFill: ImageVector
    get() {
        if (_stickyNoteAddFill != null) return _stickyNoteAddFill!!
        _stickyNoteAddFill = remixIcon(
            name = "StickyNoteAddFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 1v3h-3v2h3v3h2v-3h3v-2h-3v-3h-2ZM11 5c0 3.314-2.686 6-6 6-.701 0-1.374-.12-2-.341v9.348c0 .549 .447 .993 .998 .993h10.002v-6c0-.55 .45-1 1-1h6v-10.001C21 3.447 20.555 3 20.007 3h-9.348c.221 .626 .341 1.299 .341 2ZM21 16l-5 4.997v-4.997h5Z"),
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
        return _stickyNoteAddFill!!
    }

private var _stickyNoteAddFill: ImageVector? = null
