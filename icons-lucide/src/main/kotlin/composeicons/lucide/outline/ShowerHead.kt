package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShowerHead: ImageVector
    get() {
        if (_showerHead != null) return _showerHead!!
        _showerHead = lucideOutlineIcon(
            name = "ShowerHead",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4 6.5 6.5")
            addPathData("M13.5 6.5C11.561 4.6 8.454 4.616 6.535 6.535 4.616 8.454 4.6 11.561 6.5 13.5")
            addPathData("M15 5 5 15")
            addPathData("M14 17v.01")
            addPathData("M10 16v.01")
            addPathData("M13 13v.01")
            addPathData("M16 10v.01")
            addPathData("M11 20v.01")
            addPathData("M17 14v.01")
            addPathData("M20 11v.01")
        }
        return _showerHead!!
    }

private var _showerHead: ImageVector? = null
