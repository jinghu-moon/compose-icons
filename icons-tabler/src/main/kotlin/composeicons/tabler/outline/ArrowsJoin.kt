package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsJoin: ImageVector
    get() {
        if (_arrowsJoin != null) return _arrowsJoin!!
        _arrowsJoin = tablerOutlineIcon(
            name = "ArrowsJoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7h5l3.5 5h9.5")
            addPathData("M3 17h5l3.495-5")
            addPathData("M18 15l3-3L18 9")
        }
        return _arrowsJoin!!
    }

private var _arrowsJoin: ImageVector? = null
