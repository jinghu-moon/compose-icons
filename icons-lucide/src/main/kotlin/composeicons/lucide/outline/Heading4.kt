package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Heading4: ImageVector
    get() {
        if (_heading4 != null) return _heading4!!
        _heading4 = lucideOutlineIcon(
            name = "Heading4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18v-12")
            addPathData("M17 10v3c0 .552 .448 1 1 1h3")
            addPathData("M21 10v8")
            addPathData("M4 12h8")
            addPathData("M4 18v-12")
        }
        return _heading4!!
    }

private var _heading4: ImageVector? = null
