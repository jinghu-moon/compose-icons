package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShoppingCartCancel: ImageVector
    get() {
        if (_shoppingCartCancel != null) return _shoppingCartCancel!!
        _shoppingCartCancel = tablerOutlineIcon(
            name = "ShoppingCartCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 17.895 7.105 17 6 17c-1.105 0-2 .895-2 2")
            addPathData("M12 17h-6v-14h-2")
            addPathData("M6 5 20 6l-.857 5.998M15.5 13h-9.5")
            addPathData("M16 19c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M17 21l4-4")
        }
        return _shoppingCartCancel!!
    }

private var _shoppingCartCancel: ImageVector? = null
