package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WandOff: ImageVector
    get() {
        if (_wandOff != null) return _wandOff!!
        _wandOff = tablerOutlineIcon(
            name = "WandOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.5 10.5 3 18l3 3 7.5-7.5M15.5 11.5 21 6 18 3 12.5 8.5")
            addPathData("M15 6l3 3")
            addPathData("M8.433 4.395C8.783 4.035 9 3.543 9 3c0 1.105 .895 2 2 2-.554 0-1.055 .225-1.417 .589")
            addPathData("M18.418 14.41C18.778 14.05 19 13.55 19 13c0 1.105 .895 2 2 2-.555 0-1.056 .226-1.419 .59")
            addPathData("M3 3 21 21")
        }
        return _wandOff!!
    }

private var _wandOff: ImageVector? = null
