package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Logout2: ImageVector
    get() {
        if (_logout2 != null) return _logout2!!
        _logout2 = tablerOutlineIcon(
            name = "Logout2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 8v-2c0-1.105 .895-2 2-2h7c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-7c-1.105 0-2-.895-2-2v-2")
            addPathData("M15 12h-12L6 9")
            addPathData("M6 15 3 12")
        }
        return _logout2!!
    }

private var _logout2: ImageVector? = null
