package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderLock: ImageVector
    get() {
        if (_folderLock != null) return _folderLock!!
        _folderLock = lucideOutlineIcon(
            name = "FolderLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 17.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.552284f, 17.0f, 22.0f, 17.447716f, 22.0f, 18.0f),
                    PathNode.LineTo(22.0f, 21.0f),
                    PathNode.CurveTo(22.0f, 21.552284f, 21.552284f, 22.0f, 21.0f, 22.0f),
                    PathNode.LineTo(15.0f, 22.0f),
                    PathNode.CurveTo(14.447715f, 22.0f, 14.0f, 21.552284f, 14.0f, 21.0f),
                    PathNode.LineTo(14.0f, 18.0f),
                    PathNode.CurveTo(14.0f, 17.447716f, 14.447715f, 17.0f, 15.0f, 17.0f),
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
                    PathNode.MoveTo(10.0f, 20.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(2.895431f, 20.0f, 2.0f, 19.10457f, 2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.895431f, 2.895431f, 3.0f, 4.0f, 3.0f),
                    PathNode.LineTo(7.9f, 3.0f),
                    PathNode.CurveTo(8.579667f, 2.993337f, 9.216198f, 3.332317f, 9.59f, 3.9f),
                    PathNode.LineTo(10.4f, 5.1f),
                    PathNode.CurveTo(10.769922f, 5.661721f, 11.397413f, 5.99989f, 12.07f, 6.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.CurveTo(21.10457f, 6.0f, 22.0f, 6.895431f, 22.0f, 8.0f),
                    PathNode.LineTo(22.0f, 10.5f)
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
                    PathNode.MoveTo(20.0f, 17.0f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.CurveTo(20.0f, 13.895431f, 19.10457f, 13.0f, 18.0f, 13.0f),
                    PathNode.CurveTo(16.89543f, 13.0f, 16.0f, 13.895431f, 16.0f, 15.0f),
                    PathNode.LineTo(16.0f, 17.0f)
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
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
