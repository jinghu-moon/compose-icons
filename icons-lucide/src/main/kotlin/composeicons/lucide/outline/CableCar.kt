package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CableCar: ImageVector
    get() {
        if (_cableCar != null) return _cableCar!!
        _cableCar = lucideOutlineIcon(
            name = "CableCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 3h.01")
            addPathData("M14 2h.01")
            addPathData("M2 9 22 4")
            addPathData("M12 12v-5.5")
            addPathData("M7 12h10c1.657 0 3 1.343 3 3v4c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-4C4 13.343 5.343 12 7 12Z")
            addPathData("M9 12v5")
            addPathData("M15 12v5")
            addPathData("M4 17h16")
        }
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
