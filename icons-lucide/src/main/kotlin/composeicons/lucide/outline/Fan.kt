package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = lucideOutlineIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.827 16.379c-2.141 1.082-4.717 .804-6.578-.708C2.387 14.159 1.588 11.694 2.209 9.377l5.412 1.45C6.539 8.686 6.817 6.11 8.329 4.249 9.841 2.387 12.306 1.588 14.623 2.209L13.173 7.621c2.141-1.082 4.717-.804 6.578 .708 1.861 1.512 2.66 3.977 2.04 6.294L16.379 13.173c1.082 2.141 .804 4.717-.708 6.578-1.512 1.861-3.977 2.66-6.294 2.04l1.45-5.412Z")
            addPathData("M12 12v.01")
        }
        return _fan!!
    }

private var _fan: ImageVector? = null
