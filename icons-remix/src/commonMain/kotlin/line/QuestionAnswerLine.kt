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
                pathData = parseSvgPathData("M 5.455 15.000 L 1.000 18.500 L 1.000 3.000 C 1.000 2.448 1.448 2.000 2.000 2.000 L 17.000 2.000 C 17.552 2.000 18.000 2.448 18.000 3.000 L 18.000 15.000 L 5.455 15.000 ZM 4.763 13.000 L 16.000 13.000 L 16.000 4.000 L 3.000 4.000 L 3.000 14.385 L 4.763 13.000 ZM 8.000 17.000 L 18.237 17.000 L 20.000 18.385 L 20.000 8.000 L 21.000 8.000 C 21.552 8.000 22.000 8.448 22.000 9.000 L 22.000 22.500 L 17.545 19.000 L 9.000 19.000 C 8.448 19.000 8.000 18.552 8.000 18.000 L 8.000 17.000 Z"),
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
