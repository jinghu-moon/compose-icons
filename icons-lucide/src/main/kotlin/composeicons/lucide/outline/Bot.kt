package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bot: ImageVector
    get() {
        if (_bot != null) return _bot!!
        _bot = lucideOutlineIcon(
            name = "Bot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8v-4h-4")
            addPathData("M6 8h12c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-8C4 8.895 4.895 8 6 8Z")
            addPathData("M2 14h2")
            addPathData("M20 14h2")
            addPathData("M15 13v2")
            addPathData("M9 13v2")
        }
        return _bot!!
    }

private var _bot: ImageVector? = null
