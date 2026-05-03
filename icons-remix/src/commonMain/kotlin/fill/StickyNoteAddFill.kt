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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 1.000 L 4.000 4.000 L 1.000 4.000 L 1.000 6.000 L 4.000 6.000 L 4.000 9.000 L 6.000 9.000 L 6.000 6.000 L 9.000 6.000 L 9.000 4.000 L 6.000 4.000 L 6.000 1.000 L 4.000 1.000 ZM 11.000 5.000 C 11.000 8.314 8.314 11.000 5.000 11.000 C 4.299 11.000 3.626 10.880 3.000 10.659 L 3.000 20.007 C 3.000 20.555 3.447 21.000 3.998 21.000 L 14.000 21.000 L 14.000 15.000 C 14.000 14.450 14.450 14.000 15.000 14.000 L 21.000 14.000 L 21.000 3.999 C 21.000 3.447 20.555 3.000 20.007 3.000 L 10.659 3.000 C 10.880 3.626 11.000 4.299 11.000 5.000 ZM 21.000 16.000 L 16.000 20.997 L 16.000 16.000 L 21.000 16.000 Z"),
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
        return _stickyNoteAddFill!!
    }

private var _stickyNoteAddFill: ImageVector? = null
