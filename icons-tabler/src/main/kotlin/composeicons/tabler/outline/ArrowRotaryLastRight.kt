package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRotaryLastRight: ImageVector
    get() {
        if (_arrowRotaryLastRight != null) return _arrowRotaryLastRight!!
        _arrowRotaryLastRight = tablerOutlineIcon(
            name = "ArrowRotaryLastRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C12 10.343 10.657 9 9 9 7.343 9 6 10.343 6 12")
            addPathData("M9 15v6")
            addPathData("M11.5 9.5 18 3")
            addPathData("M13 3h5v5")
        }
        return _arrowRotaryLastRight!!
    }

private var _arrowRotaryLastRight: ImageVector? = null
