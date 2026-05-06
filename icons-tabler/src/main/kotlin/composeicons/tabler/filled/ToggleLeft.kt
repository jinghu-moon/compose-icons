package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = tablerFilledIcon(
            name = "ToggleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3C6.343 15 5 13.657 5 12l.005-.176C5.098 10.238 6.411 9 8 9")
            addPathData("M16 5c3.866 0 7 3.134 7 7 0 3.866-3.134 7-7 7h-8C4.134 19 1 15.866 1 12 1 8.134 4.134 5 8 5ZM16 7h-8C5.239 7 3 9.239 3 12c0 2.761 2.239 5 5 5h8c2.761 0 5-2.239 5-5C21 9.239 18.761 7 16 7")
        }
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
