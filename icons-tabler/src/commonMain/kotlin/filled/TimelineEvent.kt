package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
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
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.CurveTo(13.306f, 17.0f, 14.418f, 17.835f, 14.83f, 19.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.552284f, 19.0f, 21.0f, 19.447716f, 21.0f, 20.0f),
                    PathNode.CurveTo(21.0f, 20.552284f, 20.552284f, 21.0f, 20.0f, 21.0f),
                    PathNode.LineTo(14.829f, 21.0f),
                    PathNode.CurveTo(14.404768f, 22.198498f, 13.271366f, 22.99962f, 12.0f, 22.99962f),
                    PathNode.CurveTo(10.728634f, 22.99962f, 9.595232f, 22.198498f, 9.171f, 21.0f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.CurveTo(3.447715f, 21.0f, 3.0f, 20.552284f, 3.0f, 20.0f),
                    PathNode.CurveTo(3.0f, 19.447716f, 3.447715f, 19.0f, 4.0f, 19.0f),
                    PathNode.LineTo(9.17f, 19.0f),
                    PathNode.CurveTo(9.594226f, 17.801006f, 10.728169f, 16.999634f, 12.0f, 17.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(18.10457f, 2.0f, 19.0f, 2.895431f, 19.0f, 4.0f),
                    PathNode.LineTo(19.0f, 12.0f),
                    PathNode.CurveTo(19.0f, 13.104569f, 18.10457f, 14.0f, 17.0f, 14.0f),
                    PathNode.LineTo(14.414f, 14.0f),
                    PathNode.LineTo(12.707f, 15.707f),
                    PathNode.CurveTo(12.350732f, 16.063234f, 11.785086f, 16.098803f, 11.387f, 15.79f),
                    PathNode.LineTo(11.293f, 15.707f),
                    PathNode.LineTo(9.585f, 14.0f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.CurveTo(5.953376f, 14.000331f, 5.083497f, 13.193677f, 5.005f, 12.15f),
                    PathNode.LineTo(5.0f, 12.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(5.0f, 2.895431f, 5.895431f, 2.0f, 7.0f, 2.0f),
                    PathNode.LineTo(17.0f, 2.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _timelineEvent!!
    }

private var _timelineEvent: ImageVector? = null
