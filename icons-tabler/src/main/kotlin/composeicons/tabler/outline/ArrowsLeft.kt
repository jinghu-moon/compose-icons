package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsLeft: ImageVector
    get() {
        if (_arrowsLeft != null) return _arrowsLeft!!
        _arrowsLeft = tablerOutlineIcon(
            name = "ArrowsLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7h18")
            addPathData("M6 20 3 17 6 14")
            addPathData("M6 4 3 7l3 3")
            addPathData("M3 17h18")
        }
        return _arrowsLeft!!
    }

private var _arrowsLeft: ImageVector? = null
