package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) return _calendarHeart!!
        _calendarHeart = lucideOutlineIcon(
            name = "CalendarHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.127 22h-7.127C3.895 22 3 21.105 3 20v-14C3 4.895 3.895 4 5 4h14c1.105 0 2 .895 2 2v5.125")
            addPathData("M14.62 18.8c-.573-.597-.772-1.461-.517-2.249 .254-.788 .921-1.372 1.735-1.522 .814-.149 1.645 .16 2.162 .807 .52-.639 1.348-.943 2.158-.792 .81 .151 1.473 .732 1.728 1.516 .255 .784 .061 1.644-.505 2.242l-2.626 2.856c-.19 .218-.464 .344-.753 .344-.289 0-.564-.125-.753-.344Z")
            addPathData("M16 2v4")
            addPathData("M3 10h18")
            addPathData("M8 2v4")
        }
        return _calendarHeart!!
    }

private var _calendarHeart: ImageVector? = null
