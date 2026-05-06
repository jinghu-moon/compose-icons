package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdOff: ImageVector
    get() {
        if (_adOff != null) return _adOff!!
        _adOff = tablerOutlineIcon(
            name = "AdOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5h10c1.105 0 2 .895 2 2v10M19 19h-14C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5")
            addPathData("M7 15v-4C7 9.895 7.895 9 9 9M11 11v4")
            addPathData("M7 13h4")
            addPathData("M17 9v4")
            addPathData("M16.115 12.131c.33 .149 .595 .412 .747 .74")
            addPathData("M3 3 21 21")
        }
        return _adOff!!
    }

private var _adOff: ImageVector? = null
