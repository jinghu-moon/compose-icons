package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.QuestionLine: ImageVector
    get() {
        if (_questionLine != null) return _questionLine!!
        _questionLine = remixIcon(
            name = "QuestionLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM12 20c4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8ZM11 15h2v2h-2v-2ZM13 13.355v.645h-2v-1.5c0-.552 .448-1 1-1 .828 0 1.5-.672 1.5-1.5C13.5 9.172 12.828 8.5 12 8.5c-.728 0-1.334 .518-1.471 1.206L8.567 9.313C8.886 7.709 10.302 6.5 12 6.5c1.933 0 3.5 1.567 3.5 3.5 0 1.585-1.054 2.925-2.5 3.355Z"),
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
        return _questionLine!!
    }

private var _questionLine: ImageVector? = null
