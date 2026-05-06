package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandOff: ImageVector
    get() {
        if (_handOff != null) return _handOff!!
        _handOff = tablerOutlineIcon(
            name = "HandOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M8 13.5v-5.5M8.44 4.438c.429-.429 1.074-.557 1.635-.324 .56 .232 .926 .78 .925 1.386v1.5M11 11.008v.992M11 5.5v-2C11 2.672 11.672 2 12.5 2 13.328 2 14 2.672 14 3.5v6.5M14 5.5C14 4.672 14.672 4 15.5 4 16.328 4 17 4.672 17 5.5v6.5M17 7.5C17 6.672 17.672 6 18.5 6 19.328 6 20 6.672 20 7.5v8.5c0 3.314-2.686 6-6 6h-2C9.886 21.708 8.044 20.603 7 19L4.3 13.75c-.552-.759-.384-1.823 .375-2.375 .759-.552 1.823-.384 2.375 .375l.9 1.75")
        }
        return _handOff!!
    }

private var _handOff: ImageVector? = null
