package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Barrel: ImageVector
    get() {
        if (_barrel != null) return _barrel!!
        _barrel = tablerOutlineIcon(
            name = "Barrel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.278 4h9.444c.803 0 1.528 .481 1.841 1.22C19.521 7.48 20 9.74 20 12c0 2.26-.479 4.52-1.437 6.78-.313 .739-1.038 1.22-1.841 1.22h-9.444C6.475 20 5.75 19.519 5.437 18.78 4.479 16.52 4 14.26 4 12 4 9.74 4.479 7.48 5.437 5.22 5.75 4.481 6.475 4 7.278 4")
            addPathData("M14 4c.667 2.667 1 5.333 1 8 0 2.667-.333 5.333-1 8")
            addPathData("M10 4C9.333 6.667 9 9.333 9 12c0 2.667 .333 5.333 1 8")
            addPathData("M4.5 16h15")
            addPathData("M19.5 8h-15")
        }
        return _barrel!!
    }

private var _barrel: ImageVector? = null
