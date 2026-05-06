package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrashOff: ImageVector
    get() {
        if (_trashOff != null) return _trashOff!!
        _trashOff = tablerOutlineIcon(
            name = "TrashOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M4 7h3M11 7h9")
            addPathData("M10 11v6")
            addPathData("M14 14v3")
            addPathData("M5 7 6 19c0 1.105 .895 2 2 2h8c1.105 0 2-.895 2-2l.077-.923")
            addPathData("M18.384 14.373 19 7")
            addPathData("M9 5v-1C9 3.448 9.448 3 10 3h4c.552 0 1 .448 1 1v3")
        }
        return _trashOff!!
    }

private var _trashOff: ImageVector? = null
