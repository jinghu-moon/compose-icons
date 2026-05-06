package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SphereOff: ImageVector
    get() {
        if (_sphereOff != null) return _sphereOff!!
        _sphereOff = tablerOutlineIcon(
            name = "SphereOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 1.657 4.03 3 9 3 .987 0 1.936-.053 2.825-.15M18.182 14.18C19.917 13.633 21 12.86 21 12")
            addPathData("M20.051 16.027C21.788 12.56 21.109 8.371 18.366 5.63 15.623 2.889 11.434 2.213 7.968 3.952M5.628 5.644C2.117 9.162 2.122 14.861 5.64 18.372c3.518 3.511 9.217 3.506 12.728-.012")
            addPathData("M3 3 21 21")
        }
        return _sphereOff!!
    }

private var _sphereOff: ImageVector? = null
