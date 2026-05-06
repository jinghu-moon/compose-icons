package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsDoubleNwSe: ImageVector
    get() {
        if (_arrowsDoubleNwSe != null) return _arrowsDoubleNwSe!!
        _arrowsDoubleNwSe = tablerOutlineIcon(
            name = "ArrowsDoubleNwSe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 21 3 10")
            addPathData("M3 14v-4h4")
            addPathData("M17 14h4v-4")
            addPathData("M10 3 21 14")
        }
        return _arrowsDoubleNwSe!!
    }

private var _arrowsDoubleNwSe: ImageVector? = null
