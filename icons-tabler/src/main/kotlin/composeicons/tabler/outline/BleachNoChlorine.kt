package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BleachNoChlorine: ImageVector
    get() {
        if (_bleachNoChlorine != null) return _bleachNoChlorine!!
        _bleachNoChlorine = tablerOutlineIcon(
            name = "BleachNoChlorine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 19h14c.663-.005 1.28-.337 1.648-.888 .368-.551 .44-1.248 .192-1.862L13.74 4C13.388 3.363 12.718 2.968 11.99 2.968c-.728 0-1.398 .395-1.75 1.032L3.14 16.25c-.244 .6-.182 1.28 .166 1.826 .348 .546 .938 .89 1.584 .924")
            addPathData("M6.576 19 14.483 5.267")
            addPathData("M11.719 19.014 17.065 9.73")
        }
        return _bleachNoChlorine!!
    }

private var _bleachNoChlorine: ImageVector? = null
