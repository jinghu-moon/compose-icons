package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = tablerOutlineIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 19.0f),
                    PathNode.LineTo(7.757f, 11.649f),
                    PathNode.CurveTo(7.903281f, 11.25876f, 8.276244f, 11.000156f, 8.693f, 11.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.CurveTo(21.2938f, 11.000135f, 21.572678f, 11.129465f, 21.762577f, 11.353646f),
                    PathNode.CurveTo(21.952477f, 11.577827f, 22.034184f, 11.874177f, 21.986f, 12.164f),
                    PathNode.LineTo(20.99f, 17.375f),
                    PathNode.CurveTo(20.810043f, 18.317747f, 19.98577f, 18.999746f, 19.026f, 19.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(3.895431f, 19.0f, 3.0f, 18.10457f, 3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 4.895431f, 3.895431f, 4.0f, 5.0f, 4.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.LineTo(12.0f, 7.0f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.CurveTo(20.10457f, 7.0f, 21.0f, 7.895431f, 21.0f, 9.0f),
                    PathNode.LineTo(21.0f, 11.0f)
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
