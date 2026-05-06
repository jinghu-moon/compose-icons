package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BedDouble: ImageVector
    get() {
        if (_bedDouble != null) return _bedDouble!!
        _bedDouble = lucideOutlineIcon(
            name = "BedDouble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 20v-8c0-1.105 .895-2 2-2h16c1.105 0 2 .895 2 2v8")
            addPathData("M4 10v-4C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v4")
            addPathData("M12 4v6")
            addPathData("M2 18h20")
        }
        return _bedDouble!!
    }

private var _bedDouble: ImageVector? = null
