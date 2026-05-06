package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HomeSmile2Line: ImageVector
    get() {
        if (_homeSmile2Line != null) return _homeSmile2Line!!
        _homeSmile2Line = remixIcon(
            name = "HomeSmile2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 19v-9.201L12 4.277 5 9.799v9.201h14ZM21 20c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-10.686c0-.306 .14-.595 .381-.785L11.381 2.218c.363-.287 .875-.287 1.239 0l8 6.311c.24 .19 .381 .479 .381 .785v10.686ZM7 12h2c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3h2c0 2.761-2.239 5-5 5C9.239 17 7 14.761 7 12Z"),
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
        return _homeSmile2Line!!
    }

private var _homeSmile2Line: ImageVector? = null
