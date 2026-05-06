package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRightTail: ImageVector
    get() {
        if (_arrowRightTail != null) return _arrowRightTail!!
        _arrowRightTail = tablerOutlineIcon(
            name = "ArrowRightTail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 15l3-3L18 9")
            addPathData("M3 15 6 12 3 9")
            addPathData("M6 12h15")
        }
        return _arrowRightTail!!
    }

private var _arrowRightTail: ImageVector? = null
