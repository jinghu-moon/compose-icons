package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FirewallFlame: ImageVector
    get() {
        if (_firewallFlame != null) return _firewallFlame!!
        _firewallFlame = tablerOutlineIcon(
            name = "FirewallFlame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.5 16Q18 17.5 18 15v-2c0 0 4 1.06 4 5 0 1.664-.649 3.338-2 4v-.25C20 20.793 18.947 20 18 20c-.947 0-2 .793-2 1.75v.25c-1.351-.662-2-2-2-3.5C14 17 15.5 16 15.5 16")
            addPathData("M9 3v13")
            addPathData("M3 9h18")
            addPathData("M6 21h-1C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v4")
            addPathData("M3 15h7")
            addPathData("M15 3v7")
        }
        return _firewallFlame!!
    }

private var _firewallFlame: ImageVector? = null
