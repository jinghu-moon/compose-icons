package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BedSingle: ImageVector
    get() {
        if (_bedSingle != null) return _bedSingle!!
        _bedSingle = lucideOutlineIcon(
            name = "BedSingle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 20v-8c0-1.105 .895-2 2-2h14c1.105 0 2 .895 2 2v8")
            addPathData("M5 10v-4C5 4.895 5.895 4 7 4h10c1.105 0 2 .895 2 2v4")
            addPathData("M3 18h18")
        }
        return _bedSingle!!
    }

private var _bedSingle: ImageVector? = null
