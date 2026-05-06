package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TwitterXLine: ImageVector
    get() {
        if (_twitterXLine != null) return _twitterXLine!!
        _twitterXLine = remixIcon(
            name = "TwitterXLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.488 14.651 15.25 21h7L14.392 10.522 20.931 3h-2.65L13.164 8.886 8.75 3h-7L9.261 13.014 2.319 21h2.65l5.519-6.349ZM16.25 19 5.75 5h2L18.25 19h-2Z"),
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
        return _twitterXLine!!
    }

private var _twitterXLine: ImageVector? = null
