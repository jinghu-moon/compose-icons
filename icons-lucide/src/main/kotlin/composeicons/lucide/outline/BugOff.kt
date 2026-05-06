package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BugOff: ImageVector
    get() {
        if (_bugOff != null) return _bugOff!!
        _bugOff = lucideOutlineIcon(
            name = "BugOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20v-8")
            addPathData("M12.656 7h1.344c2.209 0 4 1.791 4 4v1.344")
            addPathData("M14.12 3.88 16 2")
            addPathData("M17.123 17.123c-1.4 2.296-4.156 3.38-6.745 2.653C7.789 19.049 6 16.689 6 14v-3C6 9.689 6.643 8.46 7.72 7.713")
            addPathData("M2 2 22 22")
            addPathData("M21 5c-.002 2.033-1.53 3.741-3.55 3.97")
            addPathData("M22 13h-3.344")
            addPathData("M3 21C2.998 18.863 4.675 17.102 6.81 17")
            addPathData("M3 5c.002 2.033 1.53 3.741 3.55 3.97")
            addPathData("M6 13h-4")
            addPathData("M8 2 9.88 3.88")
            addPathData("M9.712 4.06c.814-.96 2.14-1.309 3.321-.876C14.215 3.617 15 4.742 15 6v1.13")
        }
        return _bugOff!!
    }

private var _bugOff: ImageVector? = null
