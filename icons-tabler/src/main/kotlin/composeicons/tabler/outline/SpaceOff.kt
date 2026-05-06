package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SpaceOff: ImageVector
    get() {
        if (_spaceOff != null) return _spaceOff!!
        _spaceOff = tablerOutlineIcon(
            name = "SpaceOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10v3c0 .552 .448 1 1 1h9M18 14h1c.552 0 1-.448 1-1v-3")
            addPathData("M3 3 21 21")
        }
        return _spaceOff!!
    }

private var _spaceOff: ImageVector? = null
