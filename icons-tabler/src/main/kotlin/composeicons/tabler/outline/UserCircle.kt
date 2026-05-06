package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = tablerOutlineIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M9 10c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 8.343 13.657 7 12 7 10.343 7 9 8.343 9 10")
            addPathData("M6.168 18.849C6.676 17.157 8.234 15.999 10 16h4c1.769-.001 3.328 1.16 3.834 2.855")
        }
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
