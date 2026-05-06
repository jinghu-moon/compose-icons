package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PocketKnife: ImageVector
    get() {
        if (_pocketKnife != null) return _pocketKnife!!
        _pocketKnife = lucideOutlineIcon(
            name = "PocketKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 2v1C3 4 5 4 5 5 5 6 3 6 3 7 3 8 5 8 5 9c0 1-2 1-2 2 0 1 2 1 2 2")
            addPathData("M18 6h.01")
            addPathData("M6 18h.01")
            addPathData("M20.83 8.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0l-12 12c-1.563 1.563-1.563 4.097-0 5.66 1.563 1.563 4.097 1.563 5.66 0Z")
            addPathData("M18 11.66v10.34c2.209 0 4-1.791 4-4v-12")
        }
        return _pocketKnife!!
    }

private var _pocketKnife: ImageVector? = null
