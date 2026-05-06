package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinPause: ImageVector
    get() {
        if (_mapPinPause != null) return _mapPinPause!!
        _mapPinPause = tablerOutlineIcon(
            name = "MapPinPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M13.414 20.9c-.781 .78-2.046 .78-2.827 0L6.343 16.657C3.582 13.895 3.219 9.545 5.483 6.363 7.746 3.182 11.976 2.099 15.49 3.802c3.514 1.703 5.285 5.694 4.19 9.442")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _mapPinPause!!
    }

private var _mapPinPause: ImageVector? = null
