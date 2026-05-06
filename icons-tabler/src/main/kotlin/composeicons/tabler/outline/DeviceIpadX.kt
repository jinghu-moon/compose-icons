package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadX: ImageVector
    get() {
        if (_deviceIpadX != null) return _deviceIpadX!!
        _deviceIpadX = tablerOutlineIcon(
            name = "DeviceIpadX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
            addPathData("M13 21h-7C4.895 21 4 20.105 4 19v-14C4 3.895 4.895 3 6 3h12c1.105 0 2 .895 2 2v9")
            addPathData("M9 18h4")
        }
        return _deviceIpadX!!
    }

private var _deviceIpadX: ImageVector? = null
