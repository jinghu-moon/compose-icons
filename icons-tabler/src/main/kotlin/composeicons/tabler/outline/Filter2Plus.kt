package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Plus: ImageVector
    get() {
        if (_filter2Plus != null) return _filter2Plus!!
        _filter2Plus = tablerOutlineIcon(
            name = "Filter2Plus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h10")
            addPathData("M9 18h3")
            addPathData("M19 15v6")
            addPathData("M16 18h6")
        }
        return _filter2Plus!!
    }

private var _filter2Plus: ImageVector? = null
