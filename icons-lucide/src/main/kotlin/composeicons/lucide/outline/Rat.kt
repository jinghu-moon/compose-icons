package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rat: ImageVector
    get() {
        if (_rat != null) return _rat!!
        _rat = lucideOutlineIcon(
            name = "Rat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 22h-9C2.895 22 2 21.105 2 20c0-1.105 .895-2 2-2h12")
            addPathData("M13.236 18c.784-.877 .984-2.131 .51-3.208C13.272 13.715 12.213 13.014 11.036 13")
            addPathData("M16 9h.01")
            addPathData("M16.82 3.94c.849-.898 2.161-1.184 3.307-.721 1.145 .464 1.889 1.582 1.874 2.818-.015 1.236-.787 2.335-1.944 2.771l1.815 2.587c.214 .485 .156 1.046-.152 1.477-.308 .431-.82 .668-1.348 .623l-2.872-.453c-.878-.148-1.777 .101-2.453 .68-.676 .58-1.06 1.429-1.047 2.32")
            addPathData("M17 4.988C16.994 3.646 16.098 2.471 14.805 2.11c-1.293-.36-2.668 .182-3.367 1.328-.699 1.146-.551 2.617 .362 3.601C9.814 6.811 7.824 7.443 6.334 8.776 4.843 10.109 3.994 12.016 4 14.015c.008 2.203 1.797 3.985 4 3.985")
        }
        return _rat!!
    }

private var _rat: ImageVector? = null
