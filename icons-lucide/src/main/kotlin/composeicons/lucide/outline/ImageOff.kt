package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ImageOff: ImageVector
    get() {
        if (_imageOff != null) return _imageOff!!
        _imageOff = lucideOutlineIcon(
            name = "ImageOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 2 22 22")
            addPathData("M10.41 10.41c-.781 .781-2.049 .781-2.83 0-.781-.781-.781-2.049 0-2.83")
            addPathData("M13.5 13.5 6 21")
            addPathData("M18 12l3 3")
            addPathData("M3.59 3.59C3.213 3.963 3.001 4.47 3 5v14c0 1.105 .895 2 2 2h14c.55 0 1.052-.22 1.41-.59")
            addPathData("M21 15v-10C21 3.895 20.105 3 19 3h-10")
        }
        return _imageOff!!
    }

private var _imageOff: ImageVector? = null
