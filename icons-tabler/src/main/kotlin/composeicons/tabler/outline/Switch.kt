package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Switch: ImageVector
    get() {
        if (_switch != null) return _switch!!
        _switch = tablerOutlineIcon(
            name = "Switch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 4h4v4")
            addPathData("M14.75 9.25 19 4")
            addPathData("M5 19 9 15")
            addPathData("M15 19h4v-4")
            addPathData("M5 5 19 19")
        }
        return _switch!!
    }

private var _switch: ImageVector? = null
