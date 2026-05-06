package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PagesFill: ImageVector
    get() {
        if (_pagesFill != null) return _pagesFill!!
        _pagesFill = remixIcon(
            name = "PagesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 22h-16C3.448 22 3 21.552 3 21v-13h18v13c0 .552-.448 1-1 1ZM21 6h-18v-3C3 2.448 3.448 2 4 2h16c.552 0 1 .448 1 1v3ZM7 11v4h4v-4h-4ZM7 17v2h10v-2h-10ZM13 12v2h4v-2h-4Z"),
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
        return _pagesFill!!
    }

private var _pagesFill: ImageVector? = null
