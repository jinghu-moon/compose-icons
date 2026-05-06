package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) return _deviceMobile!!
        _deviceMobile = tablerOutlineIcon(
            name = "DeviceMobile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 5C6 3.895 6.895 3 8 3h8c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-8C6.895 21 6 20.105 6 19v-14")
            addPathData("M11 4h2")
            addPathData("M12 17v.01")
        }
        return _deviceMobile!!
    }

private var _deviceMobile: ImageVector? = null
