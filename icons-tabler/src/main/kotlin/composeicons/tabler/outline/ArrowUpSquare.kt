package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowUpSquare: ImageVector
    get() {
        if (_arrowUpSquare != null) return _arrowUpSquare!!
        _arrowUpSquare = tablerOutlineIcon(
            name = "ArrowUpSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17v-14")
            addPathData("M15 6 12 3 9 6")
            addPathData("M10 21v-4h4v4h-4")
        }
        return _arrowUpSquare!!
    }

private var _arrowUpSquare: ImageVector? = null
