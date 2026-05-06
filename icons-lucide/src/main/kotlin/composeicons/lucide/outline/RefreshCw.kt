package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RefreshCw: ImageVector
    get() {
        if (_refreshCw != null) return _refreshCw!!
        _refreshCw = lucideOutlineIcon(
            name = "RefreshCw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12C3 7.029 7.029 3 12 3c2.516 .009 4.931 .991 6.74 2.74L21 8")
            addPathData("M21 3v5h-5")
            addPathData("M21 12c0 4.971-4.029 9-9 9C9.484 20.991 7.069 20.009 5.26 18.26L3 16")
            addPathData("M8 16h-5v5")
        }
        return _refreshCw!!
    }

private var _refreshCw: ImageVector? = null
