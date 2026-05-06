package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CalendarWeek: ImageVector
    get() {
        if (_calendarWeek != null) return _calendarWeek!!
        _calendarWeek = tablerFilledIcon(
            name = "CalendarWeek",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 2c.183 0 .355 .05 .502 .135l.033 .02C16.815 2.332 17 2.645 17 3v1h1c1.589-0 2.902 1.238 2.995 2.824L21 7v12c0 1.589-1.238 2.902-2.824 2.995L18 22h-12C4.411 22 3.098 20.762 3.005 19.176L3 19v-12C3 5.411 4.238 4.098 5.824 4.005L6 4h1v-1c-0-.363 .197-.698 .514-.874l.093-.046 .066-.025 .1-.029 .107-.019L8 2q.083 0 .161 .013l.122 .029 .04 .012 .06 .023c.328 .135 .568 .44 .61 .806L9 3v1h6v-1c0-.552 .448-1 1-1M19 9h-14v9.625c0 .705 .386 1.286 .883 1.366L6 20h12c.513 0 .936-.53 .993-1.215L19 18.625Z")
            addPathData("M9.015 13c0 .552-.448 1-1 1-.368 .017-.716-.169-.905-.484-.19-.316-.191-.71-.003-1.027 .188-.317 .535-.504 .903-.489 .557 0 1.005 .448 1.005 1")
            addPathData("M13.015 13c0 .552-.448 1-1 1-.368 .017-.716-.169-.905-.484-.19-.316-.191-.71-.003-1.027 .188-.317 .535-.504 .903-.489 .557 0 1.005 .448 1.005 1")
            addPathData("M17.02 13c0 .552-.448 1-1 1-.368 .017-.716-.169-.905-.484-.19-.316-.191-.71-.003-1.027 .188-.317 .535-.504 .903-.489 .557 0 1.005 .448 1.005 1")
            addPathData("M12.02 15c.552 0 1 .448 1 1 0 .552-.448 1-1 1-.368 .017-.716-.169-.905-.484-.19-.316-.191-.71-.003-1.027 .188-.317 .535-.504 .903-.489Z")
            addPathData("M9.015 16c0 .552-.448 1-1 1-.368 .017-.716-.169-.905-.484-.19-.316-.191-.71-.003-1.027 .188-.317 .535-.504 .903-.489 .557 0 1.005 .448 1.005 1")
        }
        return _calendarWeek!!
    }

private var _calendarWeek: ImageVector? = null
