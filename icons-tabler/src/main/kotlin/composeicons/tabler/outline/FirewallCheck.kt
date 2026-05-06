package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FirewallCheck: ImageVector
    get() {
        if (_firewallCheck != null) return _firewallCheck!!
        _firewallCheck = tablerOutlineIcon(
            name = "FirewallCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 3v18")
            addPathData("M3 9h18")
            addPathData("M3 15h10")
            addPathData("M15 3v10")
            addPathData("M11 21h-6C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v8")
            addPathData("M15 19l2 2 4-4")
        }
        return _firewallCheck!!
    }

private var _firewallCheck: ImageVector? = null
