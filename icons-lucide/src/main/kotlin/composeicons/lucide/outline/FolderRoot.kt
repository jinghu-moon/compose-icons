package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderRoot: ImageVector
    get() {
        if (_folderRoot != null) return _folderRoot!!
        _folderRoot = lucideOutlineIcon(
            name = "FolderRoot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h16c1.105 0 2-.895 2-2v-10C22 6.895 21.105 6 20 6h-7.93c-.669-.003-1.292-.341-1.66-.9L9.59 3.9C9.222 3.341 8.599 3.003 7.93 3h-3.93C2.895 3 2 3.895 2 5v13c0 1.1 .9 2 2 2Z")
            addPathData("M14 13c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M12 15v5")
        }
        return _folderRoot!!
    }

private var _folderRoot: ImageVector? = null
