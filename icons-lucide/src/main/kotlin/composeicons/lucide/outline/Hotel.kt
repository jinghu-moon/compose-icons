package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hotel: ImageVector
    get() {
        if (_hotel != null) return _hotel!!
        _hotel = lucideOutlineIcon(
            name = "Hotel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 22v-6.57")
            addPathData("M12 11h.01")
            addPathData("M12 7h.01")
            addPathData("M14 15.43v6.57")
            addPathData("M15 16C13.222 14.667 10.778 14.667 9 16")
            addPathData("M16 11h.01")
            addPathData("M16 7h.01")
            addPathData("M8 11h.01")
            addPathData("M8 7h.01")
            addPathData("M6 2h12c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2Z")
        }
        return _hotel!!
    }

private var _hotel: ImageVector? = null
