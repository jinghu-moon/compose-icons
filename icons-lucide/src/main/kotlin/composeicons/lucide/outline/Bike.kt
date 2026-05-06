package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bike: ImageVector
    get() {
        if (_bike != null) return _bike!!
        _bike = lucideOutlineIcon(
            name = "Bike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 17.5C22 19.433 20.433 21 18.5 21 16.567 21 15 19.433 15 17.5 15 15.567 16.567 14 18.5 14 20.433 14 22 15.567 22 17.5Z")
            addPathData("M9 17.5C9 19.433 7.433 21 5.5 21 3.567 21 2 19.433 2 17.5 2 15.567 3.567 14 5.5 14 7.433 14 9 15.567 9 17.5Z")
            addPathData("M16 5c0 .552-.448 1-1 1C14.448 6 14 5.552 14 5c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M12 17.5v-3.5L9 11 13 8l2 3h2")
        }
        return _bike!!
    }

private var _bike: ImageVector? = null
