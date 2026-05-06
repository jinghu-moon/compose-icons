package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Map: ImageVector
    get() {
        if (_map != null) return _map!!
        _map = tablerOutlineIcon(
            name = "Map",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7 9 4l6 3L21 4v13l-6 3L9 17 3 20v-13")
            addPathData("M9 4v13")
            addPathData("M15 7v13")
        }
        return _map!!
    }

private var _map: ImageVector? = null
