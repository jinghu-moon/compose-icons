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
                pathData = parseSvgPathData("M 8.000 18.000 L 18.237 18.000 L 20.000 19.385 L 20.000 9.000 L 21.000 9.000 C 21.552 9.000 22.000 9.448 22.000 10.000 L 22.000 23.500 L 17.545 20.000 L 9.000 20.000 C 8.448 20.000 8.000 19.552 8.000 19.000 L 8.000 18.000 ZM 5.455 16.000 L 1.000 19.500 L 1.000 4.000 C 1.000 3.448 1.448 3.000 2.000 3.000 L 17.000 3.000 C 17.552 3.000 18.000 3.448 18.000 4.000 L 18.000 16.000 L 5.455 16.000 Z"),
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
