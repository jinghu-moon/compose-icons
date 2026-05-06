package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArmchairOff: ImageVector
    get() {
        if (_armchairOff != null) return _armchairOff!!
        _armchairOff = tablerOutlineIcon(
            name = "ArmchairOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 13c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v4M19 19h-14C3.895 19 3 18.105 3 17v-4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v2h8.036")
            addPathData("M5 11v-5c-0-.302 .045-.602 .134-.89M7.121 3.13C7.406 3.043 7.702 2.999 8 3h8c1.657 0 3 1.343 3 3v5")
            addPathData("M6 19v2")
            addPathData("M18 19v2")
            addPathData("M3 3 21 21")
        }
        return _armchairOff!!
    }

private var _armchairOff: ImageVector? = null
