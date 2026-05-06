package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GolfBallLine: ImageVector
    get() {
        if (_golfBallLine != null) return _golfBallLine!!
        _golfBallLine = remixIcon(
            name = "GolfBallLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 20C7.582 20 4 16.418 4 12 4 7.582 7.582 4 12 4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM12 22c5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10ZM14 7c0 .552-.448 1-1 1C12.448 8 12 7.552 12 7c0-.552 .448-1 1-1 .552 0 1 .448 1 1ZM13 11c.552 0 1-.448 1-1C14 9.448 13.552 9 13 9c-.552 0-1 .448-1 1 0 .552 .448 1 1 1ZM17 12c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1ZM16 10c.552 0 1-.448 1-1C17 8.448 16.552 8 16 8c-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _golfBallLine!!
    }

private var _golfBallLine: ImageVector? = null
