package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TentOff: ImageVector
    get() {
        if (_tentOff != null) return _tentOff!!
        _tentOff = tablerOutlineIcon(
            name = "TentOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 14l4 6h5M17.137 13.132 12 4 10.56 6.559 9.12 9.122 3 20h6l4-6")
            addPathData("M3 3 21 21")
        }
        return _tentOff!!
    }

private var _tentOff: ImageVector? = null
