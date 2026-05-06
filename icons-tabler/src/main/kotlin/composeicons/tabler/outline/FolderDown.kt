package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FolderDown: ImageVector
    get() {
        if (_folderDown != null) return _folderDown!!
        _folderDown = tablerOutlineIcon(
            name = "FolderDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 19h-7C3.895 19 3 18.105 3 17v-11C3 4.895 3.895 4 5 4h4l3 3h7c1.105 0 2 .895 2 2v3.5")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _folderDown!!
    }

private var _folderDown: ImageVector? = null
