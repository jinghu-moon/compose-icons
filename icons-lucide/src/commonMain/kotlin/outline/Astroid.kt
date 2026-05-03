package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Astroid: ImageVector
    get() {
        if (_astroid != null) return _astroid!!
        _astroid = lucideOutlineIcon(
            name = "Astroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.983f, 21.186f),
                    PathNode.CurveTo(12.894598f, 21.659292f, 12.481477f, 22.002394f, 12.0f, 22.002394f),
                    PathNode.CurveTo(11.518523f, 22.002394f, 11.105402f, 21.659292f, 11.017f, 21.186f),
                    PathNode.CurveTo(10.310136f, 16.982977f, 7.017023f, 13.689864f, 2.814f, 12.983f),
                    PathNode.CurveTo(2.340708f, 12.894598f, 1.997606f, 12.481477f, 1.997606f, 12.0f),
                    PathNode.CurveTo(1.997606f, 11.518523f, 2.340708f, 11.105402f, 2.814f, 11.017f),
                    PathNode.CurveTo(7.017023f, 10.310136f, 10.310136f, 7.017023f, 11.017f, 2.814f),
                    PathNode.CurveTo(11.105402f, 2.340708f, 11.518523f, 1.997606f, 12.0f, 1.997606f),
                    PathNode.CurveTo(12.481477f, 1.997606f, 12.894598f, 2.340708f, 12.983f, 2.814f),
                    PathNode.CurveTo(13.689864f, 7.017023f, 16.982977f, 10.310136f, 21.186f, 11.017f),
                    PathNode.CurveTo(21.659292f, 11.105402f, 22.002394f, 11.518523f, 22.002394f, 12.0f),
                    PathNode.CurveTo(22.002394f, 12.481477f, 21.659292f, 12.894598f, 21.186f, 12.983f),
                    PathNode.CurveTo(16.982977f, 13.689864f, 13.689864f, 16.982977f, 12.983f, 21.186f)
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
        return _astroid!!
    }

private var _astroid: ImageVector? = null
