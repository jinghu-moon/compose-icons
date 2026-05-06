package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EmotionLine: ImageVector
    get() {
        if (_emotionLine != null) return _emotionLine!!
        _emotionLine = remixIcon(
            name = "EmotionLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM12 20c4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8ZM8 13h8c0 2.209-1.791 4-4 4C9.791 17 8 15.209 8 13ZM8 11C7.172 11 6.5 10.328 6.5 9.5 6.5 8.672 7.172 8 8 8c.828 0 1.5 .672 1.5 1.5C9.5 10.328 8.828 11 8 11ZM16 11c-.828 0-1.5-.672-1.5-1.5C14.5 8.672 15.172 8 16 8c.828 0 1.5 .672 1.5 1.5C17.5 10.328 16.828 11 16 11Z"),
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
        return _emotionLine!!
    }

private var _emotionLine: ImageVector? = null
