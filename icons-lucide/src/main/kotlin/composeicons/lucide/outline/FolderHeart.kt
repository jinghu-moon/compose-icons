package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderHeart: ImageVector
    get() {
        if (_folderHeart != null) return _folderHeart!!
        _folderHeart = lucideOutlineIcon(
            name = "FolderHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.638 20h-6.638C2.895 20 2 19.105 2 18v-13C2 3.895 2.895 3 4 3h3.9c.68-.007 1.316 .332 1.69 .9l.81 1.2c.37 .562 .997 .9 1.67 .9h7.93c1.105 0 2 .895 2 2v3.417")
            addPathData("M14.62 18.8c-.573-.597-.772-1.461-.517-2.249 .254-.788 .921-1.372 1.735-1.522 .814-.149 1.645 .16 2.162 .807 .52-.639 1.348-.943 2.158-.792 .81 .151 1.473 .732 1.728 1.516 .255 .784 .061 1.644-.505 2.242l-2.626 2.856c-.19 .218-.464 .344-.753 .344-.289 0-.564-.125-.753-.344Z")
        }
        return _folderHeart!!
    }

private var _folderHeart: ImageVector? = null
