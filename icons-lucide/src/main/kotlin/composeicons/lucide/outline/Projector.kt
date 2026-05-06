package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Projector: ImageVector
    get() {
        if (_projector != null) return _projector!!
        _projector = lucideOutlineIcon(
            name = "Projector",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 7 3 5")
            addPathData("M9 6v-3")
            addPathData("M13 7 15 5")
            addPathData("M12 13c0 1.657-1.343 3-3 3C7.343 16 6 14.657 6 13 6 11.343 7.343 10 9 10c1.657 0 3 1.343 3 3Z")
            addPathData("M11.83 12h8.17c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-16C2.895 20 2 19.105 2 18v-4c0-1.105 .895-2 2-2h2.17")
            addPathData("M16 16h2")
        }
        return _projector!!
    }

private var _projector: ImageVector? = null
