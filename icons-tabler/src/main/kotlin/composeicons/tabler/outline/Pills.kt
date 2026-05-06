package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pills: ImageVector
    get() {
        if (_pills != null) return _pills!!
        _pills = tablerOutlineIcon(
            name = "Pills",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C13 5.239 10.761 3 8 3 5.239 3 3 5.239 3 8")
            addPathData("M13 17c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4")
            addPathData("M4.5 4.5l7 7")
            addPathData("M19.5 14.5l-5 5")
        }
        return _pills!!
    }

private var _pills: ImageVector? = null
