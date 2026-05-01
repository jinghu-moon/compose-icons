package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Credits: ImageVector
    get() {
        if (_credits != null) return _credits!!
        _credits = tablerOutlineIcon(
            name = "Credits",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 14.0f),
                    PathNode.CurveTo(3.0f, 15.104569f, 5.686292f, 16.0f, 9.0f, 16.0f),
                    PathNode.CurveTo(12.313708f, 16.0f, 15.0f, 15.104569f, 15.0f, 14.0f),
                    PathNode.CurveTo(15.0f, 12.895431f, 12.313708f, 12.0f, 9.0f, 12.0f),
                    PathNode.CurveTo(5.686292f, 12.0f, 3.0f, 12.895431f, 3.0f, 14.0f)
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
                    PathNode.MoveTo(3.0f, 14.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.105f, 5.686f, 21.0f, 9.0f, 21.0f),
                    PathNode.CurveTo(12.314f, 21.0f, 15.0f, 20.105f, 15.0f, 19.0f),
                    PathNode.LineTo(15.0f, 14.0f)
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
                    PathNode.MoveTo(9.0f, 5.0f),
                    PathNode.CurveTo(9.0f, 6.10457f, 11.686292f, 7.0f, 15.0f, 7.0f),
                    PathNode.CurveTo(18.31371f, 7.0f, 21.0f, 6.10457f, 21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 3.895431f, 18.31371f, 3.0f, 15.0f, 3.0f),
                    PathNode.CurveTo(11.686292f, 3.0f, 9.0f, 3.895431f, 9.0f, 5.0f)
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
                    PathNode.MoveTo(9.0f, 5.0f),
                    PathNode.LineTo(9.0f, 8.0f)
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
                    PathNode.MoveTo(18.365f, 11.656f),
                    PathNode.CurveTo(19.955f, 11.296f, 21.0f, 10.69f, 21.0f, 10.0f),
                    PathNode.LineTo(21.0f, 5.0f)
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
        return _credits!!
    }

private var _credits: ImageVector? = null
