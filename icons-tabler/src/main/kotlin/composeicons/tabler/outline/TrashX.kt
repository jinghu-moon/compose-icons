package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrashX: ImageVector
    get() {
        if (_trashX != null) return _trashX!!
        _trashX = tablerOutlineIcon(
            name = "TrashX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7h16")
            addPathData("M5 7 6 19c0 1.105 .895 2 2 2h8c1.105 0 2-.895 2-2L19 7")
            addPathData("M9 7v-3C9 3.448 9.448 3 10 3h4c.552 0 1 .448 1 1v3")
            addPathData("M10 12l4 4M14 12l-4 4")
        }
        return _trashX!!
    }

private var _trashX: ImageVector? = null
