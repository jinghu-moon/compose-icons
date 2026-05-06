package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = lucideOutlineIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 17C22 11.477 17.523 7 12 7 6.477 7 2 11.477 2 17")
            addPathData("M6 17c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6")
            addPathData("M10 17c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2")
        }
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
