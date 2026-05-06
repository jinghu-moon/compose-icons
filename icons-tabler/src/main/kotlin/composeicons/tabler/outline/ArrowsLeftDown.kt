package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsLeftDown: ImageVector
    get() {
        if (_arrowsLeftDown != null) return _arrowsLeftDown!!
        _arrowsLeftDown = tablerOutlineIcon(
            name = "ArrowsLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3 3 7l4 4")
            addPathData("M3 7h11c1.657 0 3 1.343 3 3v11")
            addPathData("M13 17l4 4 4-4")
        }
        return _arrowsLeftDown!!
    }

private var _arrowsLeftDown: ImageVector? = null
