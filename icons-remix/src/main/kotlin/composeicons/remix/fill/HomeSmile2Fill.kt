package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HomeSmile2Fill: ImageVector
    get() {
        if (_homeSmile2Fill != null) return _homeSmile2Fill!!
        _homeSmile2Fill = remixIcon(
            name = "HomeSmile2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 20c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-10.686c0-.306 .14-.595 .381-.785L11.381 2.218c.363-.287 .875-.287 1.239 0l8 6.311c.24 .19 .381 .479 .381 .785v10.686ZM7 12c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5h-2c0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12h-2Z"),
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
        return _homeSmile2Fill!!
    }

private var _homeSmile2Fill: ImageVector? = null
