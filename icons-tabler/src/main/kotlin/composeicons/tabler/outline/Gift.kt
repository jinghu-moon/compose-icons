package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = tablerOutlineIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 9C3 8.448 3.448 8 4 8h16c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-16C3.448 12 3 11.552 3 11v-2")
            addPathData("M12 8v13")
            addPathData("M19 12v7c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-7")
            addPathData("M7.5 8C6.119 8 5 6.881 5 5.5 5 4.119 6.119 3 7.5 3 9.474 2.966 11.26 4.949 12 8c.74-3.051 2.526-5.034 4.5-5C17.881 3 19 4.119 19 5.5 19 6.881 17.881 8 16.5 8")
        }
        return _gift!!
    }

private var _gift: ImageVector? = null
