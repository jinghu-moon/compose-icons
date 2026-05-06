package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortZA: ImageVector
    get() {
        if (_sortZA != null) return _sortZA!!
        _sortZA = tablerOutlineIcon(
            name = "SortZA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8h4L4 16h4")
            addPathData("M16 16v-6c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v6")
            addPathData("M16 13h4")
            addPathData("M11 12h2")
        }
        return _sortZA!!
    }

private var _sortZA: ImageVector? = null
