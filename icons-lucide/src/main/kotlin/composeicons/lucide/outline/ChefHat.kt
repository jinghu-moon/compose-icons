package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = lucideOutlineIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 21c.552 0 1-.448 1-1v-5.35c0-.457 .316-.844 .727-1.041 1.757-.838 2.655-2.819 2.128-4.693C20.329 7.042 18.529 5.82 16.593 6.02 15.804 4.185 13.998 2.996 12 2.996c-1.998 0-3.804 1.189-4.593 3.024C5.472 5.821 3.674 7.043 3.147 8.916c-.527 1.873 .37 3.853 2.126 4.692 .411 .198 .727 .585 .727 1.041v5.351c0 .552 .448 1 1 1Z")
            addPathData("M6 17h12")
        }
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
