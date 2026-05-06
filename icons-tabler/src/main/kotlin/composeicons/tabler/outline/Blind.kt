package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Blind: ImageVector
    get() {
        if (_blind != null) return _blind!!
        _blind = tablerOutlineIcon(
            name = "Blind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 4c0 .552 .448 1 1 1 .552 0 1-.448 1-1C11 3.448 10.552 3 10 3 9.448 3 9 3.448 9 4")
            addPathData("M4 21 7 17")
            addPathData("M13 21 11 17 8 14 9 8")
            addPathData("M3 12 5 9 9 8l6 4")
            addPathData("M16.5 14 20 21")
        }
        return _blind!!
    }

private var _blind: ImageVector? = null
