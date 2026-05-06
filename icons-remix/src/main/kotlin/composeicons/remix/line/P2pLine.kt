package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.P2pLine: ImageVector
    get() {
        if (_p2pLine != null) return _p2pLine!!
        _p2pLine = remixIcon(
            name = "P2pLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 6C16.448 6 16 5.552 16 5c0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552-.448 1-1 1ZM17 8c1.657 0 3-1.343 3-3C20 3.343 18.657 2 17 2 15.343 2 14 3.343 14 5c0 1.657 1.343 3 3 3ZM7 3C4.791 3 3 4.791 3 7v2h2v-2C5 5.895 5.895 5 7 5h3v-2h-3ZM17 21c2.209 0 4-1.791 4-4v-2h-2v2c0 1.105-.895 2-2 2h-3v2h3ZM8 13C8 12.448 7.552 12 7 12c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1ZM10 13c0 1.657-1.343 3-3 3C5.343 16 4 14.657 4 13 4 11.343 5.343 10 7 10c1.657 0 3 1.343 3 3ZM17 11c-1.105 0-2 .895-2 2h-2c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4h-2c0-1.105-.895-2-2-2ZM5 21c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2h2C11 18.791 9.209 17 7 17 4.791 17 3 18.791 3 21h2Z"),
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
        return _p2pLine!!
    }

private var _p2pLine: ImageVector? = null
