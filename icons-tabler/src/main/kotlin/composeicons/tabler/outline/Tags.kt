package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tags: ImageVector
    get() {
        if (_tags != null) return _tags!!
        _tags = tablerOutlineIcon(
            name = "Tags",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 8.0f),
                    PathNode.LineTo(3.0f, 12.172f),
                    PathNode.CurveTo(3.000113f, 12.70239f, 3.210901f, 13.211015f, 3.586f, 13.586f),
                    PathNode.LineTo(9.296f, 19.296f),
                    PathNode.CurveTo(10.237134f, 20.236994f, 11.762866f, 20.236994f, 12.704f, 19.296f),
                    PathNode.LineTo(16.296f, 15.704f),
                    PathNode.CurveTo(17.236994f, 14.762866f, 17.236994f, 13.237134f, 16.296f, 12.296f),
                    PathNode.LineTo(10.586f, 6.586f),
                    PathNode.CurveTo(10.211015f, 6.210902f, 9.70239f, 6.000114f, 9.172f, 6.0f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.CurveTo(3.895431f, 6.0f, 3.0f, 6.895431f, 3.0f, 8.0f)
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
                    PathNode.MoveTo(18.0f, 19.0f),
                    PathNode.LineTo(19.592f, 17.408f),
                    PathNode.CurveTo(21.473988f, 15.525731f, 21.473988f, 12.474269f, 19.592f, 10.592f),
                    PathNode.LineTo(15.0f, 6.0f)
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
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.LineTo(6.99f, 10.0f)
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
        return _tags!!
    }

private var _tags: ImageVector? = null
