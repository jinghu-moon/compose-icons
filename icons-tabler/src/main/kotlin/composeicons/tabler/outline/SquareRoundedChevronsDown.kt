package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRoundedChevronsDown: ImageVector
    get() {
        if (_squareRoundedChevronsDown != null) return _squareRoundedChevronsDown!!
        _squareRoundedChevronsDown = tablerOutlineIcon(
            name = "SquareRoundedChevronsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 9l-3 3L9 9")
            addPathData("M15 13l-3 3L9 13")
            addPathData("M12 3c7.2 0 9 1.8 9 9 0 7.2-1.8 9-9 9C4.8 21 3 19.2 3 12 3 4.8 4.8 3 12 3")
        }
        return _squareRoundedChevronsDown!!
    }

private var _squareRoundedChevronsDown: ImageVector? = null
