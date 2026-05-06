package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsDoubleSwNe: ImageVector
    get() {
        if (_arrowsDoubleSwNe != null) return _arrowsDoubleSwNe!!
        _arrowsDoubleSwNe = tablerOutlineIcon(
            name = "ArrowsDoubleSwNe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3 3 14")
            addPathData("M3 10v4h4")
            addPathData("M17 10h4v4")
            addPathData("M10 21 21 10")
        }
        return _arrowsDoubleSwNe!!
    }

private var _arrowsDoubleSwNe: ImageVector? = null
