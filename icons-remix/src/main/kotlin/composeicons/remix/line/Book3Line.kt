package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Book3Line: ImageVector
    get() {
        if (_book3Line != null) return _book3Line!!
        _book3Line = remixIcon(
            name = "Book3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 4h-14C5.895 4 5 4.895 5 6c0 1.105 .895 2 2 2h14v13c0 .552-.448 1-1 1h-13C4.791 22 3 20.209 3 18v-12C3 3.791 4.791 2 7 2h13c.552 0 1 .448 1 1v1ZM5 18c0 1.105 .895 2 2 2h12v-10h-12C6.271 10 5.588 9.805 5 9.465v8.535ZM20 7h-13C6.448 7 6 6.552 6 6 6 5.448 6.448 5 7 5h13v2Z"),
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
        return _book3Line!!
    }

private var _book3Line: ImageVector? = null
