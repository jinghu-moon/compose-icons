package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Up: ImageVector
    get() {
        if (_filter2Up != null) return _filter2Up!!
        _filter2Up = tablerOutlineIcon(
            name = "Filter2Up",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h12")
            addPathData("M9 18h3")
            addPathData("M19 22v-6M19 16l3 3M19 16l-3 3")
        }
        return _filter2Up!!
    }

private var _filter2Up: ImageVector? = null
