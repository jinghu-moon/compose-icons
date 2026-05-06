package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonsOff: ImageVector
    get() {
        if (_hexagonsOff != null) return _hexagonsOff!!
        _hexagonsOff = tablerOutlineIcon(
            name = "HexagonsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 18v-5L8 11l4 2v5L8 20 4 18")
            addPathData("M8 11v-3M9.332 5.334 12 4l4 2v5")
            addPathData("M12 13l.661-.331")
            addPathData("M15.345 11.328 16 11l4 2v3M18.666 18.667 16 20 12 18")
            addPathData("M3 3 21 21")
        }
        return _hexagonsOff!!
    }

private var _hexagonsOff: ImageVector? = null
