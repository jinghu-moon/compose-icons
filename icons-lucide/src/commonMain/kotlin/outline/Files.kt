package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = lucideOutlineIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.LineTo(11.0f, 2.0f),
                    PathNode.CurveTo(9.895431f, 2.0f, 9.0f, 2.895431f, 9.0f, 4.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 16.10457f, 9.895431f, 17.0f, 11.0f, 17.0f),
                    PathNode.LineTo(19.0f, 17.0f),
                    PathNode.CurveTo(20.10457f, 17.0f, 21.0f, 16.10457f, 21.0f, 15.0f),
                    PathNode.LineTo(21.0f, 8.0f)
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
                    PathNode.MoveTo(16.706f, 2.706f),
                    PathNode.CurveTo(16.254227f, 2.252594f, 15.640058f, 1.99843f, 15.0f, 2.0f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.CurveTo(15.0f, 7.552285f, 15.447715f, 8.0f, 16.0f, 8.0f),
                    PathNode.LineTo(21.0f, 8.0f),
                    PathNode.CurveTo(21.00157f, 7.359942f, 20.747406f, 6.745774f, 20.294f, 6.294f),
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
                    PathNode.MoveTo(5.0f, 7.0f),
                    PathNode.CurveTo(3.895431f, 7.0f, 3.0f, 7.895431f, 3.0f, 9.0f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.CurveTo(3.0f, 21.10457f, 3.895431f, 22.0f, 5.0f, 22.0f),
                    PathNode.LineTo(13.0f, 22.0f),
                    PathNode.CurveTo(13.714513f, 21.99998f, 14.374743f, 21.618786f, 14.732f, 21.0f)
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
        return _files!!
    }

private var _files: ImageVector? = null
