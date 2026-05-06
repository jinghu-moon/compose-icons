package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CalendarCheck2: ImageVector
    get() {
        if (_calendarCheck2 != null) return _calendarCheck2!!
        _calendarCheck2 = lucideOutlineIcon(
            name = "CalendarCheck2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 2v4")
            addPathData("M16 2v4")
            addPathData("M21 14v-8C21 4.895 20.105 4 19 4h-14C3.895 4 3 4.895 3 6v14c0 1.105 .895 2 2 2h8")
            addPathData("M3 10h18")
            addPathData("M16 20l2 2 4-4")
        }
        return _calendarCheck2!!
    }

private var _calendarCheck2: ImageVector? = null
