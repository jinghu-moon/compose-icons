package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CalendarClock: ImageVector
    get() {
        if (_calendarClock != null) return _calendarClock!!
        _calendarClock = tablerOutlineIcon(
            name = "CalendarClock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.5 21h-4.5C4.895 21 4 20.105 4 19v-12C4 5.895 4.895 5 6 5h12c1.105 0 2 .895 2 2v3")
            addPathData("M16 3v4")
            addPathData("M8 3v4")
            addPathData("M4 11h10")
            addPathData("M14 18c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4")
            addPathData("M18 16.5v1.5l.5 .5")
        }
        return _calendarClock!!
    }

private var _calendarClock: ImageVector? = null
