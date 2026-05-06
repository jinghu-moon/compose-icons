package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rating21Plus: ImageVector
    get() {
        if (_rating21Plus != null) return _rating21Plus!!
        _rating21Plus = tablerOutlineIcon(
            name = "Rating21Plus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M13 15v-6")
            addPathData("M15.5 12h3")
            addPathData("M17 10.5v3")
            addPathData("M7 10.5C7 9.672 7.672 9 8.5 9 9.328 9 10 9.672 10 10.5c0 .443-.313 .989-.612 1.393L7 15h3")
        }
        return _rating21Plus!!
    }

private var _rating21Plus: ImageVector? = null
