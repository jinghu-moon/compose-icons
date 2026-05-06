package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpotifyLine: ImageVector
    get() {
        if (_spotifyLine != null) return _spotifyLine!!
        _spotifyLine = remixIcon(
            name = "SpotifyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 2c5.55 0 10 4.5 10 10 0 5.5-4.5 10-10 10C6.501 22 2.001 17.5 2.001 12 2.001 6.5 6.501 2 12.001 2ZM12.001 4C7.606 4 4.001 7.605 4.001 12c0 4.395 3.605 8 8 8 4.395 0 8-3.605 8-8 0-4.414-3.573-8-8-8ZM15.751 16.65C13.401 15.2 10.451 14.899 6.95 15.699c-.348 .102-.649-.149-.749-.449-.1-.351 .15-.65 .45-.75 3.8-.851 7.1-.5 9.7 1.1 .35 .15 .399 .549 .251 .85-.2 .299-.55 .4-.851 .2ZM16.75 13.95C14.051 12.3 9.951 11.8 6.801 12.8c-.399 .1-.85-.1-.95-.5-.1-.4 .1-.851 .5-.951 3.65-1.099 8.15-.548 11.25 1.351 .301 .151 .45 .65 .201 1-.251 .35-.701 .5-1.052 .25ZM6.301 9.751c-.5 .149-1-.151-1.15-.601-.15-.501 .15-1 .6-1.151C9.301 6.949 15.151 7.149 18.852 9.35c.449 .25 .599 .85 .349 1.3-.249 .351-.85 .499-1.299 .25C14.701 9 9.351 8.8 6.301 9.751Z"),
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
        return _spotifyLine!!
    }

private var _spotifyLine: ImageVector? = null
