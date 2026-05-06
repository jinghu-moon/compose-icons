package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadHorizontalCode: ImageVector
    get() {
        if (_deviceIpadHorizontalCode != null) return _deviceIpadHorizontalCode!!
        _deviceIpadHorizontalCode = tablerOutlineIcon(
            name = "DeviceIpadHorizontalCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 20h-6C3.895 20 3 19.105 3 18v-12C3 4.895 3.895 4 5 4h14c1.105 0 2 .895 2 2v7")
            addPathData("M9 17h2.5")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _deviceIpadHorizontalCode!!
    }

private var _deviceIpadHorizontalCode: ImageVector? = null
