package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderGit: ImageVector
    get() {
        if (_folderGit != null) return _folderGit!!
        _folderGit = lucideOutlineIcon(
            name = "FolderGit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 13.0f),
                    PathNode.CurveTo(14.0f, 14.104569f, 13.104569f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(10.895431f, 15.0f, 10.0f, 14.104569f, 10.0f, 13.0f),
                    PathNode.CurveTo(10.0f, 11.895431f, 10.895431f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(13.104569f, 11.0f, 14.0f, 11.895431f, 14.0f, 13.0f),
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
                    PathNode.MoveTo(20.0f, 20.0f),
                    PathNode.CurveTo(21.10457f, 20.0f, 22.0f, 19.10457f, 22.0f, 18.0f),
                    PathNode.LineTo(22.0f, 8.0f),
                    PathNode.CurveTo(22.0f, 6.895431f, 21.10457f, 6.0f, 20.0f, 6.0f),
                    PathNode.LineTo(12.1f, 6.0f),
                    PathNode.CurveTo(11.420333f, 6.006664f, 10.783802f, 5.667683f, 10.41f, 5.1f),
                    PathNode.LineTo(9.6f, 3.9f),
                    PathNode.CurveTo(9.230078f, 3.33828f, 8.602587f, 3.000111f, 7.93f, 3.0f),
                    PathNode.LineTo(4.0f, 3.0f),
                    PathNode.CurveTo(2.895431f, 3.0f, 2.0f, 3.895431f, 2.0f, 5.0f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.CurveTo(2.0f, 19.10457f, 2.895431f, 20.0f, 4.0f, 20.0f),
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
                    PathNode.MoveTo(14.0f, 13.0f),
                    PathNode.LineTo(17.0f, 13.0f)
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
                    PathNode.MoveTo(7.0f, 13.0f),
                    PathNode.LineTo(10.0f, 13.0f)
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
        return _folderGit!!
    }

private var _folderGit: ImageVector? = null
