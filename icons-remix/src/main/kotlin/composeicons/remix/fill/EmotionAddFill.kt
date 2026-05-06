package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EmotionAddFill: ImageVector
    get() {
        if (_emotionAddFill != null) return _emotionAddFill!!
        _emotionAddFill = remixIcon(
            name = "EmotionAddFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c.586 0 1.16 .053 1.719 .149C13.26 2.997 13 3.968 13 5c0 3.314 2.686 6 6 6 1.031 0 2.002-.261 2.85-.72 .097 .559 .15 1.133 .15 1.72 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM8 13c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4h-8ZM20 4h3v2h-3v3h-2v-3h-3v-2h3v-3h2v3Z"),
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
        return _emotionAddFill!!
    }

private var _emotionAddFill: ImageVector? = null
