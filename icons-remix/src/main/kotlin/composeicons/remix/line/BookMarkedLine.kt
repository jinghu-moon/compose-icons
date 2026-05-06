package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BookMarkedLine: ImageVector
    get() {
        if (_bookMarkedLine != null) return _bookMarkedLine!!
        _bookMarkedLine = remixIcon(
            name = "BookMarkedLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 18.5v-13.5C3 3.343 4.343 2 6 2h14c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-13.5C4.567 22 3 20.433 3 18.5ZM19 20v-3h-12.5C5.672 17 5 17.672 5 18.5 5 19.328 5.672 20 6.5 20h12.5ZM10 4h-4C5.448 4 5 4.448 5 5v10.337C5.455 15.121 5.963 15 6.5 15h12.5v-11h-2v8L13.5 10 10 12v-8Z"),
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
        return _bookMarkedLine!!
    }

private var _bookMarkedLine: ImageVector? = null
