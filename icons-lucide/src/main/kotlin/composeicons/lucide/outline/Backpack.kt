package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = lucideOutlineIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10C4 7.791 5.791 6 8 6h8c2.209 0 4 1.791 4 4v10c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20Z")
            addPathData("M8 10h8")
            addPathData("M8 18h8")
            addPathData("M8 22v-6c0-1.105 .895-2 2-2h4c1.105 0 2 .895 2 2v6")
            addPathData("M9 6v-2C9 2.895 9.895 2 11 2h2c1.105 0 2 .895 2 2v2")
        }
        return _backpack!!
    }

private var _backpack: ImageVector? = null
