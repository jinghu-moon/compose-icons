package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoxOff: ImageVector
    get() {
        if (_boxOff != null) return _boxOff!!
        _boxOff = tablerOutlineIcon(
            name = "BoxOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.765 17.757 12 21 4 16.5v-9L6.236 6.242M8.806 4.797 12 3l8 4.5v8.5")
            addPathData("M14.561 10.559 20 7.5")
            addPathData("M12 12v9")
            addPathData("M12 12 4 7.5")
            addPathData("M3 3 21 21")
        }
        return _boxOff!!
    }

private var _boxOff: ImageVector? = null
