package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = lucideOutlineIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 14.0f),
                    PathNode.LineTo(7.5f, 11.1f),
                    PathNode.CurveTo(7.832288f, 10.440079f, 8.50134f, 10.017115f, 9.24f, 10.0f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.CurveTo(20.619192f, 9.998914f, 21.203968f, 10.284685f, 21.583574f, 10.773867f),
                    PathNode.CurveTo(21.963179f, 11.263048f, 22.0948f, 11.90047f, 21.94f, 12.5f),
                    PathNode.LineTo(20.4f, 18.5f),
                    PathNode.CurveTo(20.170761f, 19.387928f, 19.367022f, 20.00619f, 18.45f, 20.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(2.895431f, 20.0f, 2.0f, 19.10457f, 2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.895431f, 2.895431f, 3.0f, 4.0f, 3.0f),
                    PathNode.LineTo(7.9f, 3.0f),
                    PathNode.CurveTo(8.579667f, 2.993337f, 9.216198f, 3.332317f, 9.59f, 3.9f),
                    PathNode.LineTo(10.4f, 5.1f),
                    PathNode.CurveTo(10.769922f, 5.661721f, 11.397413f, 5.99989f, 12.07f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.CurveTo(19.10457f, 6.0f, 20.0f, 6.895431f, 20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 10.0f)
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
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
