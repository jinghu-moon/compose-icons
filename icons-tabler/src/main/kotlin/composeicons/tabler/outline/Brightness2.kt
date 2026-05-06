package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Brightness2: ImageVector
    get() {
        if (_brightness2 != null) return _brightness2!!
        _brightness2 = tablerOutlineIcon(
            name = "Brightness2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
            addPathData("M6 6h3.5L12 3.5 14.5 6h3.5v3.5L20.5 12 18 14.5v3.5h-3.5L12 20.5 9.5 18h-3.5v-3.5L3.5 12 6 9.5v-3.5")
        }
        return _brightness2!!
    }

private var _brightness2: ImageVector? = null
