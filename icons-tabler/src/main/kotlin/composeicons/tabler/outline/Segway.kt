package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Segway: ImageVector
    get() {
        if (_segway != null) return _segway!!
        _segway = tablerOutlineIcon(
            name = "Segway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 3h3q-2.25 5 .75 11")
            addPathData("M8 17c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4C9.791 13 8 14.791 8 17")
            addPathData("M12 17.01v.01")
        }
        return _segway!!
    }

private var _segway: ImageVector? = null
