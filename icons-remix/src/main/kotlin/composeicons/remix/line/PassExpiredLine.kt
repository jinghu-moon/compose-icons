package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PassExpiredLine: ImageVector
    get() {
        if (_passExpiredLine != null) return _passExpiredLine!!
        _passExpiredLine = remixIcon(
            name = "PassExpiredLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 18h18v-12h-18v12ZM1 5C1 4.448 1.448 4 2 4h20c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-20C1.448 20 1 19.552 1 19v-14ZM9 10C9 9.448 8.552 9 8 9 7.448 9 7 9.448 7 10c0 .552 .448 1 1 1 .552 0 1-.448 1-1ZM11 10c0 1.657-1.343 3-3 3C6.343 13 5 11.657 5 10 5 8.343 6.343 7 8 7c1.657 0 3 1.343 3 3ZM8.002 16c-.967 0-1.84 .391-2.475 1.025L4.113 15.611C5.107 14.617 6.483 14 8.002 14c1.519 0 2.895 .617 3.889 1.611l-1.414 1.414C9.842 16.391 8.969 16 8.002 16ZM17.793 8.793 16 10.586 14.207 8.793l-1.414 1.414L14.586 12l-1.793 1.793 1.414 1.414L16 13.414l1.793 1.793 1.414-1.414L17.414 12l1.793-1.793L17.793 8.793Z"),
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
        return _passExpiredLine!!
    }

private var _passExpiredLine: ImageVector? = null
