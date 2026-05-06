package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoonClearLine: ImageVector
    get() {
        if (_moonClearLine != null) return _moonClearLine!!
        _moonClearLine = remixIcon(
            name = "MoonClearLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 6c0 4.418 3.582 8 8 8 1.439 0 2.788-.38 3.955-1.044C21.474 18.03 17.201 22 12 22 6.477 22 2 17.523 2 12 2 6.799 5.97 2.526 11.044 2.045 10.38 3.212 10 4.561 10 6ZM4 12c0 4.418 3.582 8 8 8 2.965 0 5.576-1.621 6.957-4.045C18.641 15.985 18.321 16 18 16 12.477 16 8 11.523 8 6c0-.321 .015-.641 .045-.957C5.621 6.424 4 9.035 4 12ZM18.164 2.291 19 2.5v1l-.836 .209c-.717 .179-1.276 .739-1.455 1.455L16.5 6h-1l-.209-.836C15.112 4.448 14.552 3.888 13.836 3.709L13 3.5v-1l.836-.209c.717-.179 1.276-.739 1.455-1.455L15.5 0h1l.209 .836c.179 .717 .739 1.276 1.455 1.455ZM23.164 7.291 24 7.5v1l-.836 .209c-.717 .179-1.276 .739-1.455 1.455L21.5 11h-1l-.209-.836C20.112 9.448 19.552 8.888 18.836 8.709L18 8.5v-1l.836-.209c.717-.179 1.276-.739 1.455-1.455L20.5 5h1l.209 .836c.179 .717 .739 1.276 1.455 1.455Z"),
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
        return _moonClearLine!!
    }

private var _moonClearLine: ImageVector? = null
