package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandCoins: ImageVector
    get() {
        if (_handCoins != null) return _handCoins!!
        _handCoins = lucideOutlineIcon(
            name = "HandCoins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 15h2c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2h-3c-.6 0-1.1 .2-1.4 .6L3 17")
            addPathData("M7 21 8.6 19.6C8.9 19.2 9.4 19 10 19h4c1.1 0 2.1-.4 2.8-1.2l4.6-4.4c.804-.759 .839-2.026 .08-2.83-.759-.804-2.026-.839-2.83-.08l-4.2 3.9")
            addPathData("M2 16l6 6")
            addPathData("M18.9 9c0 1.602-1.298 2.9-2.9 2.9C14.398 11.9 13.1 10.602 13.1 9 13.1 7.398 14.398 6.1 16 6.1c1.602 0 2.9 1.298 2.9 2.9Z")
            addPathData("M9 5C9 6.657 7.657 8 6 8 4.343 8 3 6.657 3 5 3 3.343 4.343 2 6 2 7.657 2 9 3.343 9 5Z")
        }
        return _handCoins!!
    }

private var _handCoins: ImageVector? = null
