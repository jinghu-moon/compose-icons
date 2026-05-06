package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Eggs: ImageVector
    get() {
        if (_eggs != null) return _eggs!!
        _eggs = tablerOutlineIcon(
            name = "Eggs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 22C10 22 8.132 19.882 8 17c0-3 2-5 5-5 4 0 8.01 2.5 8 5 0 2.5-4 5-8 5")
            addPathData("M8 18C4.97 17.804 3 15.691 3 12.62 3 8.313 5.75 3.995 8.5 4c2.614 0 5.248 3.915 5.5 8")
        }
        return _eggs!!
    }

private var _eggs: ImageVector? = null
