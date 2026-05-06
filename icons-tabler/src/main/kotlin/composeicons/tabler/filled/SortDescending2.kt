package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SortDescending2: ImageVector
    get() {
        if (_sortDescending2 != null) return _sortDescending2!!
        _sortDescending2 = tablerFilledIcon(
            name = "SortDescending2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.5 4C10.328 4 11 4.672 11 5.5v4C11 10.328 10.328 11 9.5 11h-4C4.672 11 4 10.328 4 9.5v-4C4 4.672 4.672 4 5.5 4Z")
            addPathData("M9.5 13c.828 0 1.5 .672 1.5 1.5v4C11 19.328 10.328 20 9.5 20h-4C4.672 20 4 19.328 4 18.5v-4C4 13.672 4.672 13 5.5 13Z")
            addPathData("M17 5c.552 0 1 .448 1 1v9.584l1.293-1.291c.356-.356 .922-.392 1.32-.083l.094 .083c.39 .391 .39 1.023 0 1.414l-3 3c-.035 .035-.072 .067-.112 .097l-.11 .071-.114 .054-.105 .035-.149 .03L17 19l-.075-.003-.126-.017-.111-.03-.111-.044-.098-.052-.096-.067-.09-.08L13.293 15.707c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012L16 15.586v-9.586c0-.552 .448-1 1-1")
        }
        return _sortDescending2!!
    }

private var _sortDescending2: ImageVector? = null
