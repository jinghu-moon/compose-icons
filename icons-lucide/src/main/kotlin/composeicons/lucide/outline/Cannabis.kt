package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cannabis: ImageVector
    get() {
        if (_cannabis != null) return _cannabis!!
        _cannabis = lucideOutlineIcon(
            name = "Cannabis",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 22v-4")
            addPathData("M7 12C5.5 12 2.5 13.5 2 15c3.5 1.5 6 1 6 1C6.5 17.5 6 19.5 6 21c2.5 0 4.5-1.5 6-3 1.5 1.5 3.5 3 6 3 0-1.5-.5-3.5-2-5 0 0 2.5 .5 6-1-.5-1.5-3.5-3-5-3 1.5-1 4-4 4-6C18.5 6 15.5 7.5 14 9 14 6.5 13.5 4 12 2 10.5 4 10 6.5 10 9 8.5 7.5 5.5 6 3 6c0 2 2.5 5 4 6")
        }
        return _cannabis!!
    }

private var _cannabis: ImageVector? = null
