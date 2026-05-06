package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClockArrowUp: ImageVector
    get() {
        if (_clockArrowUp != null) return _clockArrowUp!!
        _clockArrowUp = lucideOutlineIcon(
            name = "ClockArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6v6l1.56 .78")
            addPathData("M13.227 21.925C9.071 22.439 5.035 20.309 3.114 16.588 1.193 12.867 1.794 8.343 4.62 5.253 7.446 2.162 11.898 1.16 15.775 2.741c3.878 1.581 6.359 5.411 6.219 9.596")
            addPathData("M14 18l4-4 4 4")
            addPathData("M18 22v-8")
        }
        return _clockArrowUp!!
    }

private var _clockArrowUp: ImageVector? = null
