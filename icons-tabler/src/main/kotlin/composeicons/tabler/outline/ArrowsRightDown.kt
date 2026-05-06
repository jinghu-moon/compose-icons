package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsRightDown: ImageVector
    get() {
        if (_arrowsRightDown != null) return _arrowsRightDown!!
        _arrowsRightDown = tablerOutlineIcon(
            name = "ArrowsRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17l4 4 4-4")
            addPathData("M7 21v-11C7 8.343 8.343 7 10 7h11")
            addPathData("M17 11 21 7 17 3")
        }
        return _arrowsRightDown!!
    }

private var _arrowsRightDown: ImageVector? = null
