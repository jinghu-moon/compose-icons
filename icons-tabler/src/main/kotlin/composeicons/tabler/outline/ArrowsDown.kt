package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsDown: ImageVector
    get() {
        if (_arrowsDown != null) return _arrowsDown!!
        _arrowsDown = tablerOutlineIcon(
            name = "ArrowsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 21v-18")
            addPathData("M20 18l-3 3L14 18")
            addPathData("M4 18l3 3 3-3")
            addPathData("M17 21v-18")
        }
        return _arrowsDown!!
    }

private var _arrowsDown: ImageVector? = null
