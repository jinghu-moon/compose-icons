package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WheelchairOff: ImageVector
    get() {
        if (_wheelchairOff != null) return _wheelchairOff!!
        _wheelchairOff = tablerOutlineIcon(
            name = "WheelchairOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C13 13.239 10.761 11 8 11 5.239 11 3 13.239 3 16")
            addPathData("M17.582 17.59c-.78 .782-.778 2.049 .004 2.829 .782 .78 2.049 .778 2.829-.005")
            addPathData("M14 14h-1.4")
            addPathData("M6 6v5")
            addPathData("M6 8h2M12 8h5")
            addPathData("M15 8v3")
            addPathData("M3 3 21 21")
        }
        return _wheelchairOff!!
    }

private var _wheelchairOff: ImageVector? = null
