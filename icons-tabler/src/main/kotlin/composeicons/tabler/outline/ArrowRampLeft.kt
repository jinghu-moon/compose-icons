package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRampLeft: ImageVector
    get() {
        if (_arrowRampLeft != null) return _arrowRampLeft!!
        _arrowRampLeft = tablerOutlineIcon(
            name = "ArrowRampLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 3v8.707")
            addPathData("M13 7 17 3l4 4")
            addPathData("M7 14 3 10 7 6")
            addPathData("M17 21C17 14.925 12.075 10 6 10h-3")
        }
        return _arrowRampLeft!!
    }

private var _arrowRampLeft: ImageVector? = null
