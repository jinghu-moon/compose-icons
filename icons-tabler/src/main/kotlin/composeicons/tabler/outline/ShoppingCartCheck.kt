package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShoppingCartCheck: ImageVector
    get() {
        if (_shoppingCartCheck != null) return _shoppingCartCheck!!
        _shoppingCartCheck = tablerOutlineIcon(
            name = "ShoppingCartCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 17.895 7.105 17 6 17c-1.105 0-2 .895-2 2")
            addPathData("M11.5 17h-5.5v-14h-2")
            addPathData("M6 5 20 6l-1 7h-13")
            addPathData("M15 19l2 2 4-4")
        }
        return _shoppingCartCheck!!
    }

private var _shoppingCartCheck: ImageVector? = null
