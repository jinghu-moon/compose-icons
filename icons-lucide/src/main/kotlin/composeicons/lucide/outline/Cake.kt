package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cake: ImageVector
    get() {
        if (_cake != null) return _cake!!
        _cake = lucideOutlineIcon(
            name = "Cake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 21v-8c0-1.105-.895-2-2-2h-12c-1.105 0-2 .895-2 2v8")
            addPathData("M4 16c0 0 .5-1 2-1 1.5 0 2.5 2 4 2 1.5 0 2.5-2 4-2 1.5 0 2.5 2 4 2 1.5 0 2-1 2-1")
            addPathData("M2 21h20")
            addPathData("M7 8v3")
            addPathData("M12 8v3")
            addPathData("M17 8v3")
            addPathData("M7 4h.01")
            addPathData("M12 4h.01")
            addPathData("M17 4h.01")
        }
        return _cake!!
    }

private var _cake: ImageVector? = null
