package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Swords: ImageVector
    get() {
        if (_swords != null) return _swords!!
        _swords = lucideOutlineIcon(
            name = "Swords",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.5 17.5 3 6v-3h3L17.5 14.5")
            addPathData("M13 19l6-6")
            addPathData("M16 16l4 4")
            addPathData("M19 21l2-2")
            addPathData("M14.5 6.5 18 3h3v3L17.5 9.5")
            addPathData("M5 14l4 4")
            addPathData("M7 17 4 20")
            addPathData("M3 19l2 2")
        }
        return _swords!!
    }

private var _swords: ImageVector? = null
