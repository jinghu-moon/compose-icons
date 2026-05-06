package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoonClearFill: ImageVector
    get() {
        if (_moonClearFill != null) return _moonClearFill!!
        _moonClearFill = remixIcon(
            name = "MoonClearFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.822 2.238C9.294 3.383 9 4.657 9 6c0 4.971 4.029 9 9 9 1.343 0 2.617-.294 3.762-.822C20.768 18.654 16.775 22 12 22 6.477 22 2 17.523 2 12 2 7.225 5.346 3.232 9.822 2.238ZM18.164 2.291 19 2.5v1l-.836 .209c-.717 .179-1.276 .739-1.455 1.455L16.5 6h-1l-.209-.836C15.112 4.448 14.552 3.888 13.836 3.709L13 3.5v-1l.836-.209c.717-.179 1.276-.739 1.455-1.455L15.5 0h1l.209 .836c.179 .717 .739 1.276 1.455 1.455ZM23.164 7.291 24 7.5v1l-.836 .209c-.717 .179-1.276 .739-1.455 1.455L21.5 11h-1l-.209-.836C20.112 9.448 19.552 8.888 18.836 8.709L18 8.5v-1l.836-.209c.717-.179 1.276-.739 1.455-1.455L20.5 5h1l.209 .836c.179 .717 .739 1.276 1.455 1.455Z"),
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
        return _moonClearFill!!
    }

private var _moonClearFill: ImageVector? = null
