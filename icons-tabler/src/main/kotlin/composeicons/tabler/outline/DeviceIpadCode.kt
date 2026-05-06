package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadCode: ImageVector
    get() {
        if (_deviceIpadCode != null) return _deviceIpadCode!!
        _deviceIpadCode = tablerOutlineIcon(
            name = "DeviceIpadCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 21h-5.5C4.895 21 4 20.105 4 19v-14C4 3.895 4.895 3 6 3h12c1.105 0 2 .895 2 2v8")
            addPathData("M9 18h2")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _deviceIpadCode!!
    }

private var _deviceIpadCode: ImageVector? = null
