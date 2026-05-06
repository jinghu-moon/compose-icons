package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IceCreamOff: ImageVector
    get() {
        if (_iceCreamOff != null) return _iceCreamOff!!
        _iceCreamOff = tablerOutlineIcon(
            name = "IceCreamOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21.5v-4.5")
            addPathData("M8 8v9h8v-1M16 12v-5C16 5.254 14.868 3.71 13.203 3.185 11.537 2.66 9.724 3.276 8.723 4.706")
            addPathData("M8 10.5 9.74 9.74 12.53 8.518 16 7")
            addPathData("M8 14.5l4.488-1.964")
            addPathData("M3 3 21 21")
        }
        return _iceCreamOff!!
    }

private var _iceCreamOff: ImageVector? = null
