package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CalendarMonth: ImageVector
    get() {
        if (_calendarMonth != null) return _calendarMonth!!
        _calendarMonth = tablerFilledIcon(
            name = "CalendarMonth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 12c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1C7.448 18 7 17.552 7 17v-4c0-.552 .448-1 1-1")
            addPathData("M12 12c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-4c0-.552 .448-1 1-1")
            addPathData("M16 12c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-4c0-.552 .448-1 1-1")
            addPathData("M16 2c.507 0 .934 .38 .993 .883L17 3v1h1c1.589-0 2.902 1.238 2.995 2.824L21 7v12c0 1.589-1.238 2.902-2.824 2.995L18 22h-12C4.411 22 3.098 20.762 3.005 19.176L3 19v-12C3 5.411 4.238 4.098 5.824 4.005L6 4h1v-1c.001-.529 .413-.966 .941-.997 .528-.031 .989 .355 1.052 .88L9 3v1h6v-1c0-.552 .448-1 1-1M19 9h-14v9.625c0 .705 .386 1.286 .883 1.366L6 20h12c.513 0 .936-.53 .993-1.215L19 18.625Z")
        }
        return _calendarMonth!!
    }

private var _calendarMonth: ImageVector? = null
