package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EqualNot: ImageVector
    get() {
        if (_equalNot != null) return _equalNot!!
        _equalNot = lucideOutlineIcon(
            name = "EqualNot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 9h14")
            addPathData("M5 15h14")
            addPathData("M19 5 5 19")
        }
        return _equalNot!!
    }

private var _equalNot: ImageVector? = null
