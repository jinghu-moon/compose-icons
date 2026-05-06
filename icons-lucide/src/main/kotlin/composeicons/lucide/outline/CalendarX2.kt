package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CalendarX2: ImageVector
    get() {
        if (_calendarX2 != null) return _calendarX2!!
        _calendarX2 = lucideOutlineIcon(
            name = "CalendarX2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 2v4")
            addPathData("M16 2v4")
            addPathData("M21 13v-7C21 4.895 20.105 4 19 4h-14C3.895 4 3 4.895 3 6v14c0 1.105 .895 2 2 2h8")
            addPathData("M3 10h18")
            addPathData("M17 22l5-5")
            addPathData("M17 17l5 5")
        }
        return _calendarX2!!
    }

private var _calendarX2: ImageVector? = null
