package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderSync: ImageVector
    get() {
        if (_folderSync != null) return _folderSync!!
        _folderSync = lucideOutlineIcon(
            name = "FolderSync",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 20h-5C2.895 20 2 19.105 2 18v-13C2 3.895 2.895 3 4 3h3.9c.68-.007 1.316 .332 1.69 .9l.81 1.2c.37 .562 .997 .9 1.67 .9h7.93c1.105 0 2 .895 2 2v.5")
            addPathData("M12 10v4h4")
            addPathData("M12 14l1.535-1.605c1.165-1.119 2.798-1.607 4.386-1.309 1.588 .298 2.934 1.344 3.614 2.809")
            addPathData("M22 22v-4h-4")
            addPathData("M22 18l-1.535 1.605c-1.165 1.119-2.798 1.607-4.386 1.309-1.588-.298-2.934-1.344-3.614-2.809")
        }
        return _folderSync!!
    }

private var _folderSync: ImageVector? = null
