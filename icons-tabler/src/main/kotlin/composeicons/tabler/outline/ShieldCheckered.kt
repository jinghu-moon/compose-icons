package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = tablerOutlineIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3c2.336 2.067 5.384 3.143 8.5 3 .916 3.118 .529 6.473-1.073 9.301C17.825 18.128 15.145 20.184 12 21 8.855 20.184 6.175 18.128 4.573 15.301 2.971 12.473 2.584 9.118 3.5 6 6.616 6.143 9.664 5.067 12 3")
            addPathData("M12 3v18")
            addPathData("M3.5 12h17")
        }
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
