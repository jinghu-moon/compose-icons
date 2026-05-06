package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Reply: ImageVector
    get() {
        if (_reply != null) return _reply!!
        _reply = lucideOutlineIcon(
            name = "Reply",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 18v-2c0-2.209-1.791-4-4-4h-12")
            addPathData("M9 17 4 12 9 7")
        }
        return _reply!!
    }

private var _reply: ImageVector? = null
