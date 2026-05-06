package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) return _shoppingBag!!
        _shoppingBag = lucideOutlineIcon(
            name = "ShoppingBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 10c0 2.209-1.791 4-4 4C9.791 14 8 12.209 8 10")
            addPathData("M3.103 6.034h17.794")
            addPathData("M3.4 5.467C3.14 5.813 3 6.234 3 6.667v13.333c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-13.333c0-.433-.14-.854-.4-1.2l-2-2.667C18.222 2.296 17.63 2 17 2h-10C6.37 2 5.778 2.296 5.4 2.8Z")
        }
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
