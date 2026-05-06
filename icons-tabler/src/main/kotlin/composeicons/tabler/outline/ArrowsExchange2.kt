package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsExchange2: ImageVector
    get() {
        if (_arrowsExchange2 != null) return _arrowsExchange2!!
        _arrowsExchange2 = tablerOutlineIcon(
            name = "ArrowsExchange2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 10h-14L7 6")
            addPathData("M7 14h14l-4 4")
        }
        return _arrowsExchange2!!
    }

private var _arrowsExchange2: ImageVector? = null
