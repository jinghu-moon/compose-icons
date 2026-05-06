package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareArrowLeft: ImageVector
    get() {
        if (_squareArrowLeft != null) return _squareArrowLeft!!
        _squareArrowLeft = tablerOutlineIcon(
            name = "SquareArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8 8 12l4 4")
            addPathData("M16 12h-8")
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
        }
        return _squareArrowLeft!!
    }

private var _squareArrowLeft: ImageVector? = null
