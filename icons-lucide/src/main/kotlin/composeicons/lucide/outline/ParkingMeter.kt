package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ParkingMeter: ImageVector
    get() {
        if (_parkingMeter != null) return _parkingMeter!!
        _parkingMeter = lucideOutlineIcon(
            name = "ParkingMeter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 15h2")
            addPathData("M12 12v3")
            addPathData("M12 19v3")
            addPathData("M15.282 19c.429 0 .811-.273 .948-.68l2.37-6.988C19.625 8.431 18.636 5.201 16.163 3.372 13.689 1.542 10.311 1.542 7.837 3.372 5.364 5.201 4.375 8.431 5.4 11.332l2.37 6.988c.137 .407 .519 .68 .948 .68Z")
            addPathData("M9 9C9 7.343 10.343 6 12 6c1.657 0 3 1.343 3 3")
        }
        return _parkingMeter!!
    }

private var _parkingMeter: ImageVector? = null
