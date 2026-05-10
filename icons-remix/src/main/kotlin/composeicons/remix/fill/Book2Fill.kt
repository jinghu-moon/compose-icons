package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Book2Fill: ImageVector
    get() {
        if (_book2Fill != null) return _book2Fill!!
        _book2Fill = remixIcon(
            name = "Book2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 18h-15c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h15v2h-15C4.343 22 3 20.657 3 19v-15C3 2.895 3.895 2 5 2h16v16ZM16 9v-2h-8v2h8Z"),
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
        return _book2Fill!!
    }

private var _book2Fill: ImageVector? = null
