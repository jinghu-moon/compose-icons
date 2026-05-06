package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleChevronsRight: ImageVector
    get() {
        if (_circleChevronsRight != null) return _circleChevronsRight!!
        _circleChevronsRight = tablerOutlineIcon(
            name = "CircleChevronsRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 9l3 3L9 15")
            addPathData("M13 9l3 3-3 3")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _circleChevronsRight!!
    }

private var _circleChevronsRight: ImageVector? = null
