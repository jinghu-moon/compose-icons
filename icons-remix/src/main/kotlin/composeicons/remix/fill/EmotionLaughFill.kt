package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EmotionLaughFill: ImageVector
    get() {
        if (_emotionLaughFill != null) return _emotionLaughFill!!
        _emotionLaughFill = remixIcon(
            name = "EmotionLaughFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 11c-2 0-3.667 .333-5 1 0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5-1.333-.667-3-1-5-1ZM8.5 7C7.348 7 6.378 7.779 6.088 8.84l-.038 .161h4.9C10.719 7.859 9.71 7 8.5 7ZM15.5 7c-1.152 0-2.122 .779-2.412 1.84l-.038 .161h4.9C17.719 7.859 16.71 7 15.5 7Z"),
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
        return _emotionLaughFill!!
    }

private var _emotionLaughFill: ImageVector? = null
