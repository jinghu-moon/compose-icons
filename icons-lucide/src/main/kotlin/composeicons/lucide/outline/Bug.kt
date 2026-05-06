package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bug: ImageVector
    get() {
        if (_bug != null) return _bug!!
        _bug = lucideOutlineIcon(
            name = "Bug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20v-9")
            addPathData("M14 7c2.209 0 4 1.791 4 4v3c0 3.314-2.686 6-6 6C8.686 20 6 17.314 6 14v-3C6 8.791 7.791 7 10 7Z")
            addPathData("M14.12 3.88 16 2")
            addPathData("M21 21c.002-2.137-1.675-3.898-3.81-4")
            addPathData("M21 5c-.002 2.033-1.53 3.741-3.55 3.97")
            addPathData("M22 13h-4")
            addPathData("M3 21C2.998 18.863 4.675 17.102 6.81 17")
            addPathData("M3 5c.002 2.033 1.53 3.741 3.55 3.97")
            addPathData("M6 13h-4")
            addPathData("M8 2 9.88 3.88")
            addPathData("M9 7.13v-1.13C9 4.343 10.343 3 12 3c1.657 0 3 1.343 3 3v1.13")
        }
        return _bug!!
    }

private var _bug: ImageVector? = null
