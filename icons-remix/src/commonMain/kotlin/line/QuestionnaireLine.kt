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
                pathData = parseSvgPathData("M 5.763 17.000 L 20.000 17.000 L 20.000 5.000 L 4.000 5.000 L 4.000 18.385 L 5.763 17.000 ZM 6.455 19.000 L 2.000 22.500 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 18.000 C 22.000 18.552 21.552 19.000 21.000 19.000 L 6.455 19.000 ZM 11.000 14.000 L 13.000 14.000 L 13.000 16.000 L 11.000 16.000 L 11.000 14.000 ZM 8.567 8.813 C 8.886 7.209 10.302 6.000 12.000 6.000 C 13.933 6.000 15.500 7.567 15.500 9.500 C 15.500 11.433 13.933 13.000 12.000 13.000 L 11.000 13.000 L 11.000 11.000 L 12.000 11.000 C 12.828 11.000 13.500 10.328 13.500 9.500 C 13.500 8.672 12.828 8.000 12.000 8.000 C 11.272 8.000 10.666 8.518 10.529 9.206 L 8.567 8.813 Z"),
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
