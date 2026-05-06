package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShoppingCartX: ImageVector
    get() {
        if (_shoppingCartX != null) return _shoppingCartX!!
        _shoppingCartX = tablerOutlineIcon(
            name = "ShoppingCartX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 17.895 7.105 17 6 17c-1.105 0-2 .895-2 2")
            addPathData("M13 17h-7v-14h-2")
            addPathData("M6 5 20 6l-1 7h-13")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _shoppingCartX!!
    }

private var _shoppingCartX: ImageVector? = null
