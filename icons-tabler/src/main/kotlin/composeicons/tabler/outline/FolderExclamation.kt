package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FolderExclamation: ImageVector
    get() {
        if (_folderExclamation != null) return _folderExclamation!!
        _folderExclamation = tablerOutlineIcon(
            name = "FolderExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 19h-10C3.895 19 3 18.105 3 17v-11C3 4.895 3.895 4 5 4h4l3 3h7c1.105 0 2 .895 2 2v3.5")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _folderExclamation!!
    }

private var _folderExclamation: ImageVector? = null
