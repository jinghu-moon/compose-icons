package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DvLine: ImageVector
    get() {
        if (_dvLine != null) return _dvLine!!
        _dvLine = remixIcon(
            name = "DvLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.608 3h9.392c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-7v-2h6v-10h-6.255C14.536 6.134 15 7.513 15 9c0 2.379-1.186 4.48-3 5.745v6.255c0 .552-.448 1-1 1h-6C4.448 22 4 21.552 4 21v-6.255C2.187 13.48 1 11.379 1 9 1 5.134 4.134 2 8 2c1.32 0 2.554 .365 3.608 1v0ZM6 13.584v6.416h4v-6.416C11.766 12.812 13 11.05 13 9 13 6.239 10.761 4 8 4 5.239 4 3 6.239 3 9c0 2.05 1.234 3.812 3 4.584ZM8 12C6.343 12 5 10.657 5 9 5 7.343 6.343 6 8 6c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3ZM8 10c.552 0 1-.448 1-1C9 8.448 8.552 8 8 8 7.448 8 7 8.448 7 9c0 .552 .448 1 1 1ZM17 7h2v2h-2v-2ZM7 17h2v2h-2v-2Z"),
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
        return _dvLine!!
    }

private var _dvLine: ImageVector? = null
