package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Category2: ImageVector
    get() {
        if (_category2 != null) return _category2!!
        _category2 = tablerOutlineIcon(
            name = "Category2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 4h6v6h-6v-6")
            addPathData("M4 14h6v6h-6v-6")
            addPathData("M14 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M4 7c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C10 5.343 8.657 4 7 4 5.343 4 4 5.343 4 7")
        }
        return _category2!!
    }

private var _category2: ImageVector? = null
