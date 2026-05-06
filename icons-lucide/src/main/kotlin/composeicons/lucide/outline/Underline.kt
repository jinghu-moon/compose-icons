package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Underline: ImageVector
    get() {
        if (_underline != null) return _underline!!
        _underline = lucideOutlineIcon(
            name = "Underline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 4v6c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-6")
            addPathData("M4 20h16")
        }
        return _underline!!
    }

private var _underline: ImageVector? = null
