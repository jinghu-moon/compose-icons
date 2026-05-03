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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 4.000 L 7.000 4.000 C 5.895 4.000 5.000 4.895 5.000 6.000 C 5.000 7.105 5.895 8.000 7.000 8.000 L 21.000 8.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 7.000 22.000 C 4.791 22.000 3.000 20.209 3.000 18.000 L 3.000 6.000 C 3.000 3.791 4.791 2.000 7.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 4.000 ZM 5.000 18.000 C 5.000 19.105 5.895 20.000 7.000 20.000 L 19.000 20.000 L 19.000 10.000 L 7.000 10.000 C 6.271 10.000 5.588 9.805 5.000 9.465 L 5.000 18.000 ZM 20.000 7.000 L 7.000 7.000 C 6.448 7.000 6.000 6.552 6.000 6.000 C 6.000 5.448 6.448 5.000 7.000 5.000 L 20.000 5.000 L 20.000 7.000 Z"),
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
        return _book3Line!!
    }

private var _book3Line: ImageVector? = null
