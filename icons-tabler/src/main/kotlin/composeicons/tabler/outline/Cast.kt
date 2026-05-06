package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cast: ImageVector
    get() {
        if (_cast != null) return _cast!!
        _cast = tablerOutlineIcon(
            name = "Cast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19h.01")
            addPathData("M7 19C7 16.791 5.209 15 3 15")
            addPathData("M11 19C11 14.582 7.418 11 3 11")
            addPathData("M15 19h3c1.657 0 3-1.343 3-3v-8C21 6.343 19.657 5 18 5h-12C4.739 5.012 3.62 5.811 3.2 7")
        }
        return _cast!!
    }

private var _cast: ImageVector? = null
