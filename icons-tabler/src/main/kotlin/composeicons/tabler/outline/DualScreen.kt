package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DualScreen: ImageVector
    get() {
        if (_dualScreen != null) return _dualScreen!!
        _dualScreen = tablerOutlineIcon(
            name = "DualScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 4l8 3v15L5 19v-15")
            addPathData("M13 19h6v-15h-14")
        }
        return _dualScreen!!
    }

private var _dualScreen: ImageVector? = null
