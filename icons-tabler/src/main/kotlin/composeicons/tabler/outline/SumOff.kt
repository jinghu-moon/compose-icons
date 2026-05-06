package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SumOff: ImageVector
    get() {
        if (_sumOff != null) return _sumOff!!
        _sumOff = tablerOutlineIcon(
            name = "SumOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 18c0 .552-.448 1-1 1h-11l6-7M9 5h8c.552 0 1 .448 1 1v2")
            addPathData("M3 3 21 21")
        }
        return _sumOff!!
    }

private var _sumOff: ImageVector? = null
