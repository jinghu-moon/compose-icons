package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlagTriangleLeft: ImageVector
    get() {
        if (_flagTriangleLeft != null) return _flagTriangleLeft!!
        _flagTriangleLeft = lucideOutlineIcon(
            name = "FlagTriangleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 22.0f),
                    PathNode.LineTo(18.0f, 2.8f),
                    PathNode.CurveTo(18.000246f, 2.520168f, 17.85426f, 2.260546f, 17.61503f, 2.115373f),
                    PathNode.CurveTo(17.375801f, 1.970199f, 17.078104f, 1.960577f, 16.83f, 2.09f),
                    PathNode.LineTo(5.45f, 7.78f),
                    PathNode.CurveTo(5.174008f, 7.913669f, 4.998712f, 8.193342f, 4.998712f, 8.5f),
                    PathNode.CurveTo(4.998712f, 8.806658f, 5.174008f, 9.08633f, 5.45f, 9.22f),
                    PathNode.LineTo(18.0f, 15.5f)
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
        return _flagTriangleLeft!!
    }

private var _flagTriangleLeft: ImageVector? = null
