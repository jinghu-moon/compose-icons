package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LeafOff: ImageVector
    get() {
        if (_leafOff != null) return _leafOff!!
        _leafOff = tablerOutlineIcon(
            name = "LeafOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21c.475-4.27 2.3-7.64 6.331-9.683")
            addPathData("M6.618 6.623C4.744 8.248 3.993 10.5 3.986 13c0 1 0 3 2 5h3.014c2.733 0 5.092-.635 6.92-2.087M17.819 13.814C19.043 11.942 19.806 9.38 20 6v-2h-4.014C13.123 4 10.868 4.405 9.125 5.118")
            addPathData("M3 3 21 21")
        }
        return _leafOff!!
    }

private var _leafOff: ImageVector? = null
