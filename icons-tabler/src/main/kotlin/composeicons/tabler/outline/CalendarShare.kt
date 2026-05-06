package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CalendarShare: ImageVector
    get() {
        if (_calendarShare != null) return _calendarShare!!
        _calendarShare = tablerOutlineIcon(
            name = "CalendarShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21h-6C4.895 21 4 20.105 4 19v-12C4 5.895 4.895 5 6 5h12c1.105 0 2 .895 2 2v6")
            addPathData("M16 3v4")
            addPathData("M8 3v4")
            addPathData("M4 11h16")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _calendarShare!!
    }

private var _calendarShare: ImageVector? = null
