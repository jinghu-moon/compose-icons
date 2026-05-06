package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderCode: ImageVector
    get() {
        if (_folderCode != null) return _folderCode!!
        _folderCode = lucideOutlineIcon(
            name = "FolderCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10.5 8 13l2 2.5")
            addPathData("M14 10.5 16 13l-2 2.5")
            addPathData("M20 20c1.105 0 2-.895 2-2v-10C22 6.895 21.105 6 20 6h-7.9c-.68 .007-1.316-.332-1.69-.9L9.6 3.9C9.23 3.338 8.603 3 7.93 3h-3.93C2.895 3 2 3.895 2 5v13c0 1.105 .895 2 2 2Z")
        }
        return _folderCode!!
    }

private var _folderCode: ImageVector? = null
