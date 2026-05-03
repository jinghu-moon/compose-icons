package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BookmarkFill: ImageVector
    get() {
        if (_bookmarkFill != null) return _bookmarkFill!!
        _bookmarkFill = remixIcon(
            name = "BookmarkFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 2.000 L 19.000 2.000 C 19.552 2.000 20.000 2.448 20.000 3.000 L 20.000 22.143 C 20.000 22.419 19.776 22.643 19.500 22.643 C 19.406 22.643 19.314 22.617 19.234 22.567 L 12.000 18.031 L 4.766 22.567 C 4.532 22.714 4.223 22.643 4.076 22.409 C 4.026 22.329 4.000 22.237 4.000 22.143 L 4.000 3.000 C 4.000 2.448 4.448 2.000 5.000 2.000 Z"),
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
        return _bookmarkFill!!
    }

private var _bookmarkFill: ImageVector? = null
