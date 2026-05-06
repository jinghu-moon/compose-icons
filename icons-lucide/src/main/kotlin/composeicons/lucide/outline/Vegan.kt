package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Vegan: ImageVector
    get() {
        if (_vegan != null) return _vegan!!
        _vegan = lucideOutlineIcon(
            name = "Vegan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 8q6 0 6-6Q16 2 16 8")
            addPathData("M17.41 3.59C13.112 .825 7.422 1.746 4.215 5.724 1.008 9.702 1.316 15.458 4.929 19.071c3.613 3.613 9.369 3.921 13.347 .714 3.978-3.207 4.898-8.898 2.134-13.195")
            addPathData("M2 2c6.11 4.874 9.767 12.188 10 20 .9-6.82 1.5-9.5 4-14")
        }
        return _vegan!!
    }

private var _vegan: ImageVector? = null
