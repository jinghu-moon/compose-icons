package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Plane: ImageVector
    get() {
        if (_plane != null) return _plane!!
        _plane = lucideOutlineIcon(
            name = "Plane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.8f, 19.2f),
                    PathNode.LineTo(16.0f, 11.0f),
                    PathNode.LineTo(19.5f, 7.5f),
                    PathNode.CurveTo(21.0f, 6.0f, 21.5f, 4.0f, 21.0f, 3.0f),
                    PathNode.CurveTo(20.0f, 2.5f, 18.0f, 3.0f, 16.5f, 4.5f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(4.8f, 6.2f),
                    PathNode.CurveTo(4.3f, 6.1f, 3.9f, 6.3f, 3.7f, 6.7f),
                    PathNode.LineTo(3.4f, 7.2f),
                    PathNode.CurveTo(3.2f, 7.7f, 3.3f, 8.2f, 3.7f, 8.5f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.LineTo(12.0f, 15.0f),
                    PathNode.LineTo(15.5f, 20.3f),
                    PathNode.CurveTo(15.8f, 20.7f, 16.3f, 20.8f, 16.8f, 20.6f),
                    PathNode.LineTo(17.3f, 20.4f),
                    PathNode.CurveTo(17.7f, 20.1f, 17.9f, 19.7f, 17.8f, 19.2f),
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
        return _plane!!
    }

private var _plane: ImageVector? = null
