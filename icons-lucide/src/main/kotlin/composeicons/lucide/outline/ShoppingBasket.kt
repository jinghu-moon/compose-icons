package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShoppingBasket: ImageVector
    get() {
        if (_shoppingBasket != null) return _shoppingBasket!!
        _shoppingBasket = lucideOutlineIcon(
            name = "ShoppingBasket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 11l-1 9")
            addPathData("M19 11 15 4")
            addPathData("M2 11h20")
            addPathData("M3.5 11l1.6 7.4c.193 .946 1.034 1.619 2 1.6h9.8c.966 .019 1.807-.654 2-1.6L20.6 11")
            addPathData("M4.5 15.5h15")
            addPathData("M5 11 9 4")
            addPathData("M9 11l1 9")
        }
        return _shoppingBasket!!
    }

private var _shoppingBasket: ImageVector? = null
