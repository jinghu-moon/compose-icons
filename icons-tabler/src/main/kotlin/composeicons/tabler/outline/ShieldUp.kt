package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldUp: ImageVector
    get() {
        if (_shieldUp != null) return _shieldUp!!
        _shieldUp = tablerOutlineIcon(
            name = "ShieldUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.442 20.876c-.147 .044-.294 .085-.442 .124C8.855 20.184 6.175 18.128 4.573 15.301 2.971 12.473 2.584 9.118 3.5 6 6.616 6.143 9.664 5.067 12 3c2.336 2.067 5.384 3.143 8.5 3 .607 2.063 .648 4.251 .119 6.336")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _shieldUp!!
    }

private var _shieldUp: ImageVector? = null
