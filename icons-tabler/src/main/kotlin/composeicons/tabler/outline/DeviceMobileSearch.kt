package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceMobileSearch: ImageVector
    get() {
        if (_deviceMobileSearch != null) return _deviceMobileSearch!!
        _deviceMobileSearch = tablerOutlineIcon(
            name = "DeviceMobileSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21h-4C6.895 21 6 20.105 6 19v-14C6 3.895 6.895 3 8 3h8c1.105 0 2 .895 2 2v6")
            addPathData("M15 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M20.2 20.2 22 22")
            addPathData("M11 4h2")
            addPathData("M12 17v.01")
        }
        return _deviceMobileSearch!!
    }

private var _deviceMobileSearch: ImageVector? = null
