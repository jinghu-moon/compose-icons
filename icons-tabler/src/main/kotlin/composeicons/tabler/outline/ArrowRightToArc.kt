package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRightToArc: ImageVector
    get() {
        if (_arrowRightToArc != null) return _arrowRightToArc!!
        _arrowRightToArc = tablerOutlineIcon(
            name = "ArrowRightToArc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h12")
            addPathData("M11 8l4 4-4 4")
            addPathData("M12 21c4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3")
        }
        return _arrowRightToArc!!
    }

private var _arrowRightToArc: ImageVector? = null
