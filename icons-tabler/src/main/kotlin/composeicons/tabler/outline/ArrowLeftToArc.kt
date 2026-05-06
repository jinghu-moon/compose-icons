package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowLeftToArc: ImageVector
    get() {
        if (_arrowLeftToArc != null) return _arrowLeftToArc!!
        _arrowLeftToArc = tablerOutlineIcon(
            name = "ArrowLeftToArc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12h-12")
            addPathData("M13 16 9 12 13 8")
            addPathData("M12 3C7.029 3 3 7.029 3 12c0 4.971 4.029 9 9 9")
        }
        return _arrowLeftToArc!!
    }

private var _arrowLeftToArc: ImageVector? = null
