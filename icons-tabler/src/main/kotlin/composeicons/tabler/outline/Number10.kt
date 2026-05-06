package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number10: ImageVector
    get() {
        if (_number10 != null) return _number10!!
        _number10 = tablerOutlineIcon(
            name = "Number10",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 20v-16L3 9")
            addPathData("M16 20c2.209 0 4-1.791 4-4v-8C20 5.791 18.209 4 16 4 13.791 4 12 5.791 12 8v8c0 2.209 1.791 4 4 4")
        }
        return _number10!!
    }

private var _number10: ImageVector? = null
