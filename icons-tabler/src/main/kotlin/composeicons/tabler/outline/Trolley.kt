package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Trolley: ImageVector
    get() {
        if (_trolley != null) return _trolley!!
        _trolley = tablerOutlineIcon(
            name = "Trolley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M6 16l3 2")
            addPathData("M12 17 20 5")
            addPathData("M17 10l2 1")
            addPathData("M9.592 4.695l3.306 2.104c.292 .186 .498 .48 .572 .818 .074 .338 .011 .691-.176 .982l-3.094 4.811c-.387 .602-1.188 .779-1.792 .394L5.102 11.7c-.292-.186-.498-.48-.572-.818-.074-.338-.011-.691 .176-.982L7.8 5.09c.387-.602 1.188-.779 1.792-.394")
        }
        return _trolley!!
    }

private var _trolley: ImageVector? = null
