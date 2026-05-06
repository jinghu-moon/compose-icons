package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Plug2: ImageVector
    get() {
        if (_plug2 != null) return _plug2!!
        _plug2 = lucideOutlineIcon(
            name = "Plug2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 2v6")
            addPathData("M15 2v6")
            addPathData("M12 17v5")
            addPathData("M5 8h14")
            addPathData("M6 11v-3h12v3c0 3.314-2.686 6-6 6C8.686 17 6 14.314 6 11Z")
        }
        return _plug2!!
    }

private var _plug2: ImageVector? = null
