package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareChevronsUp: ImageVector
    get() {
        if (_squareChevronsUp != null) return _squareChevronsUp!!
        _squareChevronsUp = tablerOutlineIcon(
            name = "SquareChevronsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 16l3-3 3 3")
            addPathData("M9 11 12 8l3 3")
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
        }
        return _squareChevronsUp!!
    }

private var _squareChevronsUp: ImageVector? = null
