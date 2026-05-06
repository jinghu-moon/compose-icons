package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pointer: ImageVector
    get() {
        if (_pointer != null) return _pointer!!
        _pointer = lucideOutlineIcon(
            name = "Pointer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 14c0 4.418-3.582 8-8 8")
            addPathData("M18 11v-1C18 8.895 17.105 8 16 8c-1.105 0-2 .895-2 2")
            addPathData("M14 10v-1C14 7.895 13.105 7 12 7c-1.105 0-2 .895-2 2v1")
            addPathData("M10 9.5v-5.5C10 2.895 9.105 2 8 2 6.895 2 6 2.895 6 4v10")
            addPathData("M18 11c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v3c0 4.418-3.582 8-8 8h-2C9.2 22 7.5 21.14 6.01 19.66L2.41 16.06c-.715-.791-.683-2.004 .073-2.757 .755-.753 1.968-.78 2.757-.063L7 15")
        }
        return _pointer!!
    }

private var _pointer: ImageVector? = null
