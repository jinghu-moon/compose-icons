package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowDownAZ: ImageVector
    get() {
        if (_arrowDownAZ != null) return _arrowDownAZ!!
        _arrowDownAZ = lucideOutlineIcon(
            name = "ArrowDownAZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16l4 4 4-4")
            addPathData("M7 20v-16")
            addPathData("M20 8h-5")
            addPathData("M15 10v-3.5C15 5.119 16.119 4 17.5 4 18.881 4 20 5.119 20 6.5v3.5")
            addPathData("M15 14h5l-5 6h5")
        }
        return _arrowDownAZ!!
    }

private var _arrowDownAZ: ImageVector? = null
