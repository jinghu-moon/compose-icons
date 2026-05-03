package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Subtask: ImageVector
    get() {
        if (_subtask != null) return _subtask!!
        _subtask = tablerOutlineIcon(
            name = "Subtask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 9.0f),
                    PathNode.LineTo(12.0f, 9.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 5.0f),
                    PathNode.LineTo(8.0f, 5.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 5.0f),
                    PathNode.LineTo(6.0f, 16.0f),
                    PathNode.CurveTo(6.0f, 16.552284f, 6.447716f, 17.0f, 7.0f, 17.0f),
                    PathNode.LineTo(12.0f, 17.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(12.0f, 7.447716f, 12.447715f, 7.0f, 13.0f, 7.0f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.CurveTo(19.552284f, 7.0f, 20.0f, 7.447716f, 20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.CurveTo(20.0f, 10.552285f, 19.552284f, 11.0f, 19.0f, 11.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.CurveTo(12.447715f, 11.0f, 12.0f, 10.552285f, 12.0f, 10.0f),
                    PathNode.LineTo(12.0f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.CurveTo(12.0f, 15.447715f, 12.447715f, 15.0f, 13.0f, 15.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.CurveTo(19.552284f, 15.0f, 20.0f, 15.447715f, 20.0f, 16.0f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.CurveTo(20.0f, 18.552284f, 19.552284f, 19.0f, 19.0f, 19.0f),
                    PathNode.LineTo(13.0f, 19.0f),
                    PathNode.CurveTo(12.447715f, 19.0f, 12.0f, 18.552284f, 12.0f, 18.0f),
                    PathNode.LineTo(12.0f, 16.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _subtask!!
    }

private var _subtask: ImageVector? = null
