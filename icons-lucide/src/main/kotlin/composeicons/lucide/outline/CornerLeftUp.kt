package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CornerLeftUp: ImageVector
    get() {
        if (_cornerLeftUp != null) return _cornerLeftUp!!
        _cornerLeftUp = lucideOutlineIcon(
            name = "CornerLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 9 9 4 4 9")
            addPathData("M20 20h-7C10.791 20 9 18.209 9 16v-12")
        }
        return _cornerLeftUp!!
    }

private var _cornerLeftUp: ImageVector? = null
