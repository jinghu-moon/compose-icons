package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = tablerFilledIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 6.0f),
                    PathNode.CurveTo(2.0f, 5.204f, 2.316f, 4.442f, 2.879f, 3.879f),
                    PathNode.CurveTo(3.442f, 3.316f, 4.204f, 3.0f, 5.0f, 3.0f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.LineTo(9.099f, 3.005f),
                    PathNode.CurveTo(9.328f, 3.028f, 9.543f, 3.129f, 9.707f, 3.293f),
                    PathNode.LineTo(12.414f, 6.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(19.796f, 6.0f, 20.558f, 6.316f, 21.121f, 6.879f),
                    PathNode.CurveTo(21.44f, 7.198f, 21.68f, 7.582f, 21.828f, 8.0f),
                    PathNode.LineTo(7.305f, 8.0f),
                    PathNode.CurveTo(6.898f, 8.0f, 6.5f, 8.125f, 6.165f, 8.356f),
                    PathNode.CurveTo(5.873f, 8.559f, 5.64f, 8.836f, 5.491f, 9.157f),
                    PathNode.LineTo(5.433f, 9.298f),
                    PathNode.LineTo(4.054f, 12.974f),
                    PathNode.CurveTo(3.86f, 13.491f, 4.122f, 14.067f, 4.639f, 14.261f),
                    PathNode.CurveTo(5.156f, 14.455f, 5.733f, 14.193f, 5.927f, 13.676f),
                    PathNode.LineTo(7.061f, 10.649f),
                    PathNode.CurveTo(7.207f, 10.259f, 7.58f, 10.0f, 7.998f, 10.0f),
                    PathNode.LineTo(21.0f, 10.0f),
                    PathNode.LineTo(21.217f, 10.012f),
                    PathNode.CurveTo(21.433f, 10.036f, 21.643f, 10.094f, 21.841f, 10.185f),
                    PathNode.CurveTo(21.895f, 10.21f, 21.948f, 10.238f, 22.0f, 10.268f),
                    PathNode.CurveTo(22.199f, 10.383f, 22.377f, 10.531f, 22.525f, 10.707f),
                    PathNode.CurveTo(22.713f, 10.929f, 22.85f, 11.189f, 22.928f, 11.469f),
                    PathNode.CurveTo(23.005f, 11.749f, 23.02f, 12.042f, 22.973f, 12.328f),
                    PathNode.CurveTo(22.972f, 12.336f, 22.97f, 12.344f, 22.968f, 12.352f),
                    PathNode.LineTo(21.973f, 17.562f),
                    PathNode.CurveTo(21.842f, 18.248f, 21.476f, 18.866f, 20.937f, 19.311f),
                    PathNode.CurveTo(20.467f, 19.7f, 19.891f, 19.935f, 19.287f, 19.988f),
                    PathNode.LineTo(19.026f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(4.204f, 20.0f, 3.442f, 19.684f, 2.879f, 19.121f),
                    PathNode.CurveTo(2.316f, 18.558f, 2.0f, 17.796f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
