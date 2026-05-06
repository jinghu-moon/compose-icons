package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FilterShare: ImageVector
    get() {
        if (_filterShare != null) return _filterShare!!
        _filterShare = tablerOutlineIcon(
            name = "FilterShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.713 19.762 9 21v-8.5L4.52 7.572C4.185 7.204 4 6.724 4 6.227v-2.227h16v2.172c-0 .53-.211 1.039-.586 1.414L15 12v1")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _filterShare!!
    }

private var _filterShare: ImageVector? = null
