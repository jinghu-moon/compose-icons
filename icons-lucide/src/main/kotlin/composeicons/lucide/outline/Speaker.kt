package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Speaker: ImageVector
    get() {
        if (_speaker != null) return _speaker!!
        _speaker = lucideOutlineIcon(
            name = "Speaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 2h12c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2Z")
            addPathData("M12 6h.01")
            addPathData("M16 14c0 2.209-1.791 4-4 4C9.791 18 8 16.209 8 14c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z")
            addPathData("M12 14h.01")
        }
        return _speaker!!
    }

private var _speaker: ImageVector? = null
