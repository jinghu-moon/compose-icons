package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FridgeOff: ImageVector
    get() {
        if (_fridgeOff != null) return _fridgeOff!!
        _fridgeOff = tablerOutlineIcon(
            name = "FridgeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3h10c1.105 0 2 .895 2 2v10M19 19c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-14")
            addPathData("M5 10h5M14 10h5")
            addPathData("M9 13v3")
            addPathData("M3 3 21 21")
        }
        return _fridgeOff!!
    }

private var _fridgeOff: ImageVector? = null
