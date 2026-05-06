package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FolderX: ImageVector
    get() {
        if (_folderX != null) return _folderX!!
        _folderX = tablerOutlineIcon(
            name = "FolderX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 19h-8.5C3.895 19 3 18.105 3 17v-11C3 4.895 3.895 4 5 4h4l3 3h7c1.105 0 2 .895 2 2v4")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _folderX!!
    }

private var _folderX: ImageVector? = null
