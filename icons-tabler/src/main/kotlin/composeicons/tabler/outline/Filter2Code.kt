package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Code: ImageVector
    get() {
        if (_filter2Code != null) return _filter2Code!!
        _filter2Code = tablerOutlineIcon(
            name = "Filter2Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h12")
            addPathData("M9 18h2")
            addPathData("M17 17l-2 2 2 2")
            addPathData("M20 21l2-2L20 17")
        }
        return _filter2Code!!
    }

private var _filter2Code: ImageVector? = null
