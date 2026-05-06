package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraPause: ImageVector
    get() {
        if (_cameraPause != null) return _cameraPause!!
        _cameraPause = tablerOutlineIcon(
            name = "CameraPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 20h-8C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7h1C7.105 7 8 6.105 8 5 8 4.448 8.448 4 9 4h6c.552 0 1 .448 1 1 0 1.105 .895 2 2 2h1c1.105 0 2 .895 2 2v4")
            addPathData("M14.958 13.506c.232-1.356-.489-2.696-1.749-3.251-1.259-.554-2.734-.181-3.578 .906-.844 1.087-.84 2.608 .009 3.691 .849 1.083 2.326 1.449 3.583 .888")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _cameraPause!!
    }

private var _cameraPause: ImageVector? = null
