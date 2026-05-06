package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowUpToArc: ImageVector
    get() {
        if (_arrowUpToArc != null) return _arrowUpToArc!!
        _arrowUpToArc = tablerOutlineIcon(
            name = "ArrowUpToArc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21v-12")
            addPathData("M8 13 12 9l4 4")
            addPathData("M21 12C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _arrowUpToArc!!
    }

private var _arrowUpToArc: ImageVector? = null
