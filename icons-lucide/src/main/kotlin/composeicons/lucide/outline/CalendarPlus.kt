package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CalendarPlus: ImageVector
    get() {
        if (_calendarPlus != null) return _calendarPlus!!
        _calendarPlus = lucideOutlineIcon(
            name = "CalendarPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 19h6")
            addPathData("M16 2v4")
            addPathData("M19 16v6")
            addPathData("M21 12.598v-6.598C21 4.895 20.105 4 19 4h-14C3.895 4 3 4.895 3 6v14c0 1.105 .895 2 2 2h8.5")
            addPathData("M3 10h18")
            addPathData("M8 2v4")
        }
        return _calendarPlus!!
    }

private var _calendarPlus: ImageVector? = null
