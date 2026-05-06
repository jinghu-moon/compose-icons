package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CalendarCog: ImageVector
    get() {
        if (_calendarCog != null) return _calendarCog!!
        _calendarCog = lucideOutlineIcon(
            name = "CalendarCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.228 16.852l-.923-.383")
            addPathData("M15.228 19.148l-.923 .383")
            addPathData("M16 2v4")
            addPathData("M16.47 14.305l.382 .923")
            addPathData("M16.852 20.772l-.383 .924")
            addPathData("M19.148 15.228l.383-.923")
            addPathData("M19.53 21.696l-.382-.924")
            addPathData("M20.772 16.852l.924-.383")
            addPathData("M20.772 19.148l.924 .383")
            addPathData("M21 10.592v-4.592C21 4.895 20.105 4 19 4h-14C3.895 4 3 4.895 3 6v14c0 1.105 .895 2 2 2h6")
            addPathData("M3 10h18")
            addPathData("M8 2v4")
            addPathData("M21 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _calendarCog!!
    }

private var _calendarCog: ImageVector? = null
