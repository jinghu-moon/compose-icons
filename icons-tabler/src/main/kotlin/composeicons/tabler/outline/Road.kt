package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Road: ImageVector
    get() {
        if (_road != null) return _road!!
        _road = tablerOutlineIcon(
            name = "Road",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19 8 5")
            addPathData("M16 5l4 14")
            addPathData("M12 8v-2")
            addPathData("M12 13v-2")
            addPathData("M12 18v-2")
        }
        return _road!!
    }

private var _road: ImageVector? = null
