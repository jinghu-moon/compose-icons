package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FilterOff: ImageVector
    get() {
        if (_filterOff != null) return _filterOff!!
        _filterOff = tablerOutlineIcon(
            name = "FilterOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h12v2.172c-0 .53-.211 1.039-.586 1.414l-3.914 3.914M15 15v4L9 21v-8.5L4.52 7.572C4.185 7.204 4 6.724 4 6.227v-2.227")
            addPathData("M3 3 21 21")
        }
        return _filterOff!!
    }

private var _filterOff: ImageVector? = null
