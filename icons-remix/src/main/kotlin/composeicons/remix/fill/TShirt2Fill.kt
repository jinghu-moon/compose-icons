package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TShirt2Fill: ImageVector
    get() {
        if (_tShirt2Fill != null) return _tShirt2Fill!!
        _tShirt2Fill = remixIcon(
            name = "TShirt2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.998 3c.552 0 1 .448 1 1v7c0 .552-.448 1-1 1h-2.001l.001 8c0 .552-.448 1-1 1h-12c-.552 0-1-.448-1-1L4.997 11.999 2.998 12c-.552 0-1-.448-1-1v-7c0-.552 .448-1 1-1h6c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3h6Z"),
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
        return _tShirt2Fill!!
    }

private var _tShirt2Fill: ImageVector? = null
