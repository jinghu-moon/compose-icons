package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Music3: ImageVector
    get() {
        if (_music3 != null) return _music3!!
        _music3 = lucideOutlineIcon(
            name = "Music3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 18c0 2.209-1.791 4-4 4C9.791 22 8 20.209 8 18c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z")
            addPathData("M16 18v-16")
        }
        return _music3!!
    }

private var _music3: ImageVector? = null
