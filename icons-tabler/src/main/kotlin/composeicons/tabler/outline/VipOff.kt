package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VipOff: ImageVector
    get() {
        if (_vipOff != null) return _vipOff!!
        _vipOff = tablerOutlineIcon(
            name = "VipOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5h2M9 5h12")
            addPathData("M3 19h16")
            addPathData("M4 9l2 6h1L9 9")
            addPathData("M12 12v3")
            addPathData("M16 12v-3h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-1")
            addPathData("M3 3 21 21")
        }
        return _vipOff!!
    }

private var _vipOff: ImageVector? = null
