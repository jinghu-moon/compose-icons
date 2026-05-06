package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShoppingBagPlus: ImageVector
    get() {
        if (_shoppingBagPlus != null) return _shoppingBagPlus!!
        _shoppingBagPlus = tablerOutlineIcon(
            name = "ShoppingBagPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 21h-3.926C7.093 21 5.834 19.92 5.609 18.456L4.354 10.304C4.265 9.727 4.433 9.14 4.813 8.698 5.193 8.255 5.747 8 6.331 8h11.339c.584-0 1.138 .255 1.518 .698 .38 .443 .548 1.03 .459 1.606l-.263 1.708")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
            addPathData("M9 11v-5C9 4.343 10.343 3 12 3c1.657 0 3 1.343 3 3v5")
        }
        return _shoppingBagPlus!!
    }

private var _shoppingBagPlus: ImageVector? = null
