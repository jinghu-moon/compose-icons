package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Joker: ImageVector
    get() {
        if (_joker != null) return _joker!!
        _joker = tablerOutlineIcon(
            name = "Joker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 17.5f),
                    PathNode.CurveTo(5.0f, 16.671574f, 5.671573f, 16.0f, 6.5f, 16.0f),
                    PathNode.LineTo(17.5f, 16.0f),
                    PathNode.CurveTo(18.328426f, 16.0f, 19.0f, 16.671574f, 19.0f, 17.5f),
                    PathNode.CurveTo(19.0f, 18.328426f, 18.328426f, 19.0f, 17.5f, 19.0f),
                    PathNode.LineTo(6.5f, 19.0f),
                    PathNode.CurveTo(5.671573f, 19.0f, 5.0f, 18.328426f, 5.0f, 17.5f)
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
                    PathNode.QuadTo(9.5f, 8.0f, 6.0f, 8.0f),
                    PathNode.QuadTo(3.5f, 8.0f, 3.0f, 10.0f),
                    PathNode.CurveTo(5.953f, 10.31f, 6.308f, 13.33f, 7.0f, 16.0f)
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
                    PathNode.QuadTo(14.5f, 8.0f, 18.0f, 8.0f),
                    PathNode.QuadTo(20.5f, 8.0f, 21.0f, 10.0f),
                    PathNode.CurveTo(18.047f, 10.31f, 17.692f, 13.33f, 17.0f, 16.0f)
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
                    PathNode.MoveTo(9.0f, 9.5f),
                    PathNode.QuadTo(11.0f, 6.0f, 12.0f, 6.0f),
                    PathNode.QuadTo(13.0f, 6.0f, 15.0f, 9.5f)
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
        return _joker!!
    }

private var _joker: ImageVector? = null
