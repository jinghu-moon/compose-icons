package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Split: ImageVector
    get() {
        if (_split != null) return _split!!
        _split = lucideOutlineIcon(
            name = "Split",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 3h5v5")
            addPathData("M8 3h-5v5")
            addPathData("M12 22v-8.3c.012-1.076-.411-2.111-1.172-2.872L3 3")
            addPathData("M15 9 21 3")
        }
        return _split!!
    }

private var _split: ImageVector? = null
