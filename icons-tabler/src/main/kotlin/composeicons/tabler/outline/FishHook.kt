package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FishHook: ImageVector
    get() {
        if (_fishHook != null) return _fishHook!!
        _fishHook = tablerOutlineIcon(
            name = "FishHook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 9v6c0 2.761-2.239 5-5 5C8.239 20 6 17.761 6 15v-4l3 3")
            addPathData("M14 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C18 5.895 17.105 5 16 5c-1.105 0-2 .895-2 2")
            addPathData("M16 5v-2")
        }
        return _fishHook!!
    }

private var _fishHook: ImageVector? = null
