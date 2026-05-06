package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Anvil: ImageVector
    get() {
        if (_anvil != null) return _anvil!!
        _anvil = lucideOutlineIcon(
            name = "Anvil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 10h-1C3.791 10 2 8.209 2 6 2 5.448 2.448 5 3 5h4")
            addPathData("M7 5C7 4.448 7.448 4 8 4h13c.552 0 1 .448 1 1 0 3.866-3.134 7-7 7h-7C7.448 12 7 11.552 7 11Z")
            addPathData("M9 12v5")
            addPathData("M15 12v5")
            addPathData("M5 20C5 18.343 6.343 17 8 17h8c1.657 0 3 1.343 3 3 0 .552-.448 1-1 1h-12C5.448 21 5 20.552 5 20")
        }
        return _anvil!!
    }

private var _anvil: ImageVector? = null
