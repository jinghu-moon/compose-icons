package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.View360Off: ImageVector
    get() {
        if (_view360Off != null) return _view360Off!!
        _view360Off = tablerOutlineIcon(
            name = "View360Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.335 8.388C8.108 9.579 7.996 10.788 8 12c0 4.97 1.79 9 4 9 1.622 0 3.018-2.172 3.646-5.294M16 12C16 7.03 14.21 3 12 3 10.965 3 10.021 3.885 9.311 5.337")
            addPathData("M5.65 5.623C3.343 7.887 2.427 11.215 3.251 14.341c.824 3.126 3.261 5.57 6.385 6.402 3.124 .833 6.454-.074 8.724-2.375M20.044 16.04C21.79 12.57 21.112 8.372 18.364 5.628 15.616 2.883 11.418 2.21 7.95 3.96")
            addPathData("M8.32 8.349C5.184 8.974 3 10.374 3 12c0 2.21 4.03 4 9 4 1.286 0 2.51-.12 3.616-.336M18.675 14.684C20.12 13.973 21 13.031 21 12 21 9.79 16.97 8 12 8")
            addPathData("M3 3 21 21")
        }
        return _view360Off!!
    }

private var _view360Off: ImageVector? = null
