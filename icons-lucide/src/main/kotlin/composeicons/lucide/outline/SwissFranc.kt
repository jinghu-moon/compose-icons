package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SwissFranc: ImageVector
    get() {
        if (_swissFranc != null) return _swissFranc!!
        _swissFranc = lucideOutlineIcon(
            name = "SwissFranc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 21v-18h8")
            addPathData("M6 16h9")
            addPathData("M10 9.5h7")
        }
        return _swissFranc!!
    }

private var _swissFranc: ImageVector? = null
