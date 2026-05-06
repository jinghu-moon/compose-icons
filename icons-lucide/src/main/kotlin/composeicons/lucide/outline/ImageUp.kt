package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ImageUp: ImageVector
    get() {
        if (_imageUp != null) return _imageUp!!
        _imageUp = lucideOutlineIcon(
            name = "ImageUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.3 21h-5.3C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v10L17.9 11.9c-.783-.768-2.038-.761-2.814 .014L6 21")
            addPathData("M14 19.5l3-3 3 3")
            addPathData("M17 22v-5.5")
            addPathData("M11 9c0 1.105-.895 2-2 2C7.895 11 7 10.105 7 9 7 7.895 7.895 7 9 7c1.105 0 2 .895 2 2Z")
        }
        return _imageUp!!
    }

private var _imageUp: ImageVector? = null
