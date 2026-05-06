package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UxCircle: ImageVector
    get() {
        if (_uxCircle != null) return _uxCircle!!
        _uxCircle = tablerOutlineIcon(
            name = "UxCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M7 10v2c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-2")
            addPathData("M14 10l3 4")
            addPathData("M14 14l3-4")
        }
        return _uxCircle!!
    }

private var _uxCircle: ImageVector? = null
