package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Mouse: ImageVector
    get() {
        if (_mouse != null) return _mouse!!
        _mouse = lucideOutlineIcon(
            name = "Mouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.CurveTo(15.865993f, 2.0f, 19.0f, 5.134007f, 19.0f, 9.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.CurveTo(19.0f, 18.865993f, 15.865993f, 22.0f, 12.0f, 22.0f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.CurveTo(8.134007f, 22.0f, 5.0f, 18.865993f, 5.0f, 15.0f),
                    PathNode.LineTo(5.0f, 9.0f),
                    PathNode.CurveTo(5.0f, 5.134007f, 8.134007f, 2.0f, 12.0f, 2.0f),
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
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.LineTo(12.0f, 10.0f)
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
        return _mouse!!
    }

private var _mouse: ImageVector? = null
