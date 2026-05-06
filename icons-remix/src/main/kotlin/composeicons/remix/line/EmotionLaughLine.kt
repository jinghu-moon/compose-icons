package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EmotionLaughLine: ImageVector
    get() {
        if (_emotionLaughLine != null) return _emotionLaughLine!!
        _emotionLaughLine = remixIcon(
            name = "EmotionLaughLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 4C7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4ZM12 11c2 0 3.667 .333 5 1 0 2.761-2.239 5-5 5C9.239 17 7 14.761 7 12c1.333-.667 3-1 5-1ZM8.5 7c1.21 0 2.219 .859 2.45 2.001h-4.9C6.281 7.859 7.29 7 8.5 7ZM15.5 7c1.21 0 2.219 .859 2.45 2.001h-4.9C13.281 7.859 14.29 7 15.5 7Z"),
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
        return _emotionLaughLine!!
    }

private var _emotionLaughLine: ImageVector? = null
