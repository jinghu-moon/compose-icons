package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Squares: ImageVector
    get() {
        if (_squares != null) return _squares!!
        _squares = tablerOutlineIcon(
            name = "Squares",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 10C8 8.895 8.895 8 10 8h9c1.105 0 2 .895 2 2v9c0 1.105-.895 2-2 2h-9C8.895 21 8 20.105 8 19v-9")
            addPathData("M16 8v-3C16 3.895 15.105 3 14 3h-9C3.895 3 3 3.895 3 5v9c0 1.105 .895 2 2 2h3")
        }
        return _squares!!
    }

private var _squares: ImageVector? = null
