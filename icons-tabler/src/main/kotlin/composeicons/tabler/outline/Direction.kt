package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Direction: ImageVector
    get() {
        if (_direction != null) return _direction!!
        _direction = tablerOutlineIcon(
            name = "Direction",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 10 12 7l3 3")
            addPathData("M9 14l3 3 3-3")
        }
        return _direction!!
    }

private var _direction: ImageVector? = null
