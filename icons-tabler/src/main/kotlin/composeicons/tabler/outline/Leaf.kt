package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = tablerOutlineIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21c.5-4.5 2.5-8 7-10")
            addPathData("M9 18C15.218 18 19.5 14.712 20 6v-2h-4.014C6.986 4 4 8 3.986 13c0 1 0 3 2 5h3 .014")
        }
        return _leaf!!
    }

private var _leaf: ImageVector? = null
