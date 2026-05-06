package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FilterBolt: ImageVector
    get() {
        if (_filterBolt != null) return _filterBolt!!
        _filterBolt = tablerOutlineIcon(
            name = "FilterBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.991 19.67 9 21v-8.5L4.52 7.572C4.185 7.204 4 6.724 4 6.227v-2.227h16v2.172c-0 .53-.211 1.039-.586 1.414L15 12v3")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _filterBolt!!
    }

private var _filterBolt: ImageVector? = null
