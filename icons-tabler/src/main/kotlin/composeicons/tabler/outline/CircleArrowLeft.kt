package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleArrowLeft: ImageVector
    get() {
        if (_circleArrowLeft != null) return _circleArrowLeft!!
        _circleArrowLeft = tablerOutlineIcon(
            name = "CircleArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21c4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12c0 4.971 4.029 9 9 9")
            addPathData("M8 12l4 4")
            addPathData("M8 12h8")
            addPathData("M12 8 8 12")
        }
        return _circleArrowLeft!!
    }

private var _circleArrowLeft: ImageVector? = null
