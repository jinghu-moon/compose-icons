package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TimelineEventMinus: ImageVector
    get() {
        if (_timelineEventMinus != null) return _timelineEventMinus!!
        _timelineEventMinus = tablerOutlineIcon(
            name = "TimelineEventMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 20.0f),
                    PathNode.CurveTo(10.0f, 21.10457f, 10.895431f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(13.104569f, 22.0f, 14.0f, 21.10457f, 14.0f, 20.0f),
                    PathNode.CurveTo(14.0f, 18.89543f, 13.104569f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(10.895431f, 18.0f, 10.0f, 18.89543f, 10.0f, 20.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 20.0f),
                    PathNode.LineTo(4.0f, 20.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 20.0f),
                    PathNode.LineTo(20.0f, 20.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.CurveTo(6.447716f, 13.0f, 6.0f, 12.552285f, 6.0f, 12.0f),
                    PathNode.LineTo(6.0f, 4.0f),
                    PathNode.CurveTo(6.0f, 3.447715f, 6.447716f, 3.0f, 7.0f, 3.0f),
                    PathNode.LineTo(17.0f, 3.0f),
                    PathNode.CurveTo(17.552284f, 3.0f, 18.0f, 3.447715f, 18.0f, 4.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 12.552285f, 17.552284f, 13.0f, 17.0f, 13.0f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.LineTo(12.0f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _timelineEventMinus!!
    }

private var _timelineEventMinus: ImageVector? = null
