package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rating12Plus: ImageVector
    get() {
        if (_rating12Plus != null) return _rating12Plus!!
        _rating12Plus = tablerOutlineIcon(
            name = "Rating12Plus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M7 15v-6")
            addPathData("M15.5 12h3")
            addPathData("M17 10.5v3")
            addPathData("M10 10.5C10 9.672 10.672 9 11.5 9 12.328 9 13 9.672 13 10.5c0 .443-.313 .989-.612 1.393L10 15h3")
        }
        return _rating12Plus!!
    }

private var _rating12Plus: ImageVector? = null
