package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RecordMailOff: ImageVector
    get() {
        if (_recordMailOff != null) return _recordMailOff!!
        _recordMailOff = tablerOutlineIcon(
            name = "RecordMailOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C10 10.343 8.657 9 7 9 5.343 9 4 10.343 4 12")
            addPathData("M18.569 14.557c1.055-.648 1.603-1.878 1.38-3.095C19.726 10.244 18.779 9.288 17.563 9.055c-1.216-.233-2.45 .304-3.107 1.353")
            addPathData("M7 15h8")
            addPathData("M3 3 21 21")
        }
        return _recordMailOff!!
    }

private var _recordMailOff: ImageVector? = null
