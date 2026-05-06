package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Menu: ImageVector
    get() {
        if (_menu != null) return _menu!!
        _menu = lucideOutlineIcon(
            name = "Menu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5h16")
            addPathData("M4 12h16")
            addPathData("M4 19h16")
        }
        return _menu!!
    }

private var _menu: ImageVector? = null
