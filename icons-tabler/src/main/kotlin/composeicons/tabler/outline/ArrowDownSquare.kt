package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDownSquare: ImageVector
    get() {
        if (_arrowDownSquare != null) return _arrowDownSquare!!
        _arrowDownSquare = tablerOutlineIcon(
            name = "ArrowDownSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7v14")
            addPathData("M9 18l3 3 3-3")
            addPathData("M14 3v4h-4v-4h4")
        }
        return _arrowDownSquare!!
    }

private var _arrowDownSquare: ImageVector? = null
