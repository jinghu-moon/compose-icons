package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CalendarSync: ImageVector
    get() {
        if (_calendarSync != null) return _calendarSync!!
        _calendarSync = lucideOutlineIcon(
            name = "CalendarSync",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 10v4h4")
            addPathData("M11 14l1.535-1.605c1.165-1.119 2.798-1.607 4.386-1.309 1.588 .298 2.934 1.344 3.614 2.809")
            addPathData("M16 2v4")
            addPathData("M21 18l-1.535 1.605c-1.165 1.119-2.798 1.607-4.386 1.309-1.588-.298-2.934-1.344-3.614-2.809")
            addPathData("M21 22v-4h-4")
            addPathData("M21 8.5v-2.5C21 4.895 20.105 4 19 4h-14C3.895 4 3 4.895 3 6v14c0 1.105 .895 2 2 2h4.3")
            addPathData("M3 10h4")
            addPathData("M8 2v4")
        }
        return _calendarSync!!
    }

private var _calendarSync: ImageVector? = null
