package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBarLeft: ImageVector
    get() {
        if (_arrowBarLeft != null) return _arrowBarLeft!!
        _arrowBarLeft = tablerOutlineIcon(
            name = "ArrowBarLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12h10")
            addPathData("M4 12l4 4")
            addPathData("M4 12 8 8")
            addPathData("M20 4v16")
        }
        return _arrowBarLeft!!
    }

private var _arrowBarLeft: ImageVector? = null
