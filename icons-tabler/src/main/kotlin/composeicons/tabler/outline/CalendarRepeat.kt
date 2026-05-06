package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CalendarRepeat: ImageVector
    get() {
        if (_calendarRepeat != null) return _calendarRepeat!!
        _calendarRepeat = tablerOutlineIcon(
            name = "CalendarRepeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 21h-6.5C4.895 21 4 20.105 4 19v-12C4 5.895 4.895 5 6 5h12c1.105 0 2 .895 2 2v3")
            addPathData("M16 3v4")
            addPathData("M8 3v4")
            addPathData("M4 11h12")
            addPathData("M20 14l2 2h-3")
            addPathData("M20 18l2-2")
            addPathData("M19 16c-1.337-0-2.513 .885-2.883 2.17-.37 1.285 .155 2.66 1.288 3.371 1.132 .711 2.599 .587 3.595-.305")
        }
        return _calendarRepeat!!
    }

private var _calendarRepeat: ImageVector? = null
