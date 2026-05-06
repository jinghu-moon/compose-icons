package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SortAscending2: ImageVector
    get() {
        if (_sortAscending2 != null) return _sortAscending2!!
        _sortAscending2 = tablerFilledIcon(
            name = "SortAscending2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.852 5.011l.058-.007L17 5l.075 .003 .126 .017 .111 .03 .111 .044 .098 .052 .104 .074 .082 .073 3 3c.26 .251 .364 .623 .273 .973-.092 .35-.365 .623-.714 .714-.35 .092-.721-.013-.973-.273L18 8.415v9.585c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-9.585L14.707 9.707c-.356 .356-.922 .392-1.32 .083l-.094-.083c-.39-.391-.39-1.023 0-1.414l3-3q.053-.054 .112-.097l.11-.071 .114-.054 .105-.035Z")
            addPathData("M9.5 4C10.328 4 11 4.672 11 5.5v4C11 10.328 10.328 11 9.5 11h-4C4.672 11 4 10.328 4 9.5v-4C4 4.672 4.672 4 5.5 4Z")
            addPathData("M9.5 13c.828 0 1.5 .672 1.5 1.5v4C11 19.328 10.328 20 9.5 20h-4C4.672 20 4 19.328 4 18.5v-4C4 13.672 4.672 13 5.5 13Z")
        }
        return _sortAscending2!!
    }

private var _sortAscending2: ImageVector? = null
