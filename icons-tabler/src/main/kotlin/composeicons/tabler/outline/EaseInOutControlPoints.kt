package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EaseInOutControlPoints: ImageVector
    get() {
        if (_easeInOutControlPoints != null) return _easeInOutControlPoints!!
        _easeInOutControlPoints = tablerOutlineIcon(
            name = "EaseInOutControlPoints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 20c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M17 20h-2")
            addPathData("M7 4C7 5.105 6.105 6 5 6 3.895 6 3 5.105 3 4 3 2.895 3.895 2 5 2c1.105 0 2 .895 2 2")
            addPathData("M7 4h2")
            addPathData("M14 4h-2")
            addPathData("M12 20h-2")
            addPathData("M3 20C11 20 13 4 21 4")
        }
        return _easeInOutControlPoints!!
    }

private var _easeInOutControlPoints: ImageVector? = null
