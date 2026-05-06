package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowLeftTail: ImageVector
    get() {
        if (_arrowLeftTail != null) return _arrowLeftTail!!
        _arrowLeftTail = tablerOutlineIcon(
            name = "ArrowLeftTail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 12h-15")
            addPathData("M6 9 3 12l3 3")
            addPathData("M21 9l-3 3 3 3")
        }
        return _arrowLeftTail!!
    }

private var _arrowLeftTail: ImageVector? = null
