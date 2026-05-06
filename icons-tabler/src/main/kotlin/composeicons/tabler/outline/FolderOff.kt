package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FolderOff: ImageVector
    get() {
        if (_folderOff != null) return _folderOff!!
        _folderOff = tablerOutlineIcon(
            name = "FolderOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h1l3 3h7c1.105 0 2 .895 2 2v8M19 19h-14C3.895 19 3 18.105 3 17v-11C3 5.209 3.466 4.492 4.189 4.171")
            addPathData("M3 3 21 21")
        }
        return _folderOff!!
    }

private var _folderOff: ImageVector? = null
