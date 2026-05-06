package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashDrycleanOff: ImageVector
    get() {
        if (_washDrycleanOff != null) return _washDrycleanOff!!
        _washDrycleanOff = tablerOutlineIcon(
            name = "WashDrycleanOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.048 16.033C21.79 12.564 21.111 8.369 18.364 5.626 15.617 2.883 11.42 2.211 7.954 3.958M5.633 5.64C2.12 9.156 2.122 14.855 5.638 18.368c3.516 3.513 9.215 3.511 12.728-.005")
            addPathData("M3 3 21 21")
        }
        return _washDrycleanOff!!
    }

private var _washDrycleanOff: ImageVector? = null
