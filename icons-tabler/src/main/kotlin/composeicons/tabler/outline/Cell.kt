package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cell: ImageVector
    get() {
        if (_cell != null) return _cell!!
        _cell = tablerOutlineIcon(
            name = "Cell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4 4 6v5l4 2 4-2v-5L8 4")
            addPathData("M12 11l4 2 4-2v-5L16 4 12 6")
            addPathData("M8 13v5l4 2 4-2v-5")
        }
        return _cell!!
    }

private var _cell: ImageVector? = null
