package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TShirt2Line: ImageVector
    get() {
        if (_tShirt2Line != null) return _tShirt2Line!!
        _tShirt2Line = remixIcon(
            name = "TShirt2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.998 3c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3h6c.552 0 1 .448 1 1v7c0 .552-.448 1-1 1h-2.001l.001 8c0 .552-.448 1-1 1h-12c-.552 0-1-.448-1-1L4.997 11.999 2.998 12c-.552 0-1-.448-1-1v-7c0-.552 .448-1 1-1h6ZM19.998 4.999h-3.417l-.017 .041c-.753 1.682-2.408 2.872-4.349 2.955L11.998 8C9.963 8 8.212 6.785 7.432 5.04L7.414 4.999h-3.416v5L6.997 9.998 6.997 19h10.001l-.001-9 3.001-.001v-5Z"),
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
        return _tShirt2Line!!
    }

private var _tShirt2Line: ImageVector? = null
