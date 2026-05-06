package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GolfOff: ImageVector
    get() {
        if (_golfOff != null) return _golfOff!!
        _golfOff = tablerOutlineIcon(
            name = "GolfOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18v-6M12 8v-5l7 4L13.93 9.897")
            addPathData("M9 17.67C8.38 18.03 8 18.49 8 19c0 1.1 1.8 2 4 2 2.2 0 4-.9 4-2 0-.5-.38-.97-1-1.33")
            addPathData("M3 3 21 21")
        }
        return _golfOff!!
    }

private var _golfOff: ImageVector? = null
