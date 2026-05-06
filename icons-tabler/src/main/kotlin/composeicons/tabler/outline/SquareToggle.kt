package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareToggle: ImageVector
    get() {
        if (_squareToggle != null) return _squareToggle!!
        _squareToggle = tablerOutlineIcon(
            name = "SquareToggle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v20")
            addPathData("M14 20h-8C4.895 20 4 19.105 4 18v-12C4 4.895 4.895 4 6 4h8")
            addPathData("M20 6C20 4.895 19.105 4 18 4")
            addPathData("M18 20c1.105 0 2-.895 2-2")
            addPathData("M20 10v4")
        }
        return _squareToggle!!
    }

private var _squareToggle: ImageVector? = null
