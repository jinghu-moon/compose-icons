package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cloudy: ImageVector
    get() {
        if (_cloudy != null) return _cloudy!!
        _cloudy = lucideOutlineIcon(
            name = "Cloudy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.5 12C19.985 12 22 14.015 22 16.5 22 18.985 19.985 21 17.5 21h-8.494C5.401 21.003 2.383 18.267 2.033 14.679 1.683 11.091 4.116 7.824 7.654 7.131c3.538-.693 7.024 1.414 8.054 4.869Z")
            addPathData("M21.832 9C21.408 7.8 20.273 6.998 19 7h-2.207C16.091 4.52 13.761 2.86 11.188 3.007 8.615 3.153 6.489 5.067 6.073 7.61")
        }
        return _cloudy!!
    }

private var _cloudy: ImageVector? = null
