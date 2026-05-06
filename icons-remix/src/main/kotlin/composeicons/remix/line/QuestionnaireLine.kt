package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.QuestionnaireLine: ImageVector
    get() {
        if (_questionnaireLine != null) return _questionnaireLine!!
        _questionnaireLine = remixIcon(
            name = "QuestionnaireLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.763 17h14.237v-12h-16v13.385L5.763 17ZM6.455 19 2 22.5v-18.5C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-14.545ZM11 14h2v2h-2v-2ZM8.567 8.813C8.886 7.209 10.302 6 12 6c1.933 0 3.5 1.567 3.5 3.5C15.5 11.433 13.933 13 12 13h-1v-2h1c.828 0 1.5-.672 1.5-1.5C13.5 8.672 12.828 8 12 8c-.728 0-1.334 .518-1.471 1.206L8.567 8.813Z"),
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
        return _questionnaireLine!!
    }

private var _questionnaireLine: ImageVector? = null
