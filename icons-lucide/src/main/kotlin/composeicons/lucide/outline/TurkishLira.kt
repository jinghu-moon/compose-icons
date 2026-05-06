package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TurkishLira: ImageVector
    get() {
        if (_turkishLira != null) return _turkishLira!!
        _turkishLira = lucideOutlineIcon(
            name = "TurkishLira",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 4 5 9")
            addPathData("M15 8.5l-10 5")
            addPathData("M18 12c0 4.971-4.029 9-9 9v-18")
        }
        return _turkishLira!!
    }

private var _turkishLira: ImageVector? = null
