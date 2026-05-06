package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShoppingCartShare: ImageVector
    get() {
        if (_shoppingCartShare != null) return _shoppingCartShare!!
        _shoppingCartShare = tablerOutlineIcon(
            name = "ShoppingCartShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 17.895 7.105 17 6 17c-1.105 0-2 .895-2 2")
            addPathData("M12.5 17h-6.5v-14h-2")
            addPathData("M6 5 20 6l-1 7h-13")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _shoppingCartShare!!
    }

private var _shoppingCartShare: ImageVector? = null
