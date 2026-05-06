package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CalendarClock: ImageVector
    get() {
        if (_calendarClock != null) return _calendarClock!!
        _calendarClock = lucideOutlineIcon(
            name = "CalendarClock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 14v2.2l1.6 1")
            addPathData("M16 2v4")
            addPathData("M21 7.5v-1.5C21 4.895 20.105 4 19 4h-14C3.895 4 3 4.895 3 6v14c0 1.105 .895 2 2 2h3.5")
            addPathData("M3 10h5")
            addPathData("M8 2v4")
            addPathData("M22 16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z")
        }
        return _calendarClock!!
    }

private var _calendarClock: ImageVector? = null
