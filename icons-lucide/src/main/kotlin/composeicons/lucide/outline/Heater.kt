package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Heater: ImageVector
    get() {
        if (_heater != null) return _heater!!
        _heater = lucideOutlineIcon(
            name = "Heater",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 8C13 5 9 5 11 2")
            addPathData("M15.5 8c2-3-2-3 0-6")
            addPathData("M6 10h.01")
            addPathData("M6 14h.01")
            addPathData("M10 16v-4")
            addPathData("M14 16v-4")
            addPathData("M18 16v-4")
            addPathData("M20 6c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-16C2.895 20 2 19.105 2 18v-10C2 6.895 2.895 6 4 6h3")
            addPathData("M5 20v2")
            addPathData("M19 20v2")
        }
        return _heater!!
    }

private var _heater: ImageVector? = null
