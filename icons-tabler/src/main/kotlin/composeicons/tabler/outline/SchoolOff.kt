package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SchoolOff: ImageVector
    get() {
        if (_schoolOff != null) return _schoolOff!!
        _schoolOff = tablerOutlineIcon(
            name = "SchoolOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 9 12 5 9.864 5.854 7 7 2 9l10 4 .697-.279M15.575 11.57 22 9v6")
            addPathData("M6 10.6v5.4c0 1.657 2.686 3 6 3 2.334 0 4.357-.666 5.35-1.64M18 14v-3.4")
            addPathData("M3 3 21 21")
        }
        return _schoolOff!!
    }

private var _schoolOff: ImageVector? = null
