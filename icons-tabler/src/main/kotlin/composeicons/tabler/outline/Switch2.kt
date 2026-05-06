package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Switch2: ImageVector
    get() {
        if (_switch2 != null) return _switch2!!
        _switch2 = tablerOutlineIcon(
            name = "Switch2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17h5L9.67 14.614M13.33 9.387 15 7h6")
            addPathData("M18 4l3 3-3 3")
            addPathData("M3 7h5l7 10h6")
            addPathData("M18 20l3-3L18 14")
        }
        return _switch2!!
    }

private var _switch2: ImageVector? = null
