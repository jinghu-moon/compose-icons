package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = lucideOutlineIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 21c0 .552-.448 1-1 1C7.448 22 7 21.552 7 21c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M20 21c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M2.05 2.05h2L6.71 14.47c.201 .938 1.041 1.601 2 1.58h9.78c.938-.002 1.748-.654 1.95-1.57L22.09 7.05h-16.97")
        }
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
