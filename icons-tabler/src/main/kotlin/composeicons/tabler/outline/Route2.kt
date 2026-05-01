package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Route2: ImageVector
    get() {
        if (_route2 != null) return _route2!!
        _route2 = tablerOutlineIcon(
            name = "Route2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
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
                    PathNode.MoveTo(19.0f, 7.0f),
                    PathNode.CurveTo(20.10457f, 7.0f, 21.0f, 6.10457f, 21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 3.895431f, 20.10457f, 3.0f, 19.0f, 3.0f),
                    PathNode.CurveTo(17.89543f, 3.0f, 17.0f, 3.895431f, 17.0f, 5.0f),
                    PathNode.CurveTo(17.0f, 6.10457f, 17.89543f, 7.0f, 19.0f, 7.0f)
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
                    PathNode.MoveTo(14.0f, 5.0f),
                    PathNode.CurveTo(12.895431f, 5.0f, 12.0f, 5.895431f, 12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.CurveTo(12.0f, 18.10457f, 11.104569f, 19.0f, 10.0f, 19.0f)
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
        return _route2!!
    }

private var _route2: ImageVector? = null
