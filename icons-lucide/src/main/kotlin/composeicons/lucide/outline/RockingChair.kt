package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RockingChair: ImageVector
    get() {
        if (_rockingChair != null) return _rockingChair!!
        _rockingChair = lucideOutlineIcon(
            name = "RockingChair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 13l3.708 7.416")
            addPathData("M3 19c5.333 4 12.667 4 18 0")
            addPathData("M3 2l3.21 9.633c.273 .817 1.038 1.368 1.899 1.367h9.891")
            addPathData("M9 13 5.292 20.416")
        }
        return _rockingChair!!
    }

private var _rockingChair: ImageVector? = null
