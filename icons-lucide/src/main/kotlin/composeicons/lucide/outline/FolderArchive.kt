package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderArchive: ImageVector
    get() {
        if (_folderArchive != null) return _folderArchive!!
        _folderArchive = lucideOutlineIcon(
            name = "FolderArchive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 19c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M20.9 19.8C21.579 19.458 22.005 18.76 22 18v-10C22 6.895 21.105 6 20 6h-7.9c-.68 .007-1.316-.332-1.69-.9L9.6 3.9C9.23 3.338 8.603 3 7.93 3h-3.93C2.895 3 2 3.895 2 5v13c0 1.105 .895 2 2 2h5.1")
            addPathData("M15 11v-1")
            addPathData("M15 17v-2")
        }
        return _folderArchive!!
    }

private var _folderArchive: ImageVector? = null
