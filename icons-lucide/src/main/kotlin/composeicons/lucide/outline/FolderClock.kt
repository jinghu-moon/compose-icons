package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderClock: ImageVector
    get() {
        if (_folderClock != null) return _folderClock!!
        _folderClock = lucideOutlineIcon(
            name = "FolderClock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 14v2.2l1.6 1")
            addPathData("M7 20h-3C2.895 20 2 19.105 2 18v-13C2 3.895 2.895 3 4 3h3.9c.68-.007 1.316 .332 1.69 .9l.81 1.2c.37 .562 .997 .9 1.67 .9h7.93c1.105 0 2 .895 2 2")
            addPathData("M22 16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z")
        }
        return _folderClock!!
    }

private var _folderClock: ImageVector? = null
