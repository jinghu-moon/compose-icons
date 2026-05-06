package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StickyNote: ImageVector
    get() {
        if (_stickyNote != null) return _stickyNote!!
        _stickyNote = lucideOutlineIcon(
            name = "StickyNote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 9c.002-.64-.253-1.254-.706-1.706L16.706 3.706C16.254 3.253 15.64 2.998 15 3h-10C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2Z")
            addPathData("M15 3v5c0 .552 .448 1 1 1h5")
        }
        return _stickyNote!!
    }

private var _stickyNote: ImageVector? = null
