package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Buildings: ImageVector
    get() {
        if (_buildings != null) return _buildings!!
        _buildings = tablerOutlineIcon(
            name = "Buildings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 21v-15C4 5 5 4 6 4h5c1 0 2 1 2 2v15")
            addPathData("M16 8h2c1 0 2 1 2 2v11")
            addPathData("M3 21h18")
            addPathData("M10 12v.01")
            addPathData("M10 16v.01")
            addPathData("M10 8v.01")
            addPathData("M7 12v.01")
            addPathData("M7 16v.01")
            addPathData("M7 8v.01")
            addPathData("M17 12v.01")
            addPathData("M17 16v.01")
        }
        return _buildings!!
    }

private var _buildings: ImageVector? = null
