package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.QuestionnaireFill: ImageVector
    get() {
        if (_questionnaireFill != null) return _questionnaireFill!!
        _questionnaireFill = remixIcon(
            name = "QuestionnaireFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.455 19 2 22.5v-18.5C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-14.545ZM11 14v2h2v-2h-2ZM8.567 8.813l1.961 .392C10.666 8.518 11.272 8 12 8c.828 0 1.5 .672 1.5 1.5C13.5 10.328 12.828 11 12 11h-1v2h1c1.933 0 3.5-1.567 3.5-3.5C15.5 7.567 13.933 6 12 6 10.302 6 8.886 7.209 8.567 8.813Z"),
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
        return _questionnaireFill!!
    }

private var _questionnaireFill: ImageVector? = null
