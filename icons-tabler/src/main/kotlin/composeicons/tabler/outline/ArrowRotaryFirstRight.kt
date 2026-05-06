package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRotaryFirstRight: ImageVector
    get() {
        if (_arrowRotaryFirstRight != null) return _arrowRotaryFirstRight!!
        _arrowRotaryFirstRight = tablerOutlineIcon(
            name = "ArrowRotaryFirstRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 7c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C11 5.343 9.657 4 8 4 6.343 4 5 5.343 5 7")
            addPathData("M8 10v10")
            addPathData("M10.5 9.5 19 18")
            addPathData("M14 18h5v-5")
        }
        return _arrowRotaryFirstRight!!
    }

private var _arrowRotaryFirstRight: ImageVector? = null
