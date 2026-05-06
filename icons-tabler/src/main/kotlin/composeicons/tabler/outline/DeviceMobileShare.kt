package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceMobileShare: ImageVector
    get() {
        if (_deviceMobileShare != null) return _deviceMobileShare!!
        _deviceMobileShare = tablerOutlineIcon(
            name = "DeviceMobileShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21h-4C6.895 21 6 20.105 6 19v-14C6 3.895 6.895 3 8 3h8c1.105 0 2 .895 2 2v8")
            addPathData("M11 4h2")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
            addPathData("M12 17v.01")
        }
        return _deviceMobileShare!!
    }

private var _deviceMobileShare: ImageVector? = null
