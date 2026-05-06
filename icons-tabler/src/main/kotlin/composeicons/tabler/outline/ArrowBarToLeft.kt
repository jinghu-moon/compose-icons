package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBarToLeft: ImageVector
    get() {
        if (_arrowBarToLeft != null) return _arrowBarToLeft!!
        _arrowBarToLeft = tablerOutlineIcon(
            name = "ArrowBarToLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12h10")
            addPathData("M10 12l4 4")
            addPathData("M10 12 14 8")
            addPathData("M4 4v16")
        }
        return _arrowBarToLeft!!
    }

private var _arrowBarToLeft: ImageVector? = null
