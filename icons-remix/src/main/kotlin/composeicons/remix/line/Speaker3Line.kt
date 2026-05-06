package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Speaker3Line: ImageVector
    get() {
        if (_speaker3Line != null) return _speaker3Line!!
        _speaker3Line = remixIcon(
            name = "Speaker3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 5v14h14v-14h-14ZM4 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3ZM7 8C6.448 8 6 7.552 6 7 6 6.448 6.448 6 7 6c.552 0 1 .448 1 1C8 7.552 7.552 8 7 8ZM17 8C16.448 8 16 7.552 16 7c0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552-.448 1-1 1ZM17 18c-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552-.448 1-1 1ZM7 18C6.448 18 6 17.552 6 17c0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552-.448 1-1 1ZM12 15c1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12c0 1.657 1.343 3 3 3ZM12 17C9.239 17 7 14.761 7 12 7 9.239 9.239 7 12 7c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5ZM12 13c-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552-.448 1-1 1Z"),
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
        return _speaker3Line!!
    }

private var _speaker3Line: ImageVector? = null
