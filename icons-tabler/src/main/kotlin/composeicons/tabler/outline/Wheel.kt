package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wheel: ImageVector
    get() {
        if (_wheel != null) return _wheel!!
        _wheel = tablerOutlineIcon(
            name = "Wheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
            addPathData("M3 12h6")
            addPathData("M15 12h6")
            addPathData("M13.6 9.4 17 4.6")
            addPathData("M10.4 14.6 7 19.4")
            addPathData("M7 4.6l3.4 4.8")
            addPathData("M13.6 14.6 17 19.4")
        }
        return _wheel!!
    }

private var _wheel: ImageVector? = null
