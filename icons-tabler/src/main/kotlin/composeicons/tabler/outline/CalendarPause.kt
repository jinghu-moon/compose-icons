package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CalendarPause: ImageVector
    get() {
        if (_calendarPause != null) return _calendarPause!!
        _calendarPause = tablerOutlineIcon(
            name = "CalendarPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 21h-7C4.895 21 4 20.105 4 19v-12C4 5.895 4.895 5 6 5h12c1.105 0 2 .895 2 2v6")
            addPathData("M16 3v4")
            addPathData("M8 3v4")
            addPathData("M4 11h16")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _calendarPause!!
    }

private var _calendarPause: ImageVector? = null
