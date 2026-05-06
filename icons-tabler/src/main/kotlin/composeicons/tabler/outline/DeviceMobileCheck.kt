package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceMobileCheck: ImageVector
    get() {
        if (_deviceMobileCheck != null) return _deviceMobileCheck!!
        _deviceMobileCheck = tablerOutlineIcon(
            name = "DeviceMobileCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 21h-3.5C6.895 21 6 20.105 6 19v-14C6 3.895 6.895 3 8 3h8c1.105 0 2 .895 2 2v9.5")
            addPathData("M11 4h2")
            addPathData("M12 17v.01")
            addPathData("M15 19l2 2 4-4")
        }
        return _deviceMobileCheck!!
    }

private var _deviceMobileCheck: ImageVector? = null
