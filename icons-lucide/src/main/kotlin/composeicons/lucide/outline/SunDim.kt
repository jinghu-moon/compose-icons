package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SunDim: ImageVector
    get() {
        if (_sunDim != null) return _sunDim!!
        _sunDim = lucideOutlineIcon(
            name = "SunDim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12c0 2.209-1.791 4-4 4C9.791 16 8 14.209 8 12 8 9.791 9.791 8 12 8c2.209 0 4 1.791 4 4Z")
            addPathData("M12 4h.01")
            addPathData("M20 12h.01")
            addPathData("M12 20h.01")
            addPathData("M4 12h.01")
            addPathData("M17.657 6.343h.01")
            addPathData("M17.657 17.657h.01")
            addPathData("M6.343 17.657h.01")
            addPathData("M6.343 6.343h.01")
        }
        return _sunDim!!
    }

private var _sunDim: ImageVector? = null
