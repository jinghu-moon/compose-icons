package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileClock: ImageVector
    get() {
        if (_fileClock != null) return _fileClock!!
        _fileClock = lucideOutlineIcon(
            name = "FileClock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 22h2c1.105 0 2-.895 2-2v-12c.002-.64-.253-1.254-.706-1.706L15.706 2.706C15.254 2.253 14.64 1.998 14 2h-8C4.895 2 4 2.895 4 4v2.85")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M8 14v2.2l1.6 1")
            addPathData("M14 16c0 3.314-2.686 6-6 6C4.686 22 2 19.314 2 16 2 12.686 4.686 10 8 10c3.314 0 6 2.686 6 6Z")
        }
        return _fileClock!!
    }

private var _fileClock: ImageVector? = null
