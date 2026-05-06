package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudSync: ImageVector
    get() {
        if (_cloudSync != null) return _cloudSync!!
        _cloudSync = lucideOutlineIcon(
            name = "CloudSync",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 18l-1.535 1.605c-1.165 1.119-2.798 1.607-4.386 1.309C9.491 20.617 8.145 19.57 7.465 18.105")
            addPathData("M17 22v-4h-4")
            addPathData("M20.996 15.251c1.043-1.349 1.233-3.172 .491-4.708C20.746 9.007 19.2 8.023 17.495 8h-1.79C14.928 5.403 12.723 3.488 10.043 3.084 7.363 2.68 4.69 3.859 3.182 6.111 1.674 8.363 1.602 11.283 2.996 13.607")
            addPathData("M7 10v4h4")
            addPathData("M7 14 8.535 12.395c1.165-1.119 2.798-1.607 4.386-1.309 1.588 .298 2.934 1.344 3.614 2.809")
        }
        return _cloudSync!!
    }

private var _cloudSync: ImageVector? = null
