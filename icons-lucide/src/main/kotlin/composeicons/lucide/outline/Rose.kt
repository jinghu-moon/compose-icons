package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rose: ImageVector
    get() {
        if (_rose != null) return _rose!!
        _rose = lucideOutlineIcon(
            name = "Rose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 10h-1C13.791 10 12 8.209 12 6 12 3.791 13.791 2 16 2c2.209 0 4 1.791 4 4v.534")
            addPathData("M17 6h1c1.931-.001 3.587 1.379 3.936 3.278 .349 1.9-.71 3.777-2.516 4.462l-2.29 .87c-2.88 1.096-6.123-.168-7.501-2.925C8.251 8.929 9.186 5.576 11.791 3.93L13.86 2.62")
            addPathData("M4.5 17c2.8-.5 4.4 0 5.5 .8 1.1 .8 1.8 2.2 2.3 3.7-2 .4-3.5 .4-4.8-.3C6.3 20.6 5.2 19.3 4.5 17")
            addPathData("M9.77 12C4 15 2 22 2 22")
            addPathData("M19 8c0 1.105-.895 2-2 2C15.895 10 15 9.105 15 8c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _rose!!
    }

private var _rose: ImageVector? = null
