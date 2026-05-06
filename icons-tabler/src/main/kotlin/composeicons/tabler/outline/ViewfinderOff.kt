package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ViewfinderOff: ImageVector
    get() {
        if (_viewfinderOff != null) return _viewfinderOff!!
        _viewfinderOff = tablerOutlineIcon(
            name = "ViewfinderOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.65 5.623C3.343 7.887 2.427 11.215 3.251 14.341c.824 3.126 3.261 5.57 6.385 6.402 3.124 .833 6.454-.074 8.724-2.375M20.044 16.04C21.79 12.57 21.112 8.372 18.364 5.628 15.616 2.883 11.418 2.21 7.95 3.96")
            addPathData("M12 3v4")
            addPathData("M12 21v-3")
            addPathData("M3 12h4")
            addPathData("M21 12h-3")
            addPathData("M12 12v.01")
            addPathData("M3 3 21 21")
        }
        return _viewfinderOff!!
    }

private var _viewfinderOff: ImageVector? = null
