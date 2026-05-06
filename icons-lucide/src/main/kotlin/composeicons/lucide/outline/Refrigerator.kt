package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Refrigerator: ImageVector
    get() {
        if (_refrigerator != null) return _refrigerator!!
        _refrigerator = lucideOutlineIcon(
            name = "Refrigerator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 6C5 3.791 6.791 2 9 2h6c2.209 0 4 1.791 4 4v14c0 1.105-.895 2-2 2h-10C5.895 22 5 21.105 5 20v-14Z")
            addPathData("M5 10h14")
            addPathData("M15 7v6")
        }
        return _refrigerator!!
    }

private var _refrigerator: ImageVector? = null
