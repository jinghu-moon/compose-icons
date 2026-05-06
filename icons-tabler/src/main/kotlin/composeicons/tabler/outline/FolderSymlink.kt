package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FolderSymlink: ImageVector
    get() {
        if (_folderSymlink != null) return _folderSymlink!!
        _folderSymlink = tablerOutlineIcon(
            name = "FolderSymlink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21v-4C3 15.343 4.343 14 6 14h5")
            addPathData("M8 17l3-3L8 11")
            addPathData("M3 11v-5C3 4.895 3.895 4 5 4h4l3 3h7c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-8")
        }
        return _folderSymlink!!
    }

private var _folderSymlink: ImageVector? = null
