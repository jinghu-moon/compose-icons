package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LampFloor: ImageVector
    get() {
        if (_lampFloor != null) return _lampFloor!!
        _lampFloor = lucideOutlineIcon(
            name = "LampFloor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10v12")
            addPathData("M17.929 7.629c.123 .308 .085 .657-.101 .932C17.642 8.836 17.332 9 17 9h-10C6.668 9 6.358 8.835 6.173 8.561 5.987 8.286 5.949 7.937 6.072 7.629L8.072 2.629C8.224 2.249 8.591 2 9 2h6c.409 0 .776 .249 .928 .629Z")
            addPathData("M9 22h6")
        }
        return _lampFloor!!
    }

private var _lampFloor: ImageVector? = null
