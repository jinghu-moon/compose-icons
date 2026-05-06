package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CalendarFold: ImageVector
    get() {
        if (_calendarFold != null) return _calendarFold!!
        _calendarFold = lucideOutlineIcon(
            name = "CalendarFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 20c0 1.105 .895 2 2 2h10c.64 .002 1.254-.253 1.706-.706l3.588-3.588c.453-.452 .708-1.066 .706-1.706v-10C21 4.895 20.105 4 19 4h-14C3.895 4 3 4.895 3 6Z")
            addPathData("M15 22v-5c0-.552 .448-1 1-1h5")
            addPathData("M8 2v4")
            addPathData("M16 2v4")
            addPathData("M3 10h18")
        }
        return _calendarFold!!
    }

private var _calendarFold: ImageVector? = null
