package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FolderRoot: ImageVector
    get() {
        if (_folderRoot != null) return _folderRoot!!
        _folderRoot = tablerOutlineIcon(
            name = "FolderRoot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 13c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M12 15v4")
            addPathData("M5 4h4l3 3h7c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-11C3 4.895 3.895 4 5 4")
        }
        return _folderRoot!!
    }

private var _folderRoot: ImageVector? = null
