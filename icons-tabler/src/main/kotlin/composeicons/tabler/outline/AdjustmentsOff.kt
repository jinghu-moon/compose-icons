package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdjustmentsOff: ImageVector
    get() {
        if (_adjustmentsOff != null) return _adjustmentsOff!!
        _adjustmentsOff = tablerOutlineIcon(
            name = "AdjustmentsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 8.895 7.105 8 6 8 4.895 8 4 8.895 4 10")
            addPathData("M6 6v2")
            addPathData("M6 12v8")
            addPathData("M10 16c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M12 4v4M12 12v2")
            addPathData("M12 18v2")
            addPathData("M16 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C20 5.895 19.105 5 18 5c-1.105 0-2 .895-2 2")
            addPathData("M18 4v1")
            addPathData("M18 9v5M18 18v2")
            addPathData("M3 3 21 21")
        }
        return _adjustmentsOff!!
    }

private var _adjustmentsOff: ImageVector? = null
