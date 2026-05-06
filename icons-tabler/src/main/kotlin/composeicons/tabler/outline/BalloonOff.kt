package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BalloonOff: ImageVector
    get() {
        if (_balloonOff != null) return _balloonOff!!
        _balloonOff = tablerOutlineIcon(
            name = "BalloonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8C14 6.895 13.105 6 12 6")
            addPathData("M7.762 3.753C9.479 2.04 12.059 1.529 14.299 2.458 16.539 3.388 18 5.574 18 8c0 1.847-.37 3.564-1.007 4.993M15.403 15.413C14.436 16.413 13.263 17 12 17 8.686 17 6 12.97 6 8 6 7.407 6.086 6.834 6.246 6.293")
            addPathData("M12 17v1c0 1.105-.895 2-2 2h-3c-1.105 0-2 .895-2 2")
            addPathData("M3 3 21 21")
        }
        return _balloonOff!!
    }

private var _balloonOff: ImageVector? = null
