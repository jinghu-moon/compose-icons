package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FilterX: ImageVector
    get() {
        if (_filterX != null) return _filterX!!
        _filterX = tablerOutlineIcon(
            name = "FilterX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.758 19.414 9 21v-8.5L4.52 7.572C4.185 7.204 4 6.724 4 6.227v-2.227h16v2.172c-0 .53-.211 1.039-.586 1.414L15 12v1.5")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _filterX!!
    }

private var _filterX: ImageVector? = null
