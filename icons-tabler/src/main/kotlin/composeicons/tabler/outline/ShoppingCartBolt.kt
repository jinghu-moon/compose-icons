package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShoppingCartBolt: ImageVector
    get() {
        if (_shoppingCartBolt != null) return _shoppingCartBolt!!
        _shoppingCartBolt = tablerOutlineIcon(
            name = "ShoppingCartBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 17.895 7.105 17 6 17c-1.105 0-2 .895-2 2")
            addPathData("M13.5 17h-7.5v-14h-2")
            addPathData("M6 5 20 6l-.858 6.004M16.5 13h-10.5")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _shoppingCartBolt!!
    }

private var _shoppingCartBolt: ImageVector? = null
