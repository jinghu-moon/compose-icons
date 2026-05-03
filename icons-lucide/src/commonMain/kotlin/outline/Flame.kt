package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = lucideOutlineIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.QuadTo(13.0f, 7.0f, 16.0f, 9.5f),
                    PathNode.QuadTo(19.0f, 12.0f, 19.0f, 15.0f),
                    PathNode.CurveTo(19.0f, 18.865993f, 15.865993f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(8.134007f, 22.0f, 5.0f, 18.865993f, 5.0f, 15.0f),
                    PathNode.CurveTo(5.0f, 13.918149f, 5.350889f, 12.86548f, 6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 13.380712f, 7.119288f, 14.5f, 8.5f, 14.5f),
                    PathNode.CurveTo(9.880712f, 14.5f, 11.0f, 13.380712f, 11.0f, 12.0f),
                    PathNode.CurveTo(11.0f, 10.0f, 9.5f, 9.0f, 9.5f, 7.0f),
                    PathNode.QuadTo(9.5f, 5.0f, 12.0f, 3.0f)
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
        return _flame!!
    }

private var _flame: ImageVector? = null
