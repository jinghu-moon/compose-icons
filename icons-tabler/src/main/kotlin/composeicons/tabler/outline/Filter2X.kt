package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2X: ImageVector
    get() {
        if (_filter2X != null) return _filter2X!!
        _filter2X = tablerOutlineIcon(
            name = "Filter2X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h12")
            addPathData("M9 18h4")
            addPathData("M22 22 17 17 17 22l5-5")
        }
        return _filter2X!!
    }

private var _filter2X: ImageVector? = null
