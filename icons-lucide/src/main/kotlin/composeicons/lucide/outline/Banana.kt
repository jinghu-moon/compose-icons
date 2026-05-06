package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Banana: ImageVector
    get() {
        if (_banana != null) return _banana!!
        _banana = lucideOutlineIcon(
            name = "Banana",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 13c3.5-2 8-2 10 2 1.721-.879 3.777-.79 5.416 .235C21.055 16.259 22.036 18.068 22 20")
            addPathData("M5.15 17.89C10.67 16.37 13.8 11 12.15 5.89 11.55 4 11.5 2 13 2c3.22 0 5 5.5 5 8C18 16.5 13.8 22 7.51 22 5.11 22 2 22 2 20 2 18.5 3.14 18.45 5.15 17.89Z")
        }
        return _banana!!
    }

private var _banana: ImageVector? = null
