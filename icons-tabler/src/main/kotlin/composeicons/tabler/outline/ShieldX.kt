package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldX: ImageVector
    get() {
        if (_shieldX != null) return _shieldX!!
        _shieldX = tablerOutlineIcon(
            name = "ShieldX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.252 20.601c-.408 .155-.826 .288-1.252 .399C8.855 20.184 6.175 18.128 4.573 15.301 2.971 12.473 2.584 9.118 3.5 6 6.616 6.143 9.664 5.067 12 3c2.336 2.067 5.384 3.143 8.5 3 .709 2.412 .642 4.985-.19 7.357")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _shieldX!!
    }

private var _shieldX: ImageVector? = null
