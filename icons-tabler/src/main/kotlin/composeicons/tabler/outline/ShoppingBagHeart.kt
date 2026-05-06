package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShoppingBagHeart: ImageVector
    get() {
        if (_shoppingBagHeart != null) return _shoppingBagHeart!!
        _shoppingBagHeart = tablerOutlineIcon(
            name = "ShoppingBagHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 21h-2.926C7.093 21 5.834 19.92 5.609 18.456L4.354 10.304C4.265 9.727 4.433 9.14 4.813 8.698 5.193 8.255 5.747 8 6.331 8h11.339c.584-0 1.138 .255 1.518 .698 .38 .443 .548 1.03 .459 1.606-.057 .368-.1 .644-.127 .828")
            addPathData("M9 11v-5C9 4.343 10.343 3 12 3c1.657 0 3 1.343 3 3v5")
            addPathData("M18 22l3.35-3.284c.415-.403 .65-.956 .651-1.534 .001-.578-.232-1.132-.646-1.537-.869-.85-2.257-.852-3.129-.006l-.224 .22-.223-.22c-.869-.849-2.256-.852-3.128-.006-.415 .403-.65 .956-.651 1.534-.001 .578 .232 1.133 .645 1.537L18 22")
        }
        return _shoppingBagHeart!!
    }

private var _shoppingBagHeart: ImageVector? = null
