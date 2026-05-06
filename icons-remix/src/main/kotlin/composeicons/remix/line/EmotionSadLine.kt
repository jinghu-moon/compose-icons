package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EmotionSadLine: ImageVector
    get() {
        if (_emotionSadLine != null) return _emotionSadLine!!
        _emotionSadLine = remixIcon(
            name = "EmotionSadLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 .727-.077 1.435-.225 2.118L19.993 12.335C19.998 12.224 20 12.112 20 12 20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 1.302 0 2.532-.311 3.619-.863 .155 .246 .339 .478 .553 .692 .302 .302 .641 .546 1.002 .731C15.664 21.474 13.894 22 12 22 6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM19 14.172l1.414 1.414c.781 .781 .781 2.047 0 2.828-.781 .781-2.047 .781-2.828 0-.746-.746-.779-1.933-.102-2.719l.102-.109L19 14.172ZM12 15c1.466 0 2.785 .631 3.7 1.637l-.945 .859C13.965 17.183 13.018 17 12 17c-1.018 0-1.965 .183-2.755 .496l-.945-.859C9.215 15.631 10.534 15 12 15ZM8.5 10c.828 0 1.5 .672 1.5 1.5C10 12.328 9.328 13 8.5 13 7.672 13 7 12.328 7 11.5 7 10.672 7.672 10 8.5 10ZM15.5 10c.828 0 1.5 .672 1.5 1.5C17 12.328 16.328 13 15.5 13 14.672 13 14 12.328 14 11.5 14 10.672 14.672 10 15.5 10Z"),
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
        return _emotionSadLine!!
    }

private var _emotionSadLine: ImageVector? = null
