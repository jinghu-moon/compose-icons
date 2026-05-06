package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.IceCreamBowl: ImageVector
    get() {
        if (_iceCreamBowl != null) return _iceCreamBowl!!
        _iceCreamBowl = lucideOutlineIcon(
            name = "IceCreamBowl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17c5 0 8-2.69 8-6h-16c0 3.31 3 6 8 6M8 21h8M12 18v3M5.14 11C4.714 9.567 5.245 8.022 6.462 7.154c1.216-.868 2.85-.868 4.067 0 1.216 .868 1.747 2.413 1.322 3.846")
            addPathData("M12.14 11c-.426-1.433 .105-2.978 1.322-3.846 1.216-.868 2.85-.868 4.067 0 1.216 .868 1.747 2.413 1.322 3.846")
            addPathData("M15.5 6.5C15.5 4.567 13.933 3 12 3 10.067 3 8.5 4.567 8.5 6.5")
        }
        return _iceCreamBowl!!
    }

private var _iceCreamBowl: ImageVector? = null
