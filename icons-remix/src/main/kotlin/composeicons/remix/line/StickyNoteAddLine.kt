package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StickyNoteAddLine: ImageVector
    get() {
        if (_stickyNoteAddLine != null) return _stickyNoteAddLine!!
        _stickyNoteAddLine = remixIcon(
            name = "StickyNoteAddLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 1v3h-3v2h3v3h2v-3h3v-2h-3v-3h-2ZM3 20.007v-9.007h2v8h8v-5c0-.55 .45-1 1-1l5-.001v-7.999h-8v-2h9.007c.549 0 .993 .456 .993 1.002v10.998l-6 5.996L4.002 21C3.449 21 3 20.555 3 20.007ZM18.171 14.999 15 15v3.169l3.171-3.17Z"),
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
        return _stickyNoteAddLine!!
    }

private var _stickyNoteAddLine: ImageVector? = null
