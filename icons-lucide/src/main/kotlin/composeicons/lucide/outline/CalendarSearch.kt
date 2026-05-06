package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CalendarSearch: ImageVector
    get() {
        if (_calendarSearch != null) return _calendarSearch!!
        _calendarSearch = lucideOutlineIcon(
            name = "CalendarSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 2v4")
            addPathData("M21 11.75v-5.75C21 4.895 20.105 4 19 4h-14C3.895 4 3 4.895 3 6v14c0 1.105 .895 2 2 2h7.25")
            addPathData("M22 22 20.125 20.125")
            addPathData("M3 10h18")
            addPathData("M8 2v4")
            addPathData("M21 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _calendarSearch!!
    }

private var _calendarSearch: ImageVector? = null
