package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowLeftFromArc: ImageVector
    get() {
        if (_arrowLeftFromArc != null) return _arrowLeftFromArc!!
        _arrowLeftFromArc = tablerOutlineIcon(
            name = "ArrowLeftFromArc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12h12")
            addPathData("M17 16l4-4L17 8")
            addPathData("M12 3C7.029 3 3 7.029 3 12c0 4.971 4.029 9 9 9")
        }
        return _arrowLeftFromArc!!
    }

private var _arrowLeftFromArc: ImageVector? = null
