package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = lucideOutlineIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 7v-3C19 3.448 18.552 3 18 3h-13C3.895 3 3 3.895 3 5c0 1.105 .895 2 2 2h15c.552 0 1 .448 1 1v4h-3c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2h3c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1")
            addPathData("M3 5v14c0 1.105 .895 2 2 2h15c.552 0 1-.448 1-1v-4")
        }
        return _wallet!!
    }

private var _wallet: ImageVector? = null
