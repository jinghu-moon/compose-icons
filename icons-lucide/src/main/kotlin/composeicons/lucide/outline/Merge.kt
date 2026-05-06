package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Merge: ImageVector
    get() {
        if (_merge != null) return _merge!!
        _merge = lucideOutlineIcon(
            name = "Merge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 6 12 2l4 4")
            addPathData("M12 2v10.3c.012 1.076-.411 2.111-1.172 2.872L4 22")
            addPathData("M20 22 15 17")
        }
        return _merge!!
    }

private var _merge: ImageVector? = null
