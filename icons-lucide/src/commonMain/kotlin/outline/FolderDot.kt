package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderDot: ImageVector
    get() {
        if (_folderDot != null) return _folderDot!!
        _folderDot = lucideOutlineIcon(
            name = "FolderDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 20.0f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.CurveTo(21.10457f, 20.0f, 22.0f, 19.10457f, 22.0f, 18.0f),
                    PathNode.LineTo(22.0f, 8.0f),
                    PathNode.CurveTo(22.0f, 6.895431f, 21.10457f, 6.0f, 20.0f, 6.0f),
                    PathNode.LineTo(12.07f, 6.0f),
                    PathNode.CurveTo(11.400962f, 5.996539f, 10.777967f, 5.658771f, 10.41f, 5.1f),
                    PathNode.LineTo(9.59f, 3.9f),
                    PathNode.CurveTo(9.222033f, 3.34123f, 8.599038f, 3.003461f, 7.93f, 3.0f),
                    PathNode.LineTo(4.0f, 3.0f),
                    PathNode.CurveTo(2.895431f, 3.0f, 2.0f, 3.895431f, 2.0f, 5.0f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.CurveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f),
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
                    PathNode.MoveTo(13.0f, 13.0f),
                    PathNode.CurveTo(13.0f, 13.552285f, 12.552285f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(11.447715f, 14.0f, 11.0f, 13.552285f, 11.0f, 13.0f),
                    PathNode.CurveTo(11.0f, 12.447715f, 11.447715f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(12.552285f, 12.0f, 13.0f, 12.447715f, 13.0f, 13.0f),
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
        return _folderDot!!
    }

private var _folderDot: ImageVector? = null
