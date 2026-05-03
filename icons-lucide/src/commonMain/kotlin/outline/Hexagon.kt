package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hexagon: ImageVector
    get() {
        if (_hexagon != null) return _hexagon!!
        _hexagon = lucideOutlineIcon(
            name = "Hexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 16.0f),
                    PathNode.LineTo(21.0f, 8.0f),
                    PathNode.CurveTo(20.999268f, 7.286202f, 20.618168f, 6.626899f, 20.0f, 6.27f),
                    PathNode.LineTo(13.0f, 2.27f),
                    PathNode.CurveTo(12.381198f, 1.912734f, 11.618802f, 1.912734f, 11.0f, 2.27f),
                    PathNode.LineTo(4.0f, 6.27f),
                    PathNode.CurveTo(3.381832f, 6.626899f, 3.000732f, 7.286202f, 3.0f, 8.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.000732f, 16.713799f, 3.381832f, 17.3731f, 4.0f, 17.73f),
                    PathNode.LineTo(11.0f, 21.73f),
                    PathNode.CurveTo(11.618802f, 22.087267f, 12.381198f, 22.087267f, 13.0f, 21.73f),
                    PathNode.LineTo(20.0f, 17.73f),
                    PathNode.CurveTo(20.618168f, 17.3731f, 20.999268f, 16.713799f, 21.0f, 16.0f),
                    PathNode.Close
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
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
