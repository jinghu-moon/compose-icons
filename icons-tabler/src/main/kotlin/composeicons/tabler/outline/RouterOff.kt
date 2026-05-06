package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RouterOff: ImageVector
    get() {
        if (_routerOff != null) return _routerOff!!
        _routerOff = tablerOutlineIcon(
            name = "RouterOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 13h2c1.105 0 2 .895 2 2v2M20.412 20.417C20.05 20.777 19.551 21 19 21h-14C3.895 21 3 20.105 3 19v-4c0-1.105 .895-2 2-2h8")
            addPathData("M17 17v.01")
            addPathData("M13 17v.01")
            addPathData("M12.226 8.2c.836-.805 1.981-1.207 3.138-1.102 1.156 .106 2.209 .708 2.886 1.652")
            addPathData("M9.445 5.407C11.117 3.793 13.408 2.987 15.722 3.196c2.314 .21 4.423 1.416 5.778 3.304")
            addPathData("M3 3 21 21")
        }
        return _routerOff!!
    }

private var _routerOff: ImageVector? = null
