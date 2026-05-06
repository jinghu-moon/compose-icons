package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Utensils: ImageVector
    get() {
        if (_utensils != null) return _utensils!!
        _utensils = lucideOutlineIcon(
            name = "Utensils",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 2v7c0 1.1 .9 2 2 2h4c1.105 0 2-.895 2-2v-7")
            addPathData("M7 2v20")
            addPathData("M21 15v-13C18.239 2 16 4.239 16 7v6c0 1.1 .9 2 2 2h3ZM21 15v7")
        }
        return _utensils!!
    }

private var _utensils: ImageVector? = null
