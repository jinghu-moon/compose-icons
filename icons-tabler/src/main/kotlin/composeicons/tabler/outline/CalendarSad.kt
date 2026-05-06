package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CalendarSad: ImageVector
    get() {
        if (_calendarSad != null) return _calendarSad!!
        _calendarSad = tablerOutlineIcon(
            name = "CalendarSad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7C4 5.895 4.895 5 6 5h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 21 4 20.105 4 19v-12M16 3v4M8 3v4M4 11h16M10.005 14h.01M14.005 14h.01")
            addPathData("M10 18c1.202-.837 2.798-.837 4 0")
        }
        return _calendarSad!!
    }

private var _calendarSad: ImageVector? = null
