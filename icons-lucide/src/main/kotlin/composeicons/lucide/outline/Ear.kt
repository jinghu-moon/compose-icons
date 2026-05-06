package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = lucideOutlineIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 8.5C6 4.91 8.91 2 12.5 2 16.09 2 19 4.91 19 8.5c0 6-6 6-6 10C13 20.433 11.433 22 9.5 22 7.567 22 6 20.433 6 18.5")
            addPathData("M15 8.5C15 7.119 13.881 6 12.5 6 11.119 6 10 7.119 10 8.5v1c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2")
        }
        return _ear!!
    }

private var _ear: ImageVector? = null
