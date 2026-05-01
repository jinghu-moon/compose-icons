package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderOpenDot: ImageVector
    get() {
        if (_folderOpenDot != null) return _folderOpenDot!!
        _folderOpenDot = lucideOutlineIcon(
            name = "FolderOpenDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 14.0f),
                    PathNode.LineTo(7.45f, 11.1f),
                    PathNode.CurveTo(7.790522f, 10.424228f, 8.483282f, 9.998508f, 9.24f, 10.0f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.CurveTo(20.619192f, 9.998914f, 21.203968f, 10.284685f, 21.583574f, 10.773867f),
                    PathNode.CurveTo(21.963179f, 11.263048f, 22.0948f, 11.90047f, 21.94f, 12.5f),
                    PathNode.LineTo(20.39f, 18.5f),
                    PathNode.CurveTo(20.161674f, 19.384302f, 19.363302f, 20.001602f, 18.45f, 20.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(2.895431f, 20.0f, 2.0f, 19.10457f, 2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.9f, 2.9f, 3.0f, 4.0f, 3.0f),
                    PathNode.LineTo(7.93f, 3.0f),
                    PathNode.CurveTo(8.599038f, 3.003461f, 9.222033f, 3.34123f, 9.59f, 3.9f),
                    PathNode.LineTo(10.41f, 5.1f),
                    PathNode.CurveTo(10.777967f, 5.658771f, 11.400962f, 5.996539f, 12.07f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.CurveTo(19.10457f, 6.0f, 20.0f, 6.895431f, 20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 10.0f)
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
                    PathNode.MoveTo(15.0f, 15.0f),
                    PathNode.CurveTo(15.0f, 15.552285f, 14.552285f, 16.0f, 14.0f, 16.0f),
                    PathNode.CurveTo(13.447715f, 16.0f, 13.0f, 15.552285f, 13.0f, 15.0f),
                    PathNode.CurveTo(13.0f, 14.447715f, 13.447715f, 14.0f, 14.0f, 14.0f),
                    PathNode.CurveTo(14.552285f, 14.0f, 15.0f, 14.447715f, 15.0f, 15.0f),
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
        return _folderOpenDot!!
    }

private var _folderOpenDot: ImageVector? = null
