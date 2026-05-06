package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.QuestionAnswerLine: ImageVector
    get() {
        if (_questionAnswerLine != null) return _questionAnswerLine!!
        _questionAnswerLine = remixIcon(
            name = "QuestionAnswerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.455 15 1 18.5v-15.5C1 2.448 1.448 2 2 2h15c.552 0 1 .448 1 1v12h-12.545ZM4.763 13h11.237v-9h-13v10.385L4.763 13ZM8 17h10.237L20 18.385v-10.385h1c.552 0 1 .448 1 1v13.5L17.545 19h-8.545C8.448 19 8 18.552 8 18v-1Z"),
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
        return _questionAnswerLine!!
    }

private var _questionAnswerLine: ImageVector? = null
