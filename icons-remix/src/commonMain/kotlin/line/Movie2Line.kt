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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 20.000 L 20.000 20.000 L 20.000 22.000 L 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 14.251 21.256 16.329 20.001 18.000 L 17.292 18.000 C 18.952 16.534 20.000 14.389 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 ZM 12.000 10.000 C 10.895 10.000 10.000 9.105 10.000 8.000 C 10.000 6.895 10.895 6.000 12.000 6.000 C 13.105 6.000 14.000 6.895 14.000 8.000 C 14.000 9.105 13.105 10.000 12.000 10.000 ZM 8.000 14.000 C 6.895 14.000 6.000 13.105 6.000 12.000 C 6.000 10.895 6.895 10.000 8.000 10.000 C 9.105 10.000 10.000 10.895 10.000 12.000 C 10.000 13.105 9.105 14.000 8.000 14.000 ZM 16.000 14.000 C 14.895 14.000 14.000 13.105 14.000 12.000 C 14.000 10.895 14.895 10.000 16.000 10.000 C 17.105 10.000 18.000 10.895 18.000 12.000 C 18.000 13.105 17.105 14.000 16.000 14.000 ZM 12.000 18.000 C 10.895 18.000 10.000 17.105 10.000 16.000 C 10.000 14.895 10.895 14.000 12.000 14.000 C 13.105 14.000 14.000 14.895 14.000 16.000 C 14.000 17.105 13.105 18.000 12.000 18.000 Z"),
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
        return _movie2Line!!
    }

private var _movie2Line: ImageVector? = null
