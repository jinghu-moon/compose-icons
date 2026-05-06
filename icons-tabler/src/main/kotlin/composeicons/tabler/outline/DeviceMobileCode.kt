package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceMobileCode: ImageVector
    get() {
        if (_deviceMobileCode != null) return _deviceMobileCode!!
        _deviceMobileCode = tablerOutlineIcon(
            name = "DeviceMobileCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 21h-3.5C6.895 21 6 20.105 6 19v-14C6 3.895 6.895 3 8 3h8c1.105 0 2 .895 2 2v8")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
            addPathData("M11 4h2")
            addPathData("M12 17v.01")
        }
        return _deviceMobileCode!!
    }

private var _deviceMobileCode: ImageVector? = null
