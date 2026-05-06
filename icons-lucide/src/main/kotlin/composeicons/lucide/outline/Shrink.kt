package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shrink: ImageVector
    get() {
        if (_shrink != null) return _shrink!!
        _shrink = lucideOutlineIcon(
            name = "Shrink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 15l6 6M15 15v4.8M15 15h4.8")
            addPathData("M9 19.8v-4.8M9 15h-4.8M9 15 3 21")
            addPathData("M15 4.2v4.8M15 9h4.8M15 9 21 3")
            addPathData("M9 4.2v4.8M9 9h-4.8M9 9 3 3")
        }
        return _shrink!!
    }

private var _shrink: ImageVector? = null
