package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderLock: ImageVector
    get() {
        if (_folderLock != null) return _folderLock!!
        _folderLock = lucideOutlineIcon(
            name = "FolderLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 17h6c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1Z")
            addPathData("M10 20h-6C2.895 20 2 19.105 2 18v-13C2 3.895 2.895 3 4 3h3.9c.68-.007 1.316 .332 1.69 .9l.81 1.2c.37 .562 .997 .9 1.67 .9h7.93c1.105 0 2 .895 2 2v2.5")
            addPathData("M20 17v-2c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2v2")
        }
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
