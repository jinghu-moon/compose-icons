package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadMinus: ImageVector
    get() {
        if (_deviceIpadMinus != null) return _deviceIpadMinus!!
        _deviceIpadMinus = tablerOutlineIcon(
            name = "DeviceIpadMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 21h-6.5C4.895 21 4 20.105 4 19v-14C4 3.895 4.895 3 6 3h12c1.105 0 2 .895 2 2v10")
            addPathData("M9 18h3")
            addPathData("M16 19h6")
        }
        return _deviceIpadMinus!!
    }

private var _deviceIpadMinus: ImageVector? = null
