package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Fish: ImageVector
    get() {
        if (_fish != null) return _fish!!
        _fish = lucideOutlineIcon(
            name = "Fish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.5 12C7.44 8.54 11.44 6 15 6c3.56 0 6.06 2.54 7 6-.94 3.47-3.44 6-7 6C11.44 18 7.44 15.47 6.5 12Z")
            addPathData("M18 12v.5")
            addPathData("M16 17.93C13.326 14.429 13.326 9.571 16 6.07")
            addPathData("M7 10.67C7 8 5.58 5.97 2.73 5.5c-1 1.5-1 5 .23 6.5-1.24 1.5-1.24 5-.23 6.5C5.58 18.03 7 16 7 13.33")
            addPathData("M10.46 7.26C10.2 5.88 9.17 4.24 8 3h5.8c.98-.004 1.818 .703 1.98 1.67l.23 1.4")
            addPathData("M16.01 17.93l-.23 1.4c-.162 .967-1 1.674-1.98 1.67h-4.3c.969-1.099 1.499-2.515 1.49-3.98")
        }
        return _fish!!
    }

private var _fish: ImageVector? = null
