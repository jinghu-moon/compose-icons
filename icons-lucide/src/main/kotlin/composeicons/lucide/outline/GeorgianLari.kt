package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GeorgianLari: ImageVector
    get() {
        if (_georgianLari != null) return _georgianLari!!
        _georgianLari = lucideOutlineIcon(
            name = "GeorgianLari",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 21C7.553 20.999 4.283 17.94 4.018 14.002 3.754 10.064 6.587 6.595 10.498 6.067c3.911-.528 7.562 2.066 8.352 5.933")
            addPathData("M13 12v-9")
            addPathData("M4 21h16")
            addPathData("M9 12v-9")
        }
        return _georgianLari!!
    }

private var _georgianLari: ImageVector? = null
