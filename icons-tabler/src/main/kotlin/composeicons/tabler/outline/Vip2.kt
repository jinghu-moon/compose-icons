package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Vip2: ImageVector
    get() {
        if (_vip2 != null) return _vip2!!
        _vip2 = tablerOutlineIcon(
            name = "Vip2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5h4")
            addPathData("M17 5h4")
            addPathData("M3 19h18")
            addPathData("M4 9l2 6h1L9 9")
            addPathData("M12 10v5")
            addPathData("M16 15v-6h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2")
            addPathData("M10 5c1.105 0 2 .895 2 2 0-1.105 .895-2 2-2C12.895 5 12 4.105 12 3c0 1.105-.895 2-2 2")
        }
        return _vip2!!
    }

private var _vip2: ImageVector? = null
