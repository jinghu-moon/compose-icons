package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRotaryRight: ImageVector
    get() {
        if (_arrowRotaryRight != null) return _arrowRotaryRight!!
        _arrowRotaryRight = tablerOutlineIcon(
            name = "ArrowRotaryRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 7c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C11 5.343 9.657 4 8 4 6.343 4 5 5.343 5 7")
            addPathData("M8 10v10")
            addPathData("M17 11 21 7 17 3")
            addPathData("M11 7h10")
        }
        return _arrowRotaryRight!!
    }

private var _arrowRotaryRight: ImageVector? = null
