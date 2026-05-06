package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = tablerOutlineIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7h16")
            addPathData("M10 11v6")
            addPathData("M14 11v6")
            addPathData("M5 7 6 19c0 1.105 .895 2 2 2h8c1.105 0 2-.895 2-2L19 7")
            addPathData("M9 7v-3C9 3.448 9.448 3 10 3h4c.552 0 1 .448 1 1v3")
        }
        return _trash!!
    }

private var _trash: ImageVector? = null
