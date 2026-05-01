package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Volume: ImageVector
    get() {
        if (_volume != null) return _volume!!
        _volume = lucideOutlineIcon(
            name = "Volume",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 4.702f),
                    PathNode.CurveTo(10.999588f, 4.417171f, 10.827826f, 4.160571f, 10.564654f, 4.051627f),
                    PathNode.CurveTo(10.301483f, 3.942684f, 9.99861f, 4.002801f, 9.797f, 4.204f),
                    PathNode.LineTo(6.413f, 7.587f),
                    PathNode.CurveTo(6.14921f, 7.852368f, 5.790171f, 8.001097f, 5.416f, 8.0f),
                    PathNode.LineTo(3.0f, 8.0f),
                    PathNode.CurveTo(2.447715f, 8.0f, 2.0f, 8.447715f, 2.0f, 9.0f),
                    PathNode.LineTo(2.0f, 15.0f),
                    PathNode.CurveTo(2.0f, 15.552285f, 2.447715f, 16.0f, 3.0f, 16.0f),
                    PathNode.LineTo(5.416f, 16.0f),
                    PathNode.CurveTo(5.790171f, 15.998903f, 6.14921f, 16.147633f, 6.413f, 16.413f),
                    PathNode.LineTo(9.796f, 19.797f),
                    PathNode.CurveTo(9.997645f, 19.999043f, 10.301225f, 20.059551f, 10.564925f, 19.95026f),
                    PathNode.CurveTo(10.828625f, 19.84097f, 11.000397f, 19.58345f, 11.0f, 19.298f),
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
        return _volume!!
    }

private var _volume: ImageVector? = null
