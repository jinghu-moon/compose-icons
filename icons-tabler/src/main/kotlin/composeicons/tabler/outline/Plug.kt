package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = tablerOutlineIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.785 6 18 14.215l-2.054 2.054c-1.458 1.516-3.62 2.126-5.655 1.595C8.256 17.333 6.667 15.744 6.136 13.709 5.605 11.674 6.215 9.512 7.731 8.054L9.785 6")
            addPathData("M4 20 7.5 16.5")
            addPathData("M15 4 11.5 7.5")
            addPathData("M20 9l-3.5 3.5")
        }
        return _plug!!
    }

private var _plug: ImageVector? = null
