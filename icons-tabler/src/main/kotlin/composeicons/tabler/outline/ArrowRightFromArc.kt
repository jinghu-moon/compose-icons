package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRightFromArc: ImageVector
    get() {
        if (_arrowRightFromArc != null) return _arrowRightFromArc!!
        _arrowRightFromArc = tablerOutlineIcon(
            name = "ArrowRightFromArc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 12h-12")
            addPathData("M7 8 3 12l4 4")
            addPathData("M12 21c4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3")
        }
        return _arrowRightFromArc!!
    }

private var _arrowRightFromArc: ImageVector? = null
