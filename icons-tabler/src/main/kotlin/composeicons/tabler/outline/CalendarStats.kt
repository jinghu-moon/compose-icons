package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CalendarStats: ImageVector
    get() {
        if (_calendarStats != null) return _calendarStats!!
        _calendarStats = tablerOutlineIcon(
            name = "CalendarStats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.795 21h-6.795C3.895 21 3 20.105 3 19v-12C3 5.895 3.895 5 5 5h12c1.105 0 2 .895 2 2v4")
            addPathData("M18 14v4h4")
            addPathData("M14 18c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4")
            addPathData("M15 3v4")
            addPathData("M7 3v4")
            addPathData("M3 11h16")
        }
        return _calendarStats!!
    }

private var _calendarStats: ImageVector? = null
