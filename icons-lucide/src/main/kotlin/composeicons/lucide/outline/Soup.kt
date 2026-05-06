package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Soup: ImageVector
    get() {
        if (_soup != null) return _soup!!
        _soup = lucideOutlineIcon(
            name = "Soup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21c4.971 0 9-4.029 9-9h-18c0 4.971 4.029 9 9 9Z")
            addPathData("M7 21h10")
            addPathData("M19.5 12 22 6")
            addPathData("M16.25 3c.27 .1 .8 .53 .75 1.36-.06 .83-.93 1.2-1 2.02-.05 .78 .34 1.24 .73 1.62")
            addPathData("M11.25 3c.27 .1 .8 .53 .74 1.36-.05 .83-.93 1.2-.98 2.02-.06 .78 .33 1.24 .72 1.62")
            addPathData("M6.25 3c.27 .1 .8 .53 .75 1.36C6.94 5.19 6.07 5.56 6 6.38 5.95 7.16 6.34 7.62 6.74 8")
        }
        return _soup!!
    }

private var _soup: ImageVector? = null
