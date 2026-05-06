package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FishHookOff: ImageVector
    get() {
        if (_fishHookOff != null) return _fishHookOff!!
        _fishHookOff = tablerOutlineIcon(
            name = "FishHookOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 9v3M15.915 15.924c-.474 2.54-2.806 4.3-5.379 4.06C7.963 19.745 5.997 17.584 6 15v-4l3 3")
            addPathData("M14 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C18 5.895 17.105 5 16 5c-1.105 0-2 .895-2 2")
            addPathData("M16 5v-2")
            addPathData("M3 3 21 21")
        }
        return _fishHookOff!!
    }

private var _fishHookOff: ImageVector? = null
