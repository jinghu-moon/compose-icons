package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CalendarMonth: ImageVector
    get() {
        if (_calendarMonth != null) return _calendarMonth!!
        _calendarMonth = tablerOutlineIcon(
            name = "CalendarMonth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7C4 5.895 4.895 5 6 5h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 21 4 20.105 4 19v-12")
            addPathData("M16 3v4")
            addPathData("M8 3v4")
            addPathData("M4 11h16")
            addPathData("M8 14v4")
            addPathData("M12 14v4")
            addPathData("M16 14v4")
        }
        return _calendarMonth!!
    }

private var _calendarMonth: ImageVector? = null
