package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bike: ImageVector
    get() {
        if (_bike != null) return _bike!!
        _bike = tablerOutlineIcon(
            name = "Bike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C8 16.343 6.657 15 5 15 3.343 15 2 16.343 2 18")
            addPathData("M16 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M12 19v-4L9 12 14 8l2 3h3")
            addPathData("M16 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C18 4.448 17.552 4 17 4c-.552 0-1 .448-1 1")
        }
        return _bike!!
    }

private var _bike: ImageVector? = null
