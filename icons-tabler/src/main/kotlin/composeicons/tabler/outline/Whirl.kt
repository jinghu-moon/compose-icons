package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Whirl: ImageVector
    get() {
        if (_whirl != null) return _whirl!!
        _whirl = tablerOutlineIcon(
            name = "Whirl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 10.895431f, 13.104569f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(10.895431f, 10.0f, 10.0f, 10.895431f, 10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 13.104569f, 10.895431f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(13.104569f, 14.0f, 14.0f, 13.104569f, 14.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 21.0f),
                    PathNode.CurveTo(8.686f, 21.0f, 6.0f, 18.538f, 6.0f, 15.5f),
                    PathNode.CurveTo(6.0f, 12.462f, 8.686f, 10.0f, 12.0f, 10.0f)
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
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 15.314f, 18.538f, 18.0f, 15.5f, 18.0f),
                    PathNode.CurveTo(12.462f, 18.0f, 10.0f, 15.314f, 10.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 14.0f),
                    PathNode.CurveTo(15.314f, 14.0f, 18.0f, 11.538f, 18.0f, 8.5f),
                    PathNode.CurveTo(18.0f, 5.462f, 15.314f, 3.0f, 12.0f, 3.0f)
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
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 8.686f, 11.538f, 6.0f, 8.5f, 6.0f),
                    PathNode.CurveTo(5.462f, 6.0f, 3.0f, 8.686f, 3.0f, 12.0f)
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
        return _whirl!!
    }

private var _whirl: ImageVector? = null
