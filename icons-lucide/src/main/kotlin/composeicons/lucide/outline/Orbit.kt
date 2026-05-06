package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Orbit: ImageVector
    get() {
        if (_orbit != null) return _orbit!!
        _orbit = lucideOutlineIcon(
            name = "Orbit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.341 6.484c2.205 3.333 2.214 7.659 .023 11.001-2.191 3.342-6.162 5.059-10.098 4.365")
            addPathData("M3.659 17.516C1.454 14.182 1.446 9.855 3.639 6.513 5.832 3.172 9.804 1.456 13.74 2.152")
            addPathData("M15 12c0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12 9 10.343 10.343 9 12 9c1.657 0 3 1.343 3 3Z")
            addPathData("M21 5c0 1.105-.895 2-2 2C17.895 7 17 6.105 17 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M7 19c0 1.105-.895 2-2 2C3.895 21 3 20.105 3 19c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _orbit!!
    }

private var _orbit: ImageVector? = null
