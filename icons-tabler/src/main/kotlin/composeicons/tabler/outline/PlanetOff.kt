package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlanetOff: ImageVector
    get() {
        if (_planetOff != null) return _planetOff!!
        _planetOff = tablerOutlineIcon(
            name = "PlanetOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.042f, 7.059f),
                    PathNode.CurveTo(4.357219f, 9.802778f, 4.383093f, 14.196939f, 7.1f, 16.90891f),
                    PathNode.CurveTo(9.816907f, 19.620882f, 14.211108f, 19.638767f, 16.95f, 16.949f),
                    PathNode.MoveTo(18.531f, 14.524f),
                    PathNode.CurveTo(19.531672f, 11.938745f, 18.912428f, 9.006524f, 16.95189f, 7.046634f),
                    PathNode.CurveTo(14.991349f, 5.086744f, 12.058924f, 4.468473f, 9.474f, 5.47f)
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
        return _planetOff!!
    }

private var _planetOff: ImageVector? = null
