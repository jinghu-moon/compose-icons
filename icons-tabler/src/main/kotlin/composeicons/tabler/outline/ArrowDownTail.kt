package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDownTail: ImageVector
    get() {
        if (_arrowDownTail != null) return _arrowDownTail!!
        _arrowDownTail = tablerOutlineIcon(
            name = "ArrowDownTail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6v15")
            addPathData("M9 18l3 3 3-3")
            addPathData("M9 3l3 3L15 3")
        }
        return _arrowDownTail!!
    }

private var _arrowDownTail: ImageVector? = null
