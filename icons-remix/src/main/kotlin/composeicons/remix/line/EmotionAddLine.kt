package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EmotionAddLine: ImageVector
    get() {
        if (_emotionAddLine != null) return _emotionAddLine!!
        _emotionAddLine = remixIcon(
            name = "EmotionAddLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c.375 0 .746 .02 1.11 .061l-.221 1.988C12.598 4.017 12.301 4 12 4 7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-.301-.017-.598-.049-.89l1.988-.221c.04 .365 .06 .736 .06 1.11 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM16 13c0 2.209-1.791 4-4 4C9.791 17 8 15.209 8 13h8ZM20 4h3v2h-3v3h-2v-3h-3v-2h3v-3h2v3Z"),
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
        return _emotionAddLine!!
    }

private var _emotionAddLine: ImageVector? = null
