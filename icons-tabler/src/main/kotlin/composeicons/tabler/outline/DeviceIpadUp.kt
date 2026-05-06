package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadUp: ImageVector
    get() {
        if (_deviceIpadUp != null) return _deviceIpadUp!!
        _deviceIpadUp = tablerOutlineIcon(
            name = "DeviceIpadUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 18h3")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
            addPathData("M13.5 21h-6.5C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h12c1.105 0 2 .895 2 2v7")
        }
        return _deviceIpadUp!!
    }

private var _deviceIpadUp: ImageVector? = null
