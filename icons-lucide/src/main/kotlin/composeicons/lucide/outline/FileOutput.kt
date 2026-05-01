package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileOutput: ImageVector
    get() {
        if (_fileOutput != null) return _fileOutput!!
        _fileOutput = lucideOutlineIcon(
            name = "FileOutput",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.226f, 20.925f),
                    PathNode.CurveTo(4.570778f, 21.585945f, 5.254534f, 22.000284f, 6.0f, 22.0f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.CurveTo(19.10457f, 22.0f, 20.0f, 21.10457f, 20.0f, 20.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.CurveTo(20.00157f, 7.359942f, 19.747406f, 6.745774f, 19.294f, 6.294f),
                    PathNode.LineTo(15.706f, 2.706f),
                    PathNode.CurveTo(15.254227f, 2.252594f, 14.640058f, 1.99843f, 14.0f, 2.0f),
                    PathNode.LineTo(6.0f, 2.0f),
                    PathNode.CurveTo(4.895431f, 2.0f, 4.0f, 2.895431f, 4.0f, 4.0f),
                    PathNode.LineTo(4.0f, 7.127f)
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
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 7.552285f, 14.447715f, 8.0f, 15.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f)
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
                    PathNode.MoveTo(5.0f, 11.0f),
                    PathNode.LineTo(2.0f, 14.0f)
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
                    PathNode.MoveTo(5.0f, 17.0f),
                    PathNode.LineTo(2.0f, 14.0f),
                    PathNode.LineTo(12.0f, 14.0f)
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
        return _fileOutput!!
    }

private var _fileOutput: ImageVector? = null
