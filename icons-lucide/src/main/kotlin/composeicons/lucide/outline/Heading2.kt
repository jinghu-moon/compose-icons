package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Heading2: ImageVector
    get() {
        if (_heading2 != null) return _heading2!!
        _heading2 = lucideOutlineIcon(
            name = "Heading2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12h8")
            addPathData("M4 18v-12")
            addPathData("M12 18v-12")
            addPathData("M21 18h-4c0-4 4-3 4-6C21 10.5 19 9.5 17 11")
        }
        return _heading2!!
    }

private var _heading2: ImageVector? = null
