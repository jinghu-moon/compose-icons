package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDownFromArc: ImageVector
    get() {
        if (_arrowDownFromArc != null) return _arrowDownFromArc!!
        _arrowDownFromArc = tablerOutlineIcon(
            name = "ArrowDownFromArc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 15v-12")
            addPathData("M16 7 12 3 8 7")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9")
        }
        return _arrowDownFromArc!!
    }

private var _arrowDownFromArc: ImageVector? = null
