package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TicketsPlane: ImageVector
    get() {
        if (_ticketsPlane != null) return _ticketsPlane!!
        _ticketsPlane = lucideOutlineIcon(
            name = "TicketsPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.5 17h1.227c.497-0 .977-.185 1.345-.52L18 12")
            addPathData("M12 13.5l3.794 .506")
            addPathData("M3.173 8.18 14.173 3.18c1.005-.456 2.19-.012 2.647 .993L18.56 8")
            addPathData("M6 10v-2")
            addPathData("M6 14v1")
            addPathData("M6 19v2")
            addPathData("M4 8h16c1.105 0 2 .895 2 2v9c0 1.105-.895 2-2 2h-16C2.895 21 2 20.105 2 19v-9C2 8.895 2.895 8 4 8Z")
        }
        return _ticketsPlane!!
    }

private var _ticketsPlane: ImageVector? = null
