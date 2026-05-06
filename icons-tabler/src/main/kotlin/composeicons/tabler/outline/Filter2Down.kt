package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Down: ImageVector
    get() {
        if (_filter2Down != null) return _filter2Down!!
        _filter2Down = tablerOutlineIcon(
            name = "Filter2Down",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h12")
            addPathData("M9 18h3")
            addPathData("M19 16v6")
            addPathData("M19 22l3-3")
            addPathData("M19 22 16 19")
        }
        return _filter2Down!!
    }

private var _filter2Down: ImageVector? = null
