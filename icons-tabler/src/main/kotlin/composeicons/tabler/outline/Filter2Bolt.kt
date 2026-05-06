package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Bolt: ImageVector
    get() {
        if (_filter2Bolt != null) return _filter2Bolt!!
        _filter2Bolt = tablerOutlineIcon(
            name = "Filter2Bolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h12")
            addPathData("M9 18h4")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _filter2Bolt!!
    }

private var _filter2Bolt: ImageVector? = null
