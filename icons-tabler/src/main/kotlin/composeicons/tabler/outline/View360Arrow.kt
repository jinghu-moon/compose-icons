package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.View360Arrow: ImageVector
    get() {
        if (_view360Arrow != null) return _view360Arrow!!
        _view360Arrow = tablerOutlineIcon(
            name = "View360Arrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 15.328c2.414-.718 4-1.94 4-3.328C21 9.79 16.97 8 12 8 7.03 8 3 9.79 3 12c0 2.21 4.03 4 9 4")
            addPathData("M9 13l3 3L9 19")
        }
        return _view360Arrow!!
    }

private var _view360Arrow: ImageVector? = null
