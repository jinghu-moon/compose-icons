package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsExchange: ImageVector
    get() {
        if (_arrowsExchange != null) return _arrowsExchange!!
        _arrowsExchange = tablerOutlineIcon(
            name = "ArrowsExchange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 10h14L17 6")
            addPathData("M17 14h-14l4 4")
        }
        return _arrowsExchange!!
    }

private var _arrowsExchange: ImageVector? = null
