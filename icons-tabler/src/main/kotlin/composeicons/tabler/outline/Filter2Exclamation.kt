package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Exclamation: ImageVector
    get() {
        if (_filter2Exclamation != null) return _filter2Exclamation!!
        _filter2Exclamation = tablerOutlineIcon(
            name = "Filter2Exclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h12")
            addPathData("M9 18h6")
            addPathData("M19 16v3M19 22v.01")
        }
        return _filter2Exclamation!!
    }

private var _filter2Exclamation: ImageVector? = null
