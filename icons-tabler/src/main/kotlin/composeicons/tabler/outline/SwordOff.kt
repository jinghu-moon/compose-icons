package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SwordOff: ImageVector
    get() {
        if (_swordOff != null) return _swordOff!!
        _swordOff = tablerOutlineIcon(
            name = "SwordOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.938 7.937 15 4h5v5l-3.928 3.055M13.813 13.812 11 16 7 20 4 17 8 13l2.19-2.815")
            addPathData("M6.5 11.5l6 6")
            addPathData("M3 3 21 21")
        }
        return _swordOff!!
    }

private var _swordOff: ImageVector? = null
