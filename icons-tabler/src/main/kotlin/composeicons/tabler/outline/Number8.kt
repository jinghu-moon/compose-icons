package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number8: ImageVector
    get() {
        if (_number8 != null) return _number8!!
        _number8 = tablerOutlineIcon(
            name = "Number8",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C16 5.791 14.209 4 12 4 9.791 4 8 5.791 8 8")
            addPathData("M8 16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4C9.791 12 8 13.791 8 16")
        }
        return _number8!!
    }

private var _number8: ImageVector? = null
