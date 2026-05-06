package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Croissant: ImageVector
    get() {
        if (_croissant != null) return _croissant!!
        _croissant = lucideOutlineIcon(
            name = "Croissant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.2 18h-5.426c-.605-.021-1.138-.403-1.352-.97-.609-2.126-.563-4.387 .132-6.487")
            addPathData("M18 10.2v-5.426c-.021-.605-.403-1.138-.97-1.352-2.126-.609-4.386-.563-6.486 .132")
            addPathData("M18 5c2.209 0 4 1.343 4 3 0 1.105-.895 2-2 2-1.81-0-3.586 .49-5.139 1.42")
            addPathData("M5 18c0 2.209 1.343 4 3 4 1.105 0 2-.895 2-2-.001-1.81 .49-3.587 1.42-5.14")
            addPathData("M8.709 2.554C5.825 3.558 3.558 5.825 2.554 8.709c-.15 .631 .123 1.287 .676 1.626l9.807 5.42c.78 .431 1.752 .294 2.382-.336 .63-.63 .767-1.602 .336-2.382L10.335 3.23C9.996 2.677 9.34 2.404 8.709 2.554")
        }
        return _croissant!!
    }

private var _croissant: ImageVector? = null
