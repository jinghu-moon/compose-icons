package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ABOff: ImageVector
    get() {
        if (_aBOff != null) return _aBOff!!
        _aBOff = tablerOutlineIcon(
            name = "ABOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16v-5.5C3 9.119 4.119 8 5.5 8 6.881 8 8 9.119 8 10.5v5.5M8 12h-5")
            addPathData("M12 12v6")
            addPathData("M12 6v2")
            addPathData("M16 8h3c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-3M19 12c.941-0 1.755 .656 1.955 1.575 .2 .92-.269 1.854-1.125 2.245M16 12v-4")
            addPathData("M3 3 21 21")
        }
        return _aBOff!!
    }

private var _aBOff: ImageVector? = null
