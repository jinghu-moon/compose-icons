package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Fish: ImageVector
    get() {
        if (_fish != null) return _fish!!
        _fish = tablerOutlineIcon(
            name = "Fish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.69 7.44C15.598 8.708 14.998 10.326 15 12c0 1.747 .64 3.345 1.699 4.571")
            addPathData("M2 9.504c7.715 8.647 14.75 10.265 20 2.498C16.75 4.241 9.715 5.86 2 14.506")
            addPathData("M18 11v.01")
            addPathData("M11.5 10.5c-.667 1-.667 2 0 3")
        }
        return _fish!!
    }

private var _fish: ImageVector? = null
