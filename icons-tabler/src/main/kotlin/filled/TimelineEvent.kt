package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TimelineEvent: ImageVector
    get() {
        if (_timelineEvent != null) return _timelineEvent!!
        _timelineEvent = tablerFilledIcon(
            name = "TimelineEvent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 17.000 C 13.306 17.000 14.418 17.835 14.830 19.000 L 20.000 19.000 C 20.552 19.000 21.000 19.448 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 14.829 21.000 C 14.405 22.198 13.271 23.000 12.000 23.000 C 10.729 23.000 9.595 22.198 9.171 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 C 3.000 19.448 3.448 19.000 4.000 19.000 L 9.170 19.000 C 9.594 17.801 10.728 17.000 12.000 17.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 C 18.105 2.000 19.000 2.895 19.000 4.000 L 19.000 12.000 C 19.000 13.105 18.105 14.000 17.000 14.000 L 14.414 14.000 L 12.707 15.707 C 12.351 16.063 11.785 16.099 11.387 15.790 L 11.293 15.707 L 9.585 14.000 L 7.000 14.000 C 5.953 14.000 5.083 13.194 5.005 12.150 L 5.000 12.000 L 5.000 4.000 C 5.000 2.895 5.895 2.000 7.000 2.000 L 17.000 2.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _timelineEvent!!
    }

private var _timelineEvent: ImageVector? = null
