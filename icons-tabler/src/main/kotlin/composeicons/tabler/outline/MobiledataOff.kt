package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MobiledataOff: ImageVector
    get() {
        if (_mobiledataOff != null) return _mobiledataOff!!
        _mobiledataOff = tablerOutlineIcon(
            name = "MobiledataOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12v-8")
            addPathData("M8 20v-8")
            addPathData("M13 7 16 4l3 3")
            addPathData("M5 17l3 3 3-3")
            addPathData("M3 3 21 21")
        }
        return _mobiledataOff!!
    }

private var _mobiledataOff: ImageVector? = null
