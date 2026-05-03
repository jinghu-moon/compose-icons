package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = lucideOutlineIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.3f, 10.0f),
                    PathNode.CurveTo(8.037151f, 10.014346f, 7.788475f, 9.880013f, 7.656374f, 9.652319f),
                    PathNode.CurveTo(7.524273f, 9.424623f, 7.531083f, 9.142067f, 7.674f, 8.921f),
                    PathNode.LineTo(11.4f, 3.0f),
                    PathNode.CurveTo(11.519086f, 2.785557f, 11.741729f, 2.649092f, 11.98686f, 2.640293f),
                    PathNode.CurveTo(12.231993f, 2.631495f, 12.463846f, 2.751647f, 12.598f, 2.957f),
                    PathNode.LineTo(16.3f, 8.9f),
                    PathNode.CurveTo(16.448723f, 9.113583f, 16.466671f, 9.392043f, 16.346598f, 9.622952f),
                    PathNode.CurveTo(16.226526f, 9.853859f, 15.988259f, 9.999088f, 15.728f, 10.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 14.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.CurveTo(9.552285f, 14.0f, 10.0f, 14.447715f, 10.0f, 15.0f),
                    PathNode.LineTo(10.0f, 20.0f),
                    PathNode.CurveTo(10.0f, 20.552284f, 9.552285f, 21.0f, 9.0f, 21.0f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.CurveTo(3.447715f, 21.0f, 3.0f, 20.552284f, 3.0f, 20.0f),
                    PathNode.LineTo(3.0f, 15.0f),
                    PathNode.CurveTo(3.0f, 14.447715f, 3.447715f, 14.0f, 4.0f, 14.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 17.5f),
                    PathNode.CurveTo(21.0f, 19.432997f, 19.432997f, 21.0f, 17.5f, 21.0f),
                    PathNode.CurveTo(15.567003f, 21.0f, 14.0f, 19.432997f, 14.0f, 17.5f),
                    PathNode.CurveTo(14.0f, 15.567003f, 15.567003f, 14.0f, 17.5f, 14.0f),
                    PathNode.CurveTo(19.432997f, 14.0f, 21.0f, 15.567003f, 21.0f, 17.5f),
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
        return _shapes!!
    }

private var _shapes: ImageVector? = null
