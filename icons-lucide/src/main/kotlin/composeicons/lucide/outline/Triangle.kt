package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = lucideOutlineIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.73f, 4.0f),
                    PathNode.CurveTo(13.372202f, 3.383196f, 12.713069f, 3.003544f, 12.0f, 3.003544f),
                    PathNode.CurveTo(11.286931f, 3.003544f, 10.627798f, 3.383196f, 10.27f, 4.0f),
                    PathNode.LineTo(2.27f, 18.0f),
                    PathNode.CurveTo(1.912917f, 18.618484f, 1.912721f, 19.380444f, 2.269487f, 19.999113f),
                    PathNode.CurveTo(2.626252f, 20.61778f, 3.285835f, 20.999268f, 4.0f, 21.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.714165f, 20.999268f, 21.373749f, 20.61778f, 21.730513f, 19.999113f),
                    PathNode.CurveTo(22.087278f, 19.380444f, 22.087084f, 18.618484f, 21.73f, 18.0f),
                    PathNode.Close
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
        return _triangle!!
    }

private var _triangle: ImageVector? = null
