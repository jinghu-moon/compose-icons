package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CalendarOff: ImageVector
    get() {
        if (_calendarOff != null) return _calendarOff!!
        _calendarOff = tablerOutlineIcon(
            name = "CalendarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5h9c1.105 0 2 .895 2 2v9M19.816 19.839C19.489 20.547 18.78 21 18 21h-12C4.895 21 4 20.105 4 19v-12C4 6.221 4.452 5.513 5.158 5.185")
            addPathData("M16 3v4")
            addPathData("M8 3v1")
            addPathData("M4 11h7M15 11h5")
            addPathData("M3 3 21 21")
        }
        return _calendarOff!!
    }

private var _calendarOff: ImageVector? = null
