package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleChevronsLeft: ImageVector
    get() {
        if (_circleChevronsLeft != null) return _circleChevronsLeft!!
        _circleChevronsLeft = tablerOutlineIcon(
            name = "CircleChevronsLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 15 12 12 15 9")
            addPathData("M11 15 8 12 11 9")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _circleChevronsLeft!!
    }

private var _circleChevronsLeft: ImageVector? = null
