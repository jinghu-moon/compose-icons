package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRoundedChevronsLeft: ImageVector
    get() {
        if (_squareRoundedChevronsLeft != null) return _squareRoundedChevronsLeft!!
        _squareRoundedChevronsLeft = tablerOutlineIcon(
            name = "SquareRoundedChevronsLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 15 12 12 15 9")
            addPathData("M11 15 8 12 11 9")
            addPathData("M12 3c7.2 0 9 1.8 9 9 0 7.2-1.8 9-9 9C4.8 21 3 19.2 3 12 3 4.8 4.8 3 12 3")
        }
        return _squareRoundedChevronsLeft!!
    }

private var _squareRoundedChevronsLeft: ImageVector? = null
