package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FilterPause: ImageVector
    get() {
        if (_filterPause != null) return _filterPause!!
        _filterPause = tablerOutlineIcon(
            name = "FilterPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.97 19.677 9 21v-8.5L4.52 7.572C4.185 7.204 4 6.724 4 6.227v-2.227h16v2.172c-0 .53-.211 1.039-.586 1.414L15 12v1.5")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _filterPause!!
    }

private var _filterPause: ImageVector? = null
