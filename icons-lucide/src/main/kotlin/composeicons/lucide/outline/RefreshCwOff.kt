package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RefreshCwOff: ImageVector
    get() {
        if (_refreshCwOff != null) return _refreshCwOff!!
        _refreshCwOff = lucideOutlineIcon(
            name = "RefreshCwOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 8 18.74 5.74C16.931 3.991 14.516 3.009 12 3c-1 0-1.97 .16-2.87 .47")
            addPathData("M8 16h-5v5")
            addPathData("M3 12C3 9.51 4 7.26 5.64 5.64")
            addPathData("M3 16l2.26 2.26C7.069 20.009 9.484 20.991 12 21c2.49 0 4.74-1 6.36-2.64")
            addPathData("M21 12c0 1-.16 1.97-.47 2.87")
            addPathData("M21 3v5h-5")
            addPathData("M22 22 2 2")
        }
        return _refreshCwOff!!
    }

private var _refreshCwOff: ImageVector? = null
