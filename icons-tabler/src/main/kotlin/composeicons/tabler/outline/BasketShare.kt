package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BasketShare: ImageVector
    get() {
        if (_basketShare != null) return _basketShare!!
        _basketShare = tablerOutlineIcon(
            name = "BasketShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 10 15 4")
            addPathData("M7 10 9 4")
            addPathData("M12.5 20h-5.256C5.763 20 4.504 18.92 4.279 17.456L3.024 10.304C2.935 9.727 3.103 9.14 3.483 8.698 3.863 8.255 4.417 8 5.001 8h13.999c.584-0 1.138 .255 1.518 .698 .38 .443 .548 1.03 .459 1.606l-.478 2.723")
            addPathData("M14 14c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _basketShare!!
    }

private var _basketShare: ImageVector? = null
