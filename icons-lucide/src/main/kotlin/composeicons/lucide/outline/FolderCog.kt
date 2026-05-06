package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderCog: ImageVector
    get() {
        if (_folderCog != null) return _folderCog!!
        _folderCog = lucideOutlineIcon(
            name = "FolderCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.3 20h-6.3C2.895 20 2 19.105 2 18v-13C2 3.895 2.895 3 4 3h3.98c.68-.007 1.316 .332 1.69 .9l.66 1.2c.37 .562 .997 .9 1.67 .9h8c1.105 0 2 .895 2 2v3.3")
            addPathData("M14.305 19.53l.923-.382")
            addPathData("M15.228 16.852l-.923-.383")
            addPathData("M16.852 15.228l-.383-.923")
            addPathData("M16.852 20.772l-.383 .924")
            addPathData("M19.148 15.228l.383-.923")
            addPathData("M19.53 21.696l-.382-.924")
            addPathData("M20.772 16.852l.924-.383")
            addPathData("M20.772 19.148l.924 .383")
            addPathData("M21 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _folderCog!!
    }

private var _folderCog: ImageVector? = null
