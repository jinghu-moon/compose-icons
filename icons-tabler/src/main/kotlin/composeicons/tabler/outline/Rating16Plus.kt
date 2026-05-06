package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rating16Plus: ImageVector
    get() {
        if (_rating16Plus != null) return _rating16Plus!!
        _rating16Plus = tablerOutlineIcon(
            name = "Rating16Plus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M10 13.5c0 .828 .672 1.5 1.5 1.5C12.328 15 13 14.328 13 13.5 13 12.672 12.328 12 11.5 12 10.672 12 10 12.672 10 13.5")
            addPathData("M7 15v-6")
            addPathData("M15.5 12h3")
            addPathData("M17 10.5v3")
            addPathData("M10 13.5v-3C10 9.672 10.672 9 11.5 9h1")
        }
        return _rating16Plus!!
    }

private var _rating16Plus: ImageVector? = null
