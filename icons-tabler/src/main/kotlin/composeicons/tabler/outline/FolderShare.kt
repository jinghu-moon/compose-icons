package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FolderShare: ImageVector
    get() {
        if (_folderShare != null) return _folderShare!!
        _folderShare = tablerOutlineIcon(
            name = "FolderShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 19h-8C3.895 19 3 18.105 3 17v-11C3 4.895 3.895 4 5 4h4l3 3h7c1.105 0 2 .895 2 2v4")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _folderShare!!
    }

private var _folderShare: ImageVector? = null
