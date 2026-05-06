package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BedFlat: ImageVector
    get() {
        if (_bedFlat != null) return _bedFlat!!
        _bedFlat = tablerFilledIcon(
            name = "BedFlat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 8c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3C3.343 14 2 12.657 2 11l.005-.176C2.098 9.238 3.411 8 5 8")
            addPathData("M18 7c2.209 0 4 1.791 4 4v2c0 .552-.448 1-1 1h-11C9.448 14 9 13.552 9 13v-5C9 7.448 9.448 7 10 7Z")
            addPathData("M21 15c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-18C2.448 17 2 16.552 2 16c0-.552 .448-1 1-1Z")
        }
        return _bedFlat!!
    }

private var _bedFlat: ImageVector? = null
