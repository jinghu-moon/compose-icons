package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Minimize: ImageVector
    get() {
        if (_minimize != null) return _minimize!!
        _minimize = lucideOutlineIcon(
            name = "Minimize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3v3C8 7.105 7.105 8 6 8h-3")
            addPathData("M21 8h-3C16.895 8 16 7.105 16 6v-3")
            addPathData("M3 16h3c1.105 0 2 .895 2 2v3")
            addPathData("M16 21v-3c0-1.105 .895-2 2-2h3")
        }
        return _minimize!!
    }

private var _minimize: ImageVector? = null
