package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Music: ImageVector
    get() {
        if (_music != null) return _music!!
        _music = lucideOutlineIcon(
            name = "Music",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 18v-13L21 3v13")
            addPathData("M9 18c0 1.657-1.343 3-3 3C4.343 21 3 19.657 3 18 3 16.343 4.343 15 6 15c1.657 0 3 1.343 3 3Z")
            addPathData("M21 16c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _music!!
    }

private var _music: ImageVector? = null
