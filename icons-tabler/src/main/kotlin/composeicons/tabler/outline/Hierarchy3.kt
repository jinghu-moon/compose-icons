package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hierarchy3: ImageVector
    get() {
        if (_hierarchy3 != null) return _hierarchy3!!
        _hierarchy3 = tablerOutlineIcon(
            name = "Hierarchy3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2")
            addPathData("M6 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C10 10.895 9.105 10 8 10c-1.105 0-2 .895-2 2")
            addPathData("M10 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M18 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M2 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C6 17.895 5.105 17 4 17c-1.105 0-2 .895-2 2")
            addPathData("M14 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M5 17 7 14")
            addPathData("M9 10 11 7")
            addPathData("M13 7l2 3")
            addPathData("M17 14l2 3")
            addPathData("M15 14l-2 3")
            addPathData("M9 14l2 3")
        }
        return _hierarchy3!!
    }

private var _hierarchy3: ImageVector? = null
