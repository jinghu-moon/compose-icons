package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Beef: ImageVector
    get() {
        if (_beef != null) return _beef!!
        _beef = lucideOutlineIcon(
            name = "Beef",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.4 13.7c2.252-1.692 3.157-4.642 2.243-7.306C17.729 3.73 15.203 1.958 12.387 2.005 9.57 2.052 7.105 3.907 6.28 6.6 5.18 9.73 5.5 10.5 3.1 12.68c-.98 .803-1.349 2.136-.923 3.329C2.603 17.202 3.733 17.999 5 18c4 0 8.4-1.8 11.4-4.3")
            addPathData("M18.5 6l2.19 4.5c.86 2.643-.062 5.539-2.29 7.2C15.4 20.2 11 22 7 22 5.865 21.998 4.827 21.356 4.32 20.34L2.4 16.5")
            addPathData("M15 8.5C15 9.881 13.881 11 12.5 11 11.119 11 10 9.881 10 8.5 10 7.119 11.119 6 12.5 6 13.881 6 15 7.119 15 8.5Z")
        }
        return _beef!!
    }

private var _beef: ImageVector? = null
