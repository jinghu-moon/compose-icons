package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = lucideOutlineIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 16c.5 .3 1.2 .5 2 .5 .8 0 1.5-.2 2-.5")
            addPathData("M15 12h.01")
            addPathData("M19.38 6.813c.701 1.019 1.185 2.172 1.42 3.387 .69 .334 1.128 1.033 1.128 1.8 0 .767-.438 1.466-1.128 1.8-.89 4.149-4.557 7.113-8.8 7.113-4.243 0-7.91-2.964-8.8-7.113C2.51 13.466 2.072 12.767 2.072 12c0-.767 .438-1.466 1.128-1.8C4.054 6.016 7.73 3.009 12 3c2 0 3.5 1.1 3.5 2.5 0 1.4-.9 2.5-2 2.5C12.7 8 12 7.6 12 7")
            addPathData("M9 12h.01")
        }
        return _baby!!
    }

private var _baby: ImageVector? = null
