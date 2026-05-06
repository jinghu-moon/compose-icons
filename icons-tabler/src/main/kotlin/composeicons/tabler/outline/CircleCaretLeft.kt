package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleCaretLeft: ImageVector
    get() {
        if (_circleCaretLeft != null) return _circleCaretLeft!!
        _circleCaretLeft = tablerOutlineIcon(
            name = "CircleCaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12 13 8v8L9 12")
            addPathData("M12 21C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9 0 4.971-4.029 9-9 9")
        }
        return _circleCaretLeft!!
    }

private var _circleCaretLeft: ImageVector? = null
