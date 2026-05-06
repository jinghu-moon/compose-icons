package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDownToArc: ImageVector
    get() {
        if (_arrowDownToArc != null) return _arrowDownToArc!!
        _arrowDownToArc = tablerOutlineIcon(
            name = "ArrowDownToArc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v12")
            addPathData("M16 11l-4 4L8 11")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9")
        }
        return _arrowDownToArc!!
    }

private var _arrowDownToArc: ImageVector? = null
