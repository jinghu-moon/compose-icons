package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = tablerOutlineIcon(
            name = "ArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12h14")
            addPathData("M5 12l6 6")
            addPathData("M5 12 11 6")
        }
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
