package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ligature: ImageVector
    get() {
        if (_ligature != null) return _ligature!!
        _ligature = lucideOutlineIcon(
            name = "Ligature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 12h2v8")
            addPathData("M14 20h4")
            addPathData("M6 12h4")
            addPathData("M6 20h4")
            addPathData("M8 20v-12C8 6.19 9.216 4.605 10.965 4.136c1.749-.469 3.594 .296 4.499 1.864")
        }
        return _ligature!!
    }

private var _ligature: ImageVector? = null
