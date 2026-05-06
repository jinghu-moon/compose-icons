package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wifi1: ImageVector
    get() {
        if (_wifi1 != null) return _wifi1!!
        _wifi1 = tablerOutlineIcon(
            name = "Wifi1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18h.01")
            addPathData("M9.172 15.172c1.562-1.562 4.094-1.562 5.656 0")
        }
        return _wifi1!!
    }

private var _wifi1: ImageVector? = null
