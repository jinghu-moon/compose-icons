package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CalendarRange: ImageVector
    get() {
        if (_calendarRange != null) return _calendarRange!!
        _calendarRange = lucideOutlineIcon(
            name = "CalendarRange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 4h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 22 3 21.105 3 20v-14C3 4.895 3.895 4 5 4Z")
            addPathData("M16 2v4")
            addPathData("M3 10h18")
            addPathData("M8 2v4")
            addPathData("M17 14h-6")
            addPathData("M13 18h-6")
            addPathData("M7 14h.01")
            addPathData("M17 18h.01")
        }
        return _calendarRange!!
    }

private var _calendarRange: ImageVector? = null
