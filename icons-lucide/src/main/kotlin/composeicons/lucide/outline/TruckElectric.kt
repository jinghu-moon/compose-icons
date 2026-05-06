package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TruckElectric: ImageVector
    get() {
        if (_truckElectric != null) return _truckElectric!!
        _truckElectric = lucideOutlineIcon(
            name = "TruckElectric",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 19v-12C14 5.895 13.105 5 12 5h-3")
            addPathData("M15 19h-6")
            addPathData("M19 19h2c.552 0 1-.448 1-1v-3.65c-.001-.226-.079-.444-.22-.62L18.3 9.38C18.111 9.141 17.824 9.001 17.52 9h-3.52")
            addPathData("M2 13v5c0 .552 .448 1 1 1h2")
            addPathData("M4 3 2.15 5.15c-.153 .14-.202 .36-.124 .552 .078 .192 .267 .315 .474 .308h2.15c.225-.053 .455 .066 .542 .28 .087 .214 .006 .46-.192 .58L3 9.02")
            addPathData("M19 19c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M9 19c0 1.105-.895 2-2 2C5.895 21 5 20.105 5 19c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _truckElectric!!
    }

private var _truckElectric: ImageVector? = null
