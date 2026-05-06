package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Elevator: ImageVector
    get() {
        if (_elevator != null) return _elevator!!
        _elevator = tablerOutlineIcon(
            name = "Elevator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5C5 4.448 5.448 4 6 4h12c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-12C5.448 20 5 19.552 5 19v-14")
            addPathData("M10 10 12 8l2 2")
            addPathData("M10 14l2 2 2-2")
        }
        return _elevator!!
    }

private var _elevator: ImageVector? = null
