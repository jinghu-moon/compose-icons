package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wand: ImageVector
    get() {
        if (_wand != null) return _wand!!
        _wand = tablerOutlineIcon(
            name = "Wand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 21 21 6 18 3 3 18l3 3")
            addPathData("M15 6l3 3")
            addPathData("M9 3c0 1.105 .895 2 2 2C9.895 5 9 5.895 9 7 9 5.895 8.105 5 7 5 8.105 5 9 4.105 9 3")
            addPathData("M19 13c0 1.105 .895 2 2 2-1.105 0-2 .895-2 2 0-1.105-.895-2-2-2 1.105 0 2-.895 2-2")
        }
        return _wand!!
    }

private var _wand: ImageVector? = null
