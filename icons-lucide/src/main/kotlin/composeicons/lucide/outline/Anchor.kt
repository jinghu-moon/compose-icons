package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = lucideOutlineIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6v16")
            addPathData("M19 13l2-1c0 4.971-4.029 9-9 9C7.029 21 3 16.971 3 12l2 1")
            addPathData("M9 11h6")
            addPathData("M14 4c0 1.105-.895 2-2 2C10.895 6 10 5.105 10 4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _anchor!!
    }

private var _anchor: ImageVector? = null
