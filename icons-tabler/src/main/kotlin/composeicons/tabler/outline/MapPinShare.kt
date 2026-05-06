package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinShare: ImageVector
    get() {
        if (_mapPinShare != null) return _mapPinShare!!
        _mapPinShare = tablerOutlineIcon(
            name = "MapPinShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M12.02 21.485c-.537 .006-1.053-.205-1.433-.585L6.343 16.657C3.605 13.917 3.222 9.609 5.436 6.431 7.649 3.252 11.822 2.115 15.341 3.732c3.52 1.617 5.375 5.524 4.405 9.274")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _mapPinShare!!
    }

private var _mapPinShare: ImageVector? = null
