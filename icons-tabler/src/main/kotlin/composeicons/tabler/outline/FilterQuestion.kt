package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FilterQuestion: ImageVector
    get() {
        if (_filterQuestion != null) return _filterQuestion!!
        _filterQuestion = tablerOutlineIcon(
            name = "FilterQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 19 9 21v-8.5L4.52 7.572C4.185 7.204 4 6.724 4 6.227v-2.227h16v2.172c-0 .53-.211 1.039-.586 1.414L15 12")
            addPathData("M19 22v.01")
            addPathData("M19 19c.923-.003 1.724-.636 1.941-1.532 .217-.897-.207-1.826-1.027-2.25-.819-.42-1.819-.219-2.414 .483")
        }
        return _filterQuestion!!
    }

private var _filterQuestion: ImageVector? = null
