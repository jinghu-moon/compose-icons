package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Pause: ImageVector
    get() {
        if (_filter2Pause != null) return _filter2Pause!!
        _filter2Pause = tablerOutlineIcon(
            name = "Filter2Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h12")
            addPathData("M9 18h4")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _filter2Pause!!
    }

private var _filter2Pause: ImageVector? = null
