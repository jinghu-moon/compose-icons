package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Movie2Fill: ImageVector
    get() {
        if (_movie2Fill != null) return _movie2Fill!!
        _movie2Fill = remixIcon(
            name = "Movie2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.001 20h1.999v2h-8C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 3.271-1.571 6.176-3.999 8ZM12 10c1.105 0 2-.895 2-2C14 6.895 13.105 6 12 6c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM8 14c1.105 0 2-.895 2-2C10 10.895 9.105 10 8 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM16 14c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM12 18c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _movie2Fill!!
    }

private var _movie2Fill: ImageVector? = null
