package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Movie2Line: ImageVector
    get() {
        if (_movie2Line != null) return _movie2Line!!
        _movie2Line = remixIcon(
            name = "Movie2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 20h8v2h-8C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 2.251-.744 4.329-1.999 6h-2.709C18.952 16.534 20 14.389 20 12 20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8ZM12 10C10.895 10 10 9.105 10 8c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2ZM8 14C6.895 14 6 13.105 6 12c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2ZM16 14c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2ZM12 18c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
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
        return _movie2Line!!
    }

private var _movie2Line: ImageVector? = null
