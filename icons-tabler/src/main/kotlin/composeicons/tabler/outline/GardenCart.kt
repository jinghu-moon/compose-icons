package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GardenCart: ImageVector
    get() {
        if (_gardenCart != null) return _gardenCart!!
        _gardenCart = tablerOutlineIcon(
            name = "GardenCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 17.5C15 18.881 16.119 20 17.5 20 18.881 20 20 18.881 20 17.5 20 16.119 18.881 15 17.5 15 16.119 15 15 16.119 15 17.5")
            addPathData("M6 8v11c0 .432 .278 .815 .689 .949 .411 .134 .861-.01 1.117-.358l3.694-5.091v.055")
            addPathData("M6 8h15l-3.5 7-7.1-.747C8.924 14.098 7.655 13.138 7.104 11.76L4.251 4.63C4.1 4.25 3.732 4 3.323 4h-1.323")
        }
        return _gardenCart!!
    }

private var _gardenCart: ImageVector? = null
