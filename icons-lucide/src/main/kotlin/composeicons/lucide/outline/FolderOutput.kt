package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderOutput: ImageVector
    get() {
        if (_folderOutput != null) return _folderOutput!!
        _folderOutput = lucideOutlineIcon(
            name = "FolderOutput",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 7.5v-2.5C2 3.895 2.895 3 4 3h3.9c.68-.007 1.316 .332 1.69 .9l.81 1.2c.37 .562 .997 .9 1.67 .9h7.93c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-16c-.936 .03-1.766-.594-2-1.5")
            addPathData("M2 13h10")
            addPathData("M5 10 2 13l3 3")
        }
        return _folderOutput!!
    }

private var _folderOutput: ImageVector? = null
