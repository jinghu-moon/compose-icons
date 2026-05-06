package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EditOff: ImageVector
    get() {
        if (_editOff != null) return _editOff!!
        _editOff = tablerOutlineIcon(
            name = "EditOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7h-1C4.895 7 4 7.895 4 9v9c0 1.105 .895 2 2 2h9c1.105 0 2-.895 2-2v-1")
            addPathData("M10.507 10.498 9 12v3h3l1.493-1.498M15.493 11.492 20.383 6.585c.82-.82 .82-2.15 0-2.97-.82-.82-2.15-.82-2.97 0L12.5 8.511")
            addPathData("M16 5l3 3")
            addPathData("M3 3 21 21")
        }
        return _editOff!!
    }

private var _editOff: ImageVector? = null
