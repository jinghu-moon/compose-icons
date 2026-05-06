package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowUpFromArc: ImageVector
    get() {
        if (_arrowUpFromArc != null) return _arrowUpFromArc!!
        _arrowUpFromArc = tablerOutlineIcon(
            name = "ArrowUpFromArc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 9v12")
            addPathData("M8 17l4 4 4-4")
            addPathData("M21 12C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _arrowUpFromArc!!
    }

private var _arrowUpFromArc: ImageVector? = null
