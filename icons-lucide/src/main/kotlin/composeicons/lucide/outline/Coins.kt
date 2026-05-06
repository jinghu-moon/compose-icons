package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Coins: ImageVector
    get() {
        if (_coins != null) return _coins!!
        _coins = lucideOutlineIcon(
            name = "Coins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.744 17.736c-.829 2.741-3.48 4.514-6.33 4.234C4.564 21.69 2.31 19.436 2.03 16.586 1.75 13.736 3.523 11.085 6.264 10.256")
            addPathData("M15 6h1v4")
            addPathData("M6.134 14.768 7 14.268l2 3.464")
            addPathData("M22 8c0 3.314-2.686 6-6 6C12.686 14 10 11.314 10 8 10 4.686 12.686 2 16 2c3.314 0 6 2.686 6 6Z")
        }
        return _coins!!
    }

private var _coins: ImageVector? = null
