package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Discount: ImageVector
    get() {
        if (_filter2Discount != null) return _filter2Discount!!
        _filter2Discount = tablerOutlineIcon(
            name = "Filter2Discount",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h12")
            addPathData("M9 18h3")
            addPathData("M16 16v.01")
            addPathData("M16 21l5-5")
            addPathData("M21 21v.01")
        }
        return _filter2Discount!!
    }

private var _filter2Discount: ImageVector? = null
