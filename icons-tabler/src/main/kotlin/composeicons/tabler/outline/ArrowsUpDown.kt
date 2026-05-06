package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsUpDown: ImageVector
    get() {
        if (_arrowsUpDown != null) return _arrowsUpDown!!
        _arrowsUpDown = tablerOutlineIcon(
            name = "ArrowsUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3v18")
            addPathData("M10 6 7 3 4 6")
            addPathData("M20 18l-3 3L14 18")
            addPathData("M17 21v-18")
        }
        return _arrowsUpDown!!
    }

private var _arrowsUpDown: ImageVector? = null
