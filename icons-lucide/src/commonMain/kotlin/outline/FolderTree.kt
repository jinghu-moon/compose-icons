package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderTree: ImageVector
    get() {
        if (_folderTree != null) return _folderTree!!
        _folderTree = lucideOutlineIcon(
            name = "FolderTree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 10.0f),
                    PathNode.CurveTo(20.552284f, 10.0f, 21.0f, 9.552285f, 21.0f, 9.0f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.CurveTo(21.0f, 5.447716f, 20.552284f, 5.0f, 20.0f, 5.0f),
                    PathNode.LineTo(17.5f, 5.0f),
                    PathNode.CurveTo(17.185244f, 5.0f, 16.888853f, 4.851806f, 16.7f, 4.6f),
                    PathNode.LineTo(15.8f, 3.4f),
                    PathNode.CurveTo(15.611146f, 3.148194f, 15.314757f, 3.0f, 15.0f, 3.0f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.CurveTo(12.447715f, 3.0f, 12.0f, 3.447715f, 12.0f, 4.0f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.CurveTo(12.0f, 9.552285f, 12.447715f, 10.0f, 13.0f, 10.0f),
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
                    PathNode.MoveTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.552284f, 21.0f, 21.0f, 20.552284f, 21.0f, 20.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.0f, 16.447716f, 20.552284f, 16.0f, 20.0f, 16.0f),
                    PathNode.LineTo(17.1f, 16.0f),
                    PathNode.CurveTo(16.72705f, 15.995125f, 16.38781f, 15.783099f, 16.22f, 15.45f),
                    PathNode.LineTo(15.8f, 14.6f),
                    PathNode.CurveTo(15.640447f, 14.234411f, 15.278887f, 13.998611f, 14.88f, 14.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.CurveTo(12.447715f, 14.0f, 12.0f, 14.447715f, 12.0f, 15.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.CurveTo(12.0f, 20.552284f, 12.447715f, 21.0f, 13.0f, 21.0f),
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
                    PathNode.MoveTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 6.10457f, 3.895431f, 7.0f, 5.0f, 7.0f),
                    PathNode.LineTo(8.0f, 7.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 17.10457f, 3.895431f, 18.0f, 5.0f, 18.0f),
                    PathNode.LineTo(8.0f, 18.0f)
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
        return _folderTree!!
    }

private var _folderTree: ImageVector? = null
