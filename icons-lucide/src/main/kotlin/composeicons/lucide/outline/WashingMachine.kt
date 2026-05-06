package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) return _washingMachine!!
        _washingMachine = lucideOutlineIcon(
            name = "WashingMachine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6h3")
            addPathData("M17 6h.01")
            addPathData("M5 2h14c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-14C3.895 22 3 21.105 3 20v-16C3 2.895 3.895 2 5 2Z")
            addPathData("M17 13c0 2.761-2.239 5-5 5C9.239 18 7 15.761 7 13 7 10.239 9.239 8 12 8c2.761 0 5 2.239 5 5Z")
            addPathData("M12 18c1.381 0 2.5-1.119 2.5-2.5C14.5 14.119 13.381 13 12 13 10.619 13 9.5 11.881 9.5 10.5 9.5 9.119 10.619 8 12 8")
        }
        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null
