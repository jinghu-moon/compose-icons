package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TentTree: ImageVector
    get() {
        if (_tentTree != null) return _tentTree!!
        _tentTree = lucideOutlineIcon(
            name = "TentTree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 4C6 5.105 5.105 6 4 6 2.895 6 2 5.105 2 4 2 2.895 2.895 2 4 2c1.105 0 2 .895 2 2Z")
            addPathData("M14 5 17 2l3 3")
            addPathData("M14 10 17 7l3 3")
            addPathData("M17 14v-12")
            addPathData("M17 14h-10L2 22h20Z")
            addPathData("M8 14v8")
            addPathData("M9 14l5 8")
        }
        return _tentTree!!
    }

private var _tentTree: ImageVector? = null
