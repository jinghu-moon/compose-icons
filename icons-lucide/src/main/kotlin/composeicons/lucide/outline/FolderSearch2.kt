package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderSearch2: ImageVector
    get() {
        if (_folderSearch2 != null) return _folderSearch2!!
        _folderSearch2 = lucideOutlineIcon(
            name = "FolderSearch2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 12.5C14 13.881 12.881 15 11.5 15 10.119 15 9 13.881 9 12.5 9 11.119 10.119 10 11.5 10 12.881 10 14 11.119 14 12.5Z")
            addPathData("M20 20c1.105 0 2-.895 2-2v-10C22 6.895 21.105 6 20 6h-7.9c-.68 .007-1.316-.332-1.69-.9L9.6 3.9C9.23 3.338 8.603 3 7.93 3h-3.93C2.895 3 2 3.895 2 5v13c0 1.105 .895 2 2 2Z")
            addPathData("M13.3 14.3 15 16")
        }
        return _folderSearch2!!
    }

private var _folderSearch2: ImageVector? = null
