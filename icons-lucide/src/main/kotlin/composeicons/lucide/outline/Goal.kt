package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Goal: ImageVector
    get() {
        if (_goal != null) return _goal!!
        _goal = lucideOutlineIcon(
            name = "Goal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 13v-11l8 4-8 4")
            addPathData("M20.561 10.222c1.482 4.567-.882 9.492-5.371 11.194C10.7 23.117 5.666 20.995 3.749 16.593 1.832 12.191 3.707 7.06 8.011 4.932")
            addPathData("M8.002 9.997c-1.38 1.838-1.33 4.379 .121 6.161 1.452 1.782 3.931 2.345 6.01 1.364 2.079-.981 3.221-3.252 2.769-5.505")
        }
        return _goal!!
    }

private var _goal: ImageVector? = null
