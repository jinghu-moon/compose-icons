package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BookOpenLine: ImageVector
    get() {
        if (_bookOpenLine != null) return _bookOpenLine!!
        _bookOpenLine = remixIcon(
            name = "BookOpenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 21v2h-2v-2h-8C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h6c1.195 0 2.267 .524 3 1.354C12.733 3.524 13.805 3 15 3h6c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-8ZM20 19v-14h-5c-1.105 0-2 .895-2 2v12h7ZM11 19v-12C11 5.895 10.105 5 9 5h-5v14h7Z"),
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
        return _bookOpenLine!!
    }

private var _bookOpenLine: ImageVector? = null
