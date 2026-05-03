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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 1.000 L 4.000 4.000 L 1.000 4.000 L 1.000 6.000 L 4.000 6.000 L 4.000 9.000 L 6.000 9.000 L 6.000 6.000 L 9.000 6.000 L 9.000 4.000 L 6.000 4.000 L 6.000 1.000 L 4.000 1.000 ZM 3.000 20.007 L 3.000 11.000 L 5.000 11.000 L 5.000 19.000 L 13.000 19.000 L 13.000 14.000 C 13.000 13.450 13.450 13.000 14.000 13.000 L 19.000 12.999 L 19.000 5.000 L 11.000 5.000 L 11.000 3.000 L 20.007 3.000 C 20.555 3.000 21.000 3.456 21.000 4.002 L 21.000 15.000 L 15.000 20.996 L 4.002 21.000 C 3.449 21.000 3.000 20.555 3.000 20.007 ZM 18.171 14.999 L 15.000 15.000 L 15.000 18.169 L 18.171 14.999 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _stickyNoteAddLine!!
    }

private var _stickyNoteAddLine: ImageVector? = null
