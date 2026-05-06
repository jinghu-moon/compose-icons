package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = lucideOutlineIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10v-5c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v5")
            addPathData("M14 6c3.314 0 6 2.686 6 6v3")
            addPathData("M4 15v-3C4 8.686 6.686 6 10 6")
            addPathData("M3 15h18c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-18C2.448 19 2 18.552 2 18v-2c0-.552 .448-1 1-1Z")
        }
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
