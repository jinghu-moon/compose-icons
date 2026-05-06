package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadShare: ImageVector
    get() {
        if (_deviceIpadShare != null) return _deviceIpadShare!!
        _deviceIpadShare = tablerOutlineIcon(
            name = "DeviceIpadShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21h-6C4.895 21 4 20.105 4 19v-14C4 3.895 4.895 3 6 3h12c1.105 0 2 .895 2 2v8")
            addPathData("M9 18h3.5")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _deviceIpadShare!!
    }

private var _deviceIpadShare: ImageVector? = null
