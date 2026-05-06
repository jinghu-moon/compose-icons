package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BookOpenFill: ImageVector
    get() {
        if (_bookOpenFill != null) return _bookOpenFill!!
        _bookOpenFill = remixIcon(
            name = "BookOpenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 21h-8v-15C13 4.343 14.343 3 16 3h5c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1ZM11 21h-8C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h5c1.657 0 3 1.343 3 3v15ZM11 21h2v2h-2v-2Z"),
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
        return _bookOpenFill!!
    }

private var _bookOpenFill: ImageVector? = null
