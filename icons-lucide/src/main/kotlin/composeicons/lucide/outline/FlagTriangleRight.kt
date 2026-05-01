package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlagTriangleRight: ImageVector
    get() {
        if (_flagTriangleRight != null) return _flagTriangleRight!!
        _flagTriangleRight = lucideOutlineIcon(
            name = "FlagTriangleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 22.0f),
                    PathNode.LineTo(6.0f, 2.8f),
                    PathNode.CurveTo(5.999754f, 2.520168f, 6.14574f, 2.260546f, 6.38497f, 2.115373f),
                    PathNode.CurveTo(6.6242f, 1.970199f, 6.921896f, 1.960577f, 7.17f, 2.09f),
                    PathNode.LineTo(18.55f, 7.78f),
                    PathNode.CurveTo(18.825993f, 7.913669f, 19.001287f, 8.193342f, 19.001287f, 8.5f),
                    PathNode.CurveTo(19.001287f, 8.806658f, 18.825993f, 9.08633f, 18.55f, 9.22f),
                    PathNode.LineTo(6.0f, 15.5f)
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
        return _flagTriangleRight!!
    }

private var _flagTriangleRight: ImageVector? = null
