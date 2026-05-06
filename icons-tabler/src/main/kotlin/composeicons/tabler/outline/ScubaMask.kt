package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScubaMask: ImageVector
    get() {
        if (_scubaMask != null) return _scubaMask!!
        _scubaMask = tablerOutlineIcon(
            name = "ScubaMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7h12c.552 0 1 .448 1 1v4.5C17 13.881 15.881 15 14.5 15h-.5c-1.105 0-2-.895-2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105-.895 2-2 2h-.5C4.119 15 3 13.881 3 12.5v-4.5C3 7.448 3.448 7 4 7")
            addPathData("M10 17c0 1.105 .895 2 2 2h3.5C18.538 19 21 16.538 21 13.5v-9.5")
        }
        return _scubaMask!!
    }

private var _scubaMask: ImageVector? = null
