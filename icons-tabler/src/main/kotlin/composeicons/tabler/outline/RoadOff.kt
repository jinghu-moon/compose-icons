package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RoadOff: ImageVector
    get() {
        if (_roadOff != null) return _roadOff!!
        _roadOff = tablerOutlineIcon(
            name = "RoadOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19 7.332 7.339")
            addPathData("M16 5l2.806 9.823")
            addPathData("M12 8v-2")
            addPathData("M12 13v-1")
            addPathData("M12 18v-2")
            addPathData("M3 3 21 21")
        }
        return _roadOff!!
    }

private var _roadOff: ImageVector? = null
