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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 21.000 L 13.000 23.000 L 11.000 23.000 L 11.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 9.000 3.000 C 10.195 3.000 11.267 3.524 12.000 4.354 C 12.733 3.524 13.805 3.000 15.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 13.000 21.000 ZM 20.000 19.000 L 20.000 5.000 L 15.000 5.000 C 13.895 5.000 13.000 5.895 13.000 7.000 L 13.000 19.000 L 20.000 19.000 ZM 11.000 19.000 L 11.000 7.000 C 11.000 5.895 10.105 5.000 9.000 5.000 L 4.000 5.000 L 4.000 19.000 L 11.000 19.000 Z"),
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
        return _bookOpenLine!!
    }

private var _bookOpenLine: ImageVector? = null
