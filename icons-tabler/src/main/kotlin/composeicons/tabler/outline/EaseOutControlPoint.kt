package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EaseOutControlPoint: ImageVector
    get() {
        if (_easeOutControlPoint != null) return _easeOutControlPoint!!
        _easeOutControlPoint = tablerOutlineIcon(
            name = "EaseOutControlPoint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21C3 21 13 5 21 5")
            addPathData("M7 5C7 6.105 6.105 7 5 7 3.895 7 3 6.105 3 5 3 3.895 3.895 3 5 3c1.105 0 2 .895 2 2")
            addPathData("M7 5h2")
            addPathData("M14 5h-2")
        }
        return _easeOutControlPoint!!
    }

private var _easeOutControlPoint: ImageVector? = null
