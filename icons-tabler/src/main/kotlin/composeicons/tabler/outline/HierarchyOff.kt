package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HierarchyOff: ImageVector
    get() {
        if (_hierarchyOff != null) return _hierarchyOff!!
        _hierarchyOff = tablerOutlineIcon(
            name = "HierarchyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 5.0f),
                    PathNode.CurveTo(10.0f, 6.10457f, 10.895431f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(13.104569f, 7.0f, 14.0f, 6.10457f, 14.0f, 5.0f),
                    PathNode.CurveTo(14.0f, 3.895431f, 13.104569f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.895431f, 3.0f, 10.0f, 3.895431f, 10.0f, 5.0f)
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
                    PathNode.MoveTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.10457f, 3.895431f, 21.0f, 5.0f, 21.0f),
                    PathNode.CurveTo(6.10457f, 21.0f, 7.0f, 20.10457f, 7.0f, 19.0f),
                    PathNode.CurveTo(7.0f, 17.89543f, 6.10457f, 17.0f, 5.0f, 17.0f),
                    PathNode.CurveTo(3.895431f, 17.0f, 3.0f, 17.89543f, 3.0f, 19.0f)
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
                    PathNode.MoveTo(17.585f, 17.587f),
                    PathNode.CurveTo(16.821806f, 18.367556f, 16.825514f, 19.615906f, 17.593332f, 20.391912f),
                    PathNode.CurveTo(18.361153f, 21.167921f, 19.609392f, 21.184872f, 20.398f, 20.43f)
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
                    PathNode.MoveTo(6.5f, 17.5f),
                    PathNode.LineTo(12.0f, 13.0f),
                    PathNode.LineTo(17.5f, 17.5f)
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 13.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _hierarchyOff!!
    }

private var _hierarchyOff: ImageVector? = null
