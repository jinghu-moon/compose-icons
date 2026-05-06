package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Multiplier2X: ImageVector
    get() {
        if (_multiplier2X != null) return _multiplier2X!!
        _multiplier2X = tablerOutlineIcon(
            name = "Multiplier2X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 16l4-4")
            addPathData("M18 16 14 12")
            addPathData("M6 10C6 8.895 6.895 8 8 8c1.105 0 2 .895 2 2 0 .591-.417 1.318-.816 1.858L6 16.001h4")
        }
        return _multiplier2X!!
    }

private var _multiplier2X: ImageVector? = null
