package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceGamepad: ImageVector
    get() {
        if (_deviceGamepad != null) return _deviceGamepad!!
        _deviceGamepad = tablerOutlineIcon(
            name = "DeviceGamepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 8C2 6.895 2.895 6 4 6h16c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-16C2.895 18 2 17.105 2 16v-8")
            addPathData("M6 12h4M8 10v4")
            addPathData("M15 11v.01")
            addPathData("M18 13v.01")
        }
        return _deviceGamepad!!
    }

private var _deviceGamepad: ImageVector? = null
