package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PillBottle: ImageVector
    get() {
        if (_pillBottle != null) return _pillBottle!!
        _pillBottle = lucideOutlineIcon(
            name = "PillBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 11h-4c-.552 0-1 .448-1 1v5c0 .552 .448 1 1 1h4")
            addPathData("M6 7v13c0 1.105 .895 2 2 2h8c1.105 0 2-.895 2-2v-13")
            addPathData("M5 2h14c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-14C4.448 7 4 6.552 4 6v-3C4 2.448 4.448 2 5 2Z")
        }
        return _pillBottle!!
    }

private var _pillBottle: ImageVector? = null
