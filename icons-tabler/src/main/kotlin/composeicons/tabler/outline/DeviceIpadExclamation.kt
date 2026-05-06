package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadExclamation: ImageVector
    get() {
        if (_deviceIpadExclamation != null) return _deviceIpadExclamation!!
        _deviceIpadExclamation = tablerOutlineIcon(
            name = "DeviceIpadExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 21h-9C4.895 21 4 20.105 4 19v-14C4 3.895 4.895 3 6 3h12c1.105 0 2 .895 2 2v7")
            addPathData("M9 18h6")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _deviceIpadExclamation!!
    }

private var _deviceIpadExclamation: ImageVector? = null
