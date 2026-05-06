package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Glasses: ImageVector
    get() {
        if (_glasses != null) return _glasses!!
        _glasses = lucideOutlineIcon(
            name = "Glasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 15c0 2.209-1.791 4-4 4C3.791 19 2 17.209 2 15 2 12.791 3.791 11 6 11c2.209 0 4 1.791 4 4Z")
            addPathData("M22 15c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z")
            addPathData("M14 15c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M2.5 13 5 7C5.7 5.7 6.4 5 8 5")
            addPathData("M21.5 13 19 7C18.3 5.7 17.5 5 16 5")
        }
        return _glasses!!
    }

private var _glasses: ImageVector? = null
