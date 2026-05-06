package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRotaryLeft: ImageVector
    get() {
        if (_arrowRotaryLeft != null) return _arrowRotaryLeft!!
        _arrowRotaryLeft = tablerOutlineIcon(
            name = "ArrowRotaryLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 10C14.343 10 13 8.657 13 7 13 5.343 14.343 4 16 4c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3")
            addPathData("M16 10v10")
            addPathData("M13 7h-10")
            addPathData("M7 11 3 7 7 3")
        }
        return _arrowRotaryLeft!!
    }

private var _arrowRotaryLeft: ImageVector? = null
