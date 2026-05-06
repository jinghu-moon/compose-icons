package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShoppingBagSearch: ImageVector
    get() {
        if (_shoppingBagSearch != null) return _shoppingBagSearch!!
        _shoppingBagSearch = tablerOutlineIcon(
            name = "ShoppingBagSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 21h-2.926C7.093 21 5.834 19.92 5.609 18.456L4.354 10.304C4.265 9.727 4.433 9.14 4.813 8.698 5.193 8.255 5.747 8 6.331 8h11.339c.584-0 1.138 .255 1.518 .698 .38 .443 .548 1.03 .459 1.606l-.117 .761")
            addPathData("M9 11v-5C9 4.343 10.343 3 12 3c1.657 0 3 1.343 3 3v5")
            addPathData("M15 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M20.2 20.2 22 22")
        }
        return _shoppingBagSearch!!
    }

private var _shoppingBagSearch: ImageVector? = null
