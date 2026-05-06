package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DevicesPc: ImageVector
    get() {
        if (_devicesPc != null) return _devicesPc!!
        _devicesPc = tablerOutlineIcon(
            name = "DevicesPc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5h6v14h-6v-14")
            addPathData("M12 9h10v7h-10v-7")
            addPathData("M14 19h6")
            addPathData("M17 16v3")
            addPathData("M6 13v.01")
            addPathData("M6 16v.01")
        }
        return _devicesPc!!
    }

private var _devicesPc: ImageVector? = null
