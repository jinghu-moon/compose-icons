package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Heading3: ImageVector
    get() {
        if (_heading3 != null) return _heading3!!
        _heading3 = lucideOutlineIcon(
            name = "Heading3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12h8")
            addPathData("M4 18v-12")
            addPathData("M12 18v-12")
            addPathData("M17.5 10.5c1.7-1 3.5 0 3.5 1.5 0 1.105-.895 2-2 2")
            addPathData("M17 17.5C19 19 21 17.8 21 16c0-1.105-.895-2-2-2")
        }
        return _heading3!!
    }

private var _heading3: ImageVector? = null
