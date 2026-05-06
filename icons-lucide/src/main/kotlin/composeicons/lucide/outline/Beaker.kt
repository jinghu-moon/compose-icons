package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Beaker: ImageVector
    get() {
        if (_beaker != null) return _beaker!!
        _beaker = lucideOutlineIcon(
            name = "Beaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.5 3h15")
            addPathData("M6 3v16c0 1.105 .895 2 2 2h8c1.105 0 2-.895 2-2v-16")
            addPathData("M6 14h12")
        }
        return _beaker!!
    }

private var _beaker: ImageVector? = null
