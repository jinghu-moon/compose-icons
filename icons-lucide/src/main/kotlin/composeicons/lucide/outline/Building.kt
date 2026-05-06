package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Building: ImageVector
    get() {
        if (_building != null) return _building!!
        _building = lucideOutlineIcon(
            name = "Building",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10h.01")
            addPathData("M12 14h.01")
            addPathData("M12 6h.01")
            addPathData("M16 10h.01")
            addPathData("M16 14h.01")
            addPathData("M16 6h.01")
            addPathData("M8 10h.01")
            addPathData("M8 14h.01")
            addPathData("M8 6h.01")
            addPathData("M9 22v-3c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v3")
            addPathData("M6 2h12c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2Z")
        }
        return _building!!
    }

private var _building: ImageVector? = null
