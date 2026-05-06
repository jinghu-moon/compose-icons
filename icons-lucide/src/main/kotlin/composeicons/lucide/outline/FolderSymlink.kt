package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderSymlink: ImageVector
    get() {
        if (_folderSymlink != null) return _folderSymlink!!
        _folderSymlink = lucideOutlineIcon(
            name = "FolderSymlink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 9.35v-4.35C2 3.895 2.895 3 4 3h3.9c.68-.007 1.316 .332 1.69 .9l.81 1.2c.37 .562 .997 .9 1.67 .9h7.93c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-16C2.895 20 2 19.105 2 18v-3c0-1.105 .895-2 2-2h7")
            addPathData("M8 16l3-3L8 10")
        }
        return _folderSymlink!!
    }

private var _folderSymlink: ImageVector? = null
