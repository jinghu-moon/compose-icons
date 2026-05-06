package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBackUp: ImageVector
    get() {
        if (_arrowBackUp != null) return _arrowBackUp!!
        _arrowBackUp = tablerOutlineIcon(
            name = "ArrowBackUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 14 5 10 9 6")
            addPathData("M5 10h11c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-1")
        }
        return _arrowBackUp!!
    }

private var _arrowBackUp: ImageVector? = null
