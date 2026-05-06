package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PhilippinePeso: ImageVector
    get() {
        if (_philippinePeso != null) return _philippinePeso!!
        _philippinePeso = lucideOutlineIcon(
            name = "PhilippinePeso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 11h-16")
            addPathData("M20 7h-16")
            addPathData("M7 21v-17C7 3.448 7.448 3 8 3h4c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-5")
        }
        return _philippinePeso!!
    }

private var _philippinePeso: ImageVector? = null
