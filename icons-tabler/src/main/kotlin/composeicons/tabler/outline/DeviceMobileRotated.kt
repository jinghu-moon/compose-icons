package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceMobileRotated: ImageVector
    get() {
        if (_deviceMobileRotated != null) return _deviceMobileRotated!!
        _deviceMobileRotated = tablerOutlineIcon(
            name = "DeviceMobileRotated",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8C3 6.895 3.895 6 5 6h14c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-14C3.895 18 3 17.105 3 16v-8")
            addPathData("M20 11v2")
            addPathData("M7 12h-.01")
        }
        return _deviceMobileRotated!!
    }

private var _deviceMobileRotated: ImageVector? = null
