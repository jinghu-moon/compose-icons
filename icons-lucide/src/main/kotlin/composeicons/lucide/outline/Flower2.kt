package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Flower2: ImageVector
    get() {
        if (_flower2 != null) return _flower2!!
        _flower2 = lucideOutlineIcon(
            name = "Flower2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5C12 3.343 13.343 2 15 2c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3M12 5C12 3.343 10.657 2 9 2 7.343 2 6 3.343 6 5 6 6.657 7.343 8 9 8M12 5v1M9 8C7.343 8 6 9.343 6 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3M9 8h1M15 8c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3M15 8h-1M12 11v-1")
            addPathData("M14 8c0 1.105-.895 2-2 2C10.895 10 10 9.105 10 8c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M12 10v12")
            addPathData("M12 22c4.2 0 7-1.667 7-5-4.2 0-7 1.667-7 5Z")
            addPathData("M12 22C7.8 22 5 20.333 5 17c4.2 0 7 1.667 7 5Z")
        }
        return _flower2!!
    }

private var _flower2: ImageVector? = null
