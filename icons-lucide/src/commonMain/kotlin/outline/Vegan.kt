package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Vegan: ImageVector
    get() {
        if (_vegan != null) return _vegan!!
        _vegan = lucideOutlineIcon(
            name = "Vegan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.QuadTo(22.0f, 8.0f, 22.0f, 2.0f),
                    PathNode.QuadTo(16.0f, 2.0f, 16.0f, 8.0f)
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
                    PathNode.MoveTo(17.41f, 3.59f),
                    PathNode.CurveTo(13.112475f, 0.825455f, 7.422046f, 1.745625f, 4.214839f, 5.723722f),
                    PathNode.CurveTo(1.007631f, 9.701818f, 1.315525f, 15.457936f, 4.928795f, 19.071205f),
                    PathNode.CurveTo(8.542064f, 22.684475f, 14.298182f, 22.992369f, 18.27628f, 19.785162f),
                    PathNode.CurveTo(22.254375f, 16.577953f, 23.174545f, 10.887525f, 20.41f, 6.59f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.CurveTo(8.109627f, 6.873859f, 11.766689f, 14.187984f, 12.0f, 22.0f),
                    PathNode.CurveTo(12.9f, 15.18f, 13.5f, 12.5f, 16.0f, 8.0f)
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
        return _vegan!!
    }

private var _vegan: ImageVector? = null
