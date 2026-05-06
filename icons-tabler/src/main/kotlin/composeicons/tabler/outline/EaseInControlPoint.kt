package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EaseInControlPoint: ImageVector
    get() {
        if (_easeInControlPoint != null) return _easeInControlPoint!!
        _easeInControlPoint = tablerOutlineIcon(
            name = "EaseInControlPoint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19C11 19 21 3 21 3")
            addPathData("M17 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M17 19h-2")
            addPathData("M12 19h-2")
        }
        return _easeInControlPoint!!
    }

private var _easeInControlPoint: ImageVector? = null
