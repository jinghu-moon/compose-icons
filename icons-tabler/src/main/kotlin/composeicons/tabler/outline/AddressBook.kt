package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AddressBook: ImageVector
    get() {
        if (_addressBook != null) return _addressBook!!
        _addressBook = tablerOutlineIcon(
            name = "AddressBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 6v12c0 1.105-.895 2-2 2h-10C6.895 20 6 19.105 6 18v-12C6 4.895 6.895 4 8 4h10c1.105 0 2 .895 2 2")
            addPathData("M10 16h6")
            addPathData("M11 11c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C15 9.895 14.105 9 13 9c-1.105 0-2 .895-2 2")
            addPathData("M4 8h3")
            addPathData("M4 12h3")
            addPathData("M4 16h3")
        }
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
