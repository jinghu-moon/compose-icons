package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Share: ImageVector
    get() {
        if (_filter2Share != null) return _filter2Share!!
        _filter2Share = tablerOutlineIcon(
            name = "Filter2Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h12")
            addPathData("M9 18h3.5")
            addPathData("M16 22l5-5")
            addPathData("M21 17v4.5")
            addPathData("M21 17h-4.5")
        }
        return _filter2Share!!
    }

private var _filter2Share: ImageVector? = null
