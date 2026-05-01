package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Dot: ImageVector
    get() {
        if (_dot != null) return _dot!!
        _dot = lucideOutlineIcon(
            name = "Dot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.1f, 12.1f),
                    PathNode.CurveTo(13.1f, 12.652286f, 12.652286f, 13.1f, 12.1f, 13.1f),
                    PathNode.CurveTo(11.547715f, 13.1f, 11.1f, 12.652286f, 11.1f, 12.1f),
                    PathNode.CurveTo(11.1f, 11.547715f, 11.547715f, 11.1f, 12.1f, 11.1f),
                    PathNode.CurveTo(12.652286f, 11.1f, 13.1f, 11.547715f, 13.1f, 12.1f),
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
        return _dot!!
    }

private var _dot: ImageVector? = null
