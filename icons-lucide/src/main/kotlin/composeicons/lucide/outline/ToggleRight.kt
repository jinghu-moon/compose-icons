package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) return _toggleRight!!
        _toggleRight = lucideOutlineIcon(
            name = "ToggleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 13.656855f, 16.656855f, 15.0f, 15.0f, 15.0f),
                    PathNode.CurveTo(13.343145f, 15.0f, 12.0f, 13.656855f, 12.0f, 12.0f),
                    PathNode.CurveTo(12.0f, 10.343145f, 13.343145f, 9.0f, 15.0f, 9.0f),
                    PathNode.CurveTo(16.656855f, 9.0f, 18.0f, 10.343145f, 18.0f, 12.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 5.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.CurveTo(18.865993f, 5.0f, 22.0f, 8.134007f, 22.0f, 12.0f),
                    PathNode.LineTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 15.865993f, 18.865993f, 19.0f, 15.0f, 19.0f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.CurveTo(5.134007f, 19.0f, 2.0f, 15.865993f, 2.0f, 12.0f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 8.134007f, 5.134007f, 5.0f, 9.0f, 5.0f),
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
        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
