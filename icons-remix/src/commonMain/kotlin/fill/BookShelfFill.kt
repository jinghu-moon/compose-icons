package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BookShelfFill: ImageVector
    get() {
        if (_bookShelfFill != null) return _bookShelfFill!!
        _bookShelfFill = remixIcon(
            name = "BookShelfFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 3.000 C 3.448 3.000 3.000 3.448 3.000 4.000 L 3.000 20.000 C 3.000 20.552 3.448 21.000 4.000 21.000 L 14.000 21.000 C 14.552 21.000 15.000 20.552 15.000 20.000 L 15.000 10.697 L 17.021 20.208 C 17.136 20.748 17.667 21.093 18.208 20.978 L 21.142 20.354 C 21.682 20.239 22.027 19.708 21.912 19.168 L 19.001 5.474 C 18.887 4.934 18.356 4.589 17.815 4.704 L 15.000 5.302 L 15.000 5.000 C 15.000 4.448 14.552 4.000 14.000 4.000 L 9.000 4.000 C 9.000 3.448 8.552 3.000 8.000 3.000 L 4.000 3.000 ZM 9.000 6.000 L 13.000 6.000 L 13.000 14.000 L 9.000 14.000 L 9.000 6.000 ZM 13.000 16.000 L 13.000 19.000 L 9.000 19.000 L 9.000 16.000 L 13.000 16.000 ZM 7.000 17.000 L 7.000 19.000 L 5.000 19.000 L 5.000 17.000 L 7.000 17.000 ZM 18.770 18.814 L 18.354 16.858 L 19.332 16.650 L 19.748 18.606 L 18.770 18.814 Z"),
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
        return _bookShelfFill!!
    }

private var _bookShelfFill: ImageVector? = null
