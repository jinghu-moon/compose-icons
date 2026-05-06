package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderGit: ImageVector
    get() {
        if (_folderGit != null) return _folderGit!!
        _folderGit = lucideOutlineIcon(
            name = "FolderGit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 13c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M20 20c1.105 0 2-.895 2-2v-10C22 6.895 21.105 6 20 6h-7.9c-.68 .007-1.316-.332-1.69-.9L9.6 3.9C9.23 3.338 8.603 3 7.93 3h-3.93C2.895 3 2 3.895 2 5v13c0 1.105 .895 2 2 2Z")
            addPathData("M14 13h3")
            addPathData("M7 13h3")
        }
        return _folderGit!!
    }

private var _folderGit: ImageVector? = null
