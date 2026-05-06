package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShoppingCartUp: ImageVector
    get() {
        if (_shoppingCartUp != null) return _shoppingCartUp!!
        _shoppingCartUp = tablerOutlineIcon(
            name = "ShoppingCartUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 17.895 7.105 17 6 17c-1.105 0-2 .895-2 2")
            addPathData("M12.5 17h-6.5v-14h-2")
            addPathData("M6 5 20 6l-.854 5.977M16.5 13h-10.5")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _shoppingCartUp!!
    }

private var _shoppingCartUp: ImageVector? = null
