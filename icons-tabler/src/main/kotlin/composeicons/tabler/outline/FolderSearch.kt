package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FolderSearch: ImageVector
    get() {
        if (_folderSearch != null) return _folderSearch!!
        _folderSearch = tablerOutlineIcon(
            name = "FolderSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 19h-6C3.895 19 3 18.105 3 17v-11C3 4.895 3.895 4 5 4h4l3 3h7c1.105 0 2 .895 2 2v2.5")
            addPathData("M15 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M20.2 20.2 22 22")
        }
        return _folderSearch!!
    }

private var _folderSearch: ImageVector? = null
