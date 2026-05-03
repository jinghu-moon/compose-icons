package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number100Small: ImageVector
    get() {
        if (_number100Small != null) return _number100Small!!
        _number100Small = tablerOutlineIcon(
            name = "Number100Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 8.0f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.LineTo(5.0f, 16.0f)
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
                    PathNode.MoveTo(9.0f, 10.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.CurveTo(9.0f, 15.104569f, 9.895431f, 16.0f, 11.0f, 16.0f),
                    PathNode.CurveTo(12.104569f, 16.0f, 13.0f, 15.104569f, 13.0f, 14.0f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.CurveTo(13.0f, 8.895431f, 12.104569f, 8.0f, 11.0f, 8.0f),
                    PathNode.CurveTo(9.895431f, 8.0f, 9.0f, 8.895431f, 9.0f, 10.0f)
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
                    PathNode.MoveTo(16.0f, 10.0f),
                    PathNode.LineTo(16.0f, 14.0f),
                    PathNode.CurveTo(16.0f, 15.104569f, 16.89543f, 16.0f, 18.0f, 16.0f),
                    PathNode.CurveTo(19.10457f, 16.0f, 20.0f, 15.104569f, 20.0f, 14.0f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.CurveTo(20.0f, 8.895431f, 19.10457f, 8.0f, 18.0f, 8.0f),
                    PathNode.CurveTo(16.89543f, 8.0f, 16.0f, 8.895431f, 16.0f, 10.0f)
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
        return _number100Small!!
    }

private var _number100Small: ImageVector? = null
