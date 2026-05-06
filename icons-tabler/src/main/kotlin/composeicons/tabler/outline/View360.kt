package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.View360: ImageVector
    get() {
        if (_view360 != null) return _view360!!
        _view360 = tablerOutlineIcon(
            name = "View360",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M8 12c0 4.971 1.791 9 4 9 2.209 0 4-4.029 4-9C16 7.029 14.209 3 12 3 9.791 3 8 7.029 8 12")
            addPathData("M3 12c0 2.21 4.03 4 9 4 4.97 0 9-1.79 9-4C21 9.79 16.97 8 12 8 7.03 8 3 9.79 3 12")
        }
        return _view360!!
    }

private var _view360: ImageVector? = null
