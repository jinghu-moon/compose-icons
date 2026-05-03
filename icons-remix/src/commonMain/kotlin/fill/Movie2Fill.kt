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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.001 20.000 L 20.000 20.000 L 20.000 22.000 L 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 15.271 20.429 18.176 18.001 20.000 ZM 12.000 10.000 C 13.105 10.000 14.000 9.105 14.000 8.000 C 14.000 6.895 13.105 6.000 12.000 6.000 C 10.895 6.000 10.000 6.895 10.000 8.000 C 10.000 9.105 10.895 10.000 12.000 10.000 ZM 8.000 14.000 C 9.105 14.000 10.000 13.105 10.000 12.000 C 10.000 10.895 9.105 10.000 8.000 10.000 C 6.895 10.000 6.000 10.895 6.000 12.000 C 6.000 13.105 6.895 14.000 8.000 14.000 ZM 16.000 14.000 C 17.105 14.000 18.000 13.105 18.000 12.000 C 18.000 10.895 17.105 10.000 16.000 10.000 C 14.895 10.000 14.000 10.895 14.000 12.000 C 14.000 13.105 14.895 14.000 16.000 14.000 ZM 12.000 18.000 C 13.105 18.000 14.000 17.105 14.000 16.000 C 14.000 14.895 13.105 14.000 12.000 14.000 C 10.895 14.000 10.000 14.895 10.000 16.000 C 10.000 17.105 10.895 18.000 12.000 18.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _movie2Fill!!
    }

private var _movie2Fill: ImageVector? = null
