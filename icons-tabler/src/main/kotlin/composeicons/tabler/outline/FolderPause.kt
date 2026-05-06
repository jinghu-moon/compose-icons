package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FolderPause: ImageVector
    get() {
        if (_folderPause != null) return _folderPause!!
        _folderPause = tablerOutlineIcon(
            name = "FolderPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 19h-8C3.895 19 3 18.105 3 17v-11C3 4.895 3.895 4 5 4h4l3 3h7c1.105 0 2 .895 2 2v4")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _folderPause!!
    }

private var _folderPause: ImageVector? = null
