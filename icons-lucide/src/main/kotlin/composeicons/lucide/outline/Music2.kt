package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Music2: ImageVector
    get() {
        if (_music2 != null) return _music2!!
        _music2 = lucideOutlineIcon(
            name = "Music2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18c0 2.209-1.791 4-4 4C5.791 22 4 20.209 4 18 4 15.791 5.791 14 8 14c2.209 0 4 1.791 4 4Z")
            addPathData("M12 18v-16l7 4")
        }
        return _music2!!
    }

private var _music2: ImageVector? = null
