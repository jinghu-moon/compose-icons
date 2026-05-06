package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowLeftSquare: ImageVector
    get() {
        if (_arrowLeftSquare != null) return _arrowLeftSquare!!
        _arrowLeftSquare = tablerOutlineIcon(
            name = "ArrowLeftSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 12h-14")
            addPathData("M6 9 3 12l3 3")
            addPathData("M21 14h-4v-4h4v4")
        }
        return _arrowLeftSquare!!
    }

private var _arrowLeftSquare: ImageVector? = null
