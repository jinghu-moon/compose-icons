package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChevronFirst: ImageVector
    get() {
        if (_chevronFirst != null) return _chevronFirst!!
        _chevronFirst = lucideOutlineIcon(
            name = "ChevronFirst",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 18 11 12 17 6")
            addPathData("M7 6v12")
        }
        return _chevronFirst!!
    }

private var _chevronFirst: ImageVector? = null
