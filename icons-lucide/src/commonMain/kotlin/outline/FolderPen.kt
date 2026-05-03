package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderPen: ImageVector
    get() {
        if (_folderPen != null) return _folderPen!!
        _folderPen = lucideOutlineIcon(
            name = "FolderPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 11.5f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.895431f, 2.895431f, 3.0f, 4.0f, 3.0f),
                    PathNode.LineTo(7.9f, 3.0f),
                    PathNode.CurveTo(8.6f, 3.0f, 9.2f, 3.3f, 9.6f, 3.9f),
                    PathNode.LineTo(10.4f, 5.1f),
                    PathNode.CurveTo(10.8f, 5.7f, 11.4f, 6.0f, 12.1f, 6.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.CurveTo(21.10457f, 6.0f, 22.0f, 6.895431f, 22.0f, 8.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 19.10457f, 21.10457f, 20.0f, 20.0f, 20.0f),
                    PathNode.LineTo(10.5f, 20.0f)
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
                    PathNode.MoveTo(11.378f, 13.626f),
                    PathNode.CurveTo(12.207532f, 12.796469f, 12.207532f, 11.451531f, 11.378f, 10.622f),
                    PathNode.CurveTo(10.548469f, 9.792468f, 9.203531f, 9.792468f, 8.374f, 10.622f),
                    PathNode.LineTo(3.364f, 15.634f),
                    PathNode.CurveTo(3.126248f, 15.871622f, 2.952221f, 16.165335f, 2.858f, 16.488f),
                    PathNode.LineTo(2.021f, 19.358f),
                    PathNode.CurveTo(1.969881f, 19.533264f, 2.018352f, 19.722458f, 2.147447f, 19.851551f),
                    PathNode.CurveTo(2.276542f, 19.980648f, 2.465735f, 20.02912f, 2.641f, 19.978f),
                    PathNode.LineTo(5.511f, 19.141f),
                    PathNode.CurveTo(5.833666f, 19.04678f, 6.127379f, 18.872753f, 6.365f, 18.635f),
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
        return _folderPen!!
    }

private var _folderPen: ImageVector? = null
