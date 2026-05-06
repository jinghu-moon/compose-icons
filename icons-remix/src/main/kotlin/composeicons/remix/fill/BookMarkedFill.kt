package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BookMarkedFill: ImageVector
    get() {
        if (_bookMarkedFill != null) return _bookMarkedFill!!
        _bookMarkedFill = remixIcon(
            name = "BookMarkedFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 22h-13.5C4.567 22 3 20.433 3 18.5v-13.5C3 3.343 4.343 2 6 2h14c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1ZM19 20v-3h-12.5C5.672 17 5 17.672 5 18.5 5 19.328 5.672 20 6.5 20h12.5ZM10 4v8l3.5-2L17 12v-8h-7Z"),
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
        return _bookMarkedFill!!
    }

private var _bookMarkedFill: ImageVector? = null
