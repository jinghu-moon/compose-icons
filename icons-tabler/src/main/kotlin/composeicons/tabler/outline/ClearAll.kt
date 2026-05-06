package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClearAll: ImageVector
    get() {
        if (_clearAll != null) return _clearAll!!
        _clearAll = tablerOutlineIcon(
            name = "ClearAll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 6h12")
            addPathData("M6 12h12")
            addPathData("M4 18h12")
        }
        return _clearAll!!
    }

private var _clearAll: ImageVector? = null
