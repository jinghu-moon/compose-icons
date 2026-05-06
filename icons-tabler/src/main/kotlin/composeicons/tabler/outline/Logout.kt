package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Logout: ImageVector
    get() {
        if (_logout != null) return _logout!!
        _logout = tablerOutlineIcon(
            name = "Logout",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8v-2C14 4.895 13.105 4 12 4h-7C3.895 4 3 4.895 3 6v12c0 1.105 .895 2 2 2h7c1.105 0 2-.895 2-2v-2")
            addPathData("M9 12h12L18 9")
            addPathData("M18 15l3-3")
        }
        return _logout!!
    }

private var _logout: ImageVector? = null
