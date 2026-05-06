package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number6: ImageVector
    get() {
        if (_number6 != null) return _number6!!
        _number6 = tablerOutlineIcon(
            name = "Number6",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-1c0-2.209-1.791-4-4-4C9.791 11 8 12.791 8 15")
            addPathData("M16 8C16 5.791 14.209 4 12 4 9.791 4 8 5.791 8 8v8")
        }
        return _number6!!
    }

private var _number6: ImageVector? = null
