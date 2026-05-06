package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Check: ImageVector
    get() {
        if (_filter2Check != null) return _filter2Check!!
        _filter2Check = tablerOutlineIcon(
            name = "Filter2Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h12")
            addPathData("M9 18h2")
            addPathData("M15 18l2 2 4-4")
        }
        return _filter2Check!!
    }

private var _filter2Check: ImageVector? = null
