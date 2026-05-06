package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CalendarOff: ImageVector
    get() {
        if (_calendarOff != null) return _calendarOff!!
        _calendarOff = lucideOutlineIcon(
            name = "CalendarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.2 4.2C3.482 4.513 3.013 5.217 3 6v14c0 1.105 .895 2 2 2h14c.786-.002 1.498-.463 1.82-1.18")
            addPathData("M21 15.5v-9.5C21 4.895 20.105 4 19 4h-9.5")
            addPathData("M16 2v4")
            addPathData("M3 10h7")
            addPathData("M21 10h-5.5")
            addPathData("M2 2 22 22")
        }
        return _calendarOff!!
    }

private var _calendarOff: ImageVector? = null
