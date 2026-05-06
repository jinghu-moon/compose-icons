package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CalendarCode: ImageVector
    get() {
        if (_calendarCode != null) return _calendarCode!!
        _calendarCode = tablerOutlineIcon(
            name = "CalendarCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 21h-5.5C4.895 21 4 20.105 4 19v-12C4 5.895 4.895 5 6 5h12c1.105 0 2 .895 2 2v6")
            addPathData("M16 3v4")
            addPathData("M8 3v4")
            addPathData("M4 11h16")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _calendarCode!!
    }

private var _calendarCode: ImageVector? = null
