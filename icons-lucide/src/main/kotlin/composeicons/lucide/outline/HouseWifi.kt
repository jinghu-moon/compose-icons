package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HouseWifi: ImageVector
    get() {
        if (_houseWifi != null) return _houseWifi!!
        _houseWifi = lucideOutlineIcon(
            name = "HouseWifi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.5 13.866c1.464-1.167 3.541-1.163 5 .01")
            addPathData("M12 17h.01")
            addPathData("M3 10C3 9.411 3.259 8.852 3.709 8.472L10.709 2.472c.745-.63 1.837-.63 2.582 0l7 6c.45 .38 .709 .939 .709 1.528v9c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19Z")
            addPathData("M7 10.754c2.923-2.34 7.077-2.34 10 0")
        }
        return _houseWifi!!
    }

private var _houseWifi: ImageVector? = null
