package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BracketsOff: ImageVector
    get() {
        if (_bracketsOff != null) return _bracketsOff!!
        _bracketsOff = tablerOutlineIcon(
            name = "BracketsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5v15h3")
            addPathData("M16 4h3v11M19 19v1h-3")
            addPathData("M3 3 21 21")
        }
        return _bracketsOff!!
    }

private var _bracketsOff: ImageVector? = null
