package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.QuestionAnswerFill: ImageVector
    get() {
        if (_questionAnswerFill != null) return _questionAnswerFill!!
        _questionAnswerFill = remixIcon(
            name = "QuestionAnswerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 18h10.237L20 19.385v-10.385h1c.552 0 1 .448 1 1v13.5L17.545 20h-8.545C8.448 20 8 19.552 8 19v-1ZM5.455 16 1 19.5v-15.5C1 3.448 1.448 3 2 3h15c.552 0 1 .448 1 1v12h-12.545Z"),
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
        return _questionAnswerFill!!
    }

private var _questionAnswerFill: ImageVector? = null
