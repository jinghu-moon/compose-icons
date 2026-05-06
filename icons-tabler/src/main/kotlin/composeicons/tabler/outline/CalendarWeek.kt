package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CalendarWeek: ImageVector
    get() {
        if (_calendarWeek != null) return _calendarWeek!!
        _calendarWeek = tablerOutlineIcon(
            name = "CalendarWeek",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7C4 5.895 4.895 5 6 5h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 21 4 20.105 4 19v-12")
            addPathData("M16 3v4")
            addPathData("M8 3v4")
            addPathData("M4 11h16")
            addPathData("M7 14h.013")
            addPathData("M10.01 14h.005")
            addPathData("M13.01 14h.005")
            addPathData("M16.015 14h.005")
            addPathData("M13.015 17h.005")
            addPathData("M7.01 17h.005")
            addPathData("M10.01 17h.005")
        }
        return _calendarWeek!!
    }

private var _calendarWeek: ImageVector? = null
