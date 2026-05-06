package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rings: ImageVector
    get() {
        if (_rings != null) return _rings!!
        _rings = tablerOutlineIcon(
            name = "Rings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C10 15.343 8.657 14 7 14 5.343 14 4 15.343 4 17")
            addPathData("M14 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M7 15v-11")
            addPathData("M17 15v-11")
            addPathData("M3 4h18")
        }
        return _rings!!
    }

private var _rings: ImageVector? = null
