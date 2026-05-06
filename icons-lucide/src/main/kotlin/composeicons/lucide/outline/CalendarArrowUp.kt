package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CalendarArrowUp: ImageVector
    get() {
        if (_calendarArrowUp != null) return _calendarArrowUp!!
        _calendarArrowUp = lucideOutlineIcon(
            name = "CalendarArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 18l4-4 4 4")
            addPathData("M16 2v4")
            addPathData("M18 22v-8")
            addPathData("M21 11.343v-5.343C21 4.895 20.105 4 19 4h-14C3.895 4 3 4.895 3 6v14c0 1.105 .895 2 2 2h9")
            addPathData("M3 10h18")
            addPathData("M8 2v4")
        }
        return _calendarArrowUp!!
    }

private var _calendarArrowUp: ImageVector? = null
