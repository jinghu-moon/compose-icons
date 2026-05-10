package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EmotionNormalFill: ImageVector
    get() {
        if (_emotionNormalFill != null) return _emotionNormalFill!!
        _emotionNormalFill = remixIcon(
            name = "EmotionNormalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM8 14v2h8v-2h-8ZM8 11c.828 0 1.5-.672 1.5-1.5C9.5 8.672 8.828 8 8 8 7.172 8 6.5 8.672 6.5 9.5 6.5 10.328 7.172 11 8 11ZM16 11c.828 0 1.5-.672 1.5-1.5C17.5 8.672 16.828 8 16 8c-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5Z"),
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
        return _emotionNormalFill!!
    }

private var _emotionNormalFill: ImageVector? = null
