package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsRightLeft: ImageVector
    get() {
        if (_arrowsRightLeft != null) return _arrowsRightLeft!!
        _arrowsRightLeft = tablerOutlineIcon(
            name = "ArrowsRightLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 7h-18")
            addPathData("M18 10 21 7 18 4")
            addPathData("M6 20 3 17 6 14")
            addPathData("M3 17h18")
        }
        return _arrowsRightLeft!!
    }

private var _arrowsRightLeft: ImageVector? = null
