package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinX: ImageVector
    get() {
        if (_mapPinX != null) return _mapPinX!!
        _mapPinX = tablerOutlineIcon(
            name = "MapPinX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M13.024 21.204c-.786 .468-1.79 .343-2.437-.304L6.343 16.657C3.522 13.834 3.213 9.364 5.619 6.18 8.024 2.996 12.408 2.071 15.895 4.013c3.486 1.942 5.008 6.156 3.567 9.878")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _mapPinX!!
    }

private var _mapPinX: ImageVector? = null
