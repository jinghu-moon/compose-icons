package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ampersand: ImageVector
    get() {
        if (_ampersand != null) return _ampersand!!
        _ampersand = lucideOutlineIcon(
            name = "Ampersand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12h3")
            addPathData("M17.5 12c0 4.418-3.582 8-8 8C7.015 20 5 17.985 5 15.5c0-6 8-4 8-8.5C13 5.343 11.657 4 10 4 8.343 4 7 5.343 7 7c0 3 2.5 8.5 12 13")
        }
        return _ampersand!!
    }

private var _ampersand: ImageVector? = null
