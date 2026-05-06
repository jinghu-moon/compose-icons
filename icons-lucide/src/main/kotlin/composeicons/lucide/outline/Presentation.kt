package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Presentation: ImageVector
    get() {
        if (_presentation != null) return _presentation!!
        _presentation = lucideOutlineIcon(
            name = "Presentation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 3h20")
            addPathData("M21 3v11c0 1.105-.895 2-2 2h-14C3.895 16 3 15.105 3 14v-11")
            addPathData("M7 21l5-5 5 5")
        }
        return _presentation!!
    }

private var _presentation: ImageVector? = null
