package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HorseToy: ImageVector
    get() {
        if (_horseToy != null) return _horseToy!!
        _horseToy = tablerOutlineIcon(
            name = "HorseToy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.5 17.5c5.667 4.667 11.333 4.667 17 0")
            addPathData("M19 18.5 17 10 18 8l2 1L21.5 7.5 19 3c-5.052 .218-5.99 3.133-7 6h-6C4.343 9 3 10.343 3 12")
            addPathData("M5 18.5 7 9")
            addPathData("M8 20l2-5h4l2 5")
        }
        return _horseToy!!
    }

private var _horseToy: ImageVector? = null
