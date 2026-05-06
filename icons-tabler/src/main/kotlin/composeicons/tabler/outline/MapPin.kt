package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = tablerOutlineIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M17.657 16.657l-4.243 4.243c-.781 .78-2.046 .78-2.827 0L6.343 16.657C3.219 13.533 3.219 8.468 6.343 5.343c3.124-3.124 8.189-3.124 11.314 0 3.124 3.124 3.124 8.189 0 11.314")
        }
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
