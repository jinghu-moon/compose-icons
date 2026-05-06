package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinOff: ImageVector
    get() {
        if (_mapPinOff != null) return _mapPinOff!!
        _mapPinOff = tablerOutlineIcon(
            name = "MapPinOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.442 9.432c-.724 1.18-.547 2.703 .43 3.685 .977 .982 2.499 1.167 3.683 .449M15 11C15 9.343 13.657 8 12 8")
            addPathData("M17.152 17.162l-3.738 3.738c-.781 .78-2.046 .78-2.827 0L6.343 16.657C3.412 13.726 3.205 9.041 5.867 5.863M8.047 4.043c3.131-1.778 7.065-1.245 9.611 1.301 2.546 2.546 3.078 6.48 1.299 9.611")
            addPathData("M3 3 21 21")
        }
        return _mapPinOff!!
    }

private var _mapPinOff: ImageVector? = null
