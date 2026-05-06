package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RefreshCcw: ImageVector
    get() {
        if (_refreshCcw != null) return _refreshCcw!!
        _refreshCcw = lucideOutlineIcon(
            name = "RefreshCcw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12C21 7.029 16.971 3 12 3 9.484 3.009 7.069 3.991 5.26 5.74L3 8")
            addPathData("M3 3v5h5")
            addPathData("M3 12c0 4.971 4.029 9 9 9 2.516-.009 4.931-.991 6.74-2.74L21 16")
            addPathData("M16 16h5v5")
        }
        return _refreshCcw!!
    }

private var _refreshCcw: ImageVector? = null
