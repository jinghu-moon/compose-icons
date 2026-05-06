package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Transgender: ImageVector
    get() {
        if (_transgender != null) return _transgender!!
        _transgender = lucideOutlineIcon(
            name = "Transgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 16v6")
            addPathData("M14 20h-4")
            addPathData("M18 2h4v4")
            addPathData("M2 2 9.17 9.17")
            addPathData("M2 5.355v-3.355h3.357")
            addPathData("M22 2 14.83 9.17")
            addPathData("M8 5 5 8")
            addPathData("M16 12c0 2.209-1.791 4-4 4C9.791 16 8 14.209 8 12 8 9.791 9.791 8 12 8c2.209 0 4 1.791 4 4Z")
        }
        return _transgender!!
    }

private var _transgender: ImageVector? = null
