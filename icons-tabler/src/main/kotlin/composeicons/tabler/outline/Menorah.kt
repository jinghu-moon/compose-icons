package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Menorah: ImageVector
    get() {
        if (_menorah != null) return _menorah!!
        _menorah = tablerOutlineIcon(
            name = "Menorah",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4v16")
            addPathData("M8 4v2c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-2")
            addPathData("M4 4v2c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-2")
            addPathData("M10 20h4")
        }
        return _menorah!!
    }

private var _menorah: ImageVector? = null
