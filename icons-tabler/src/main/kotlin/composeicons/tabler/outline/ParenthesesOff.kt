package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ParenthesesOff: ImageVector
    get() {
        if (_parenthesesOff != null) return _parenthesesOff!!
        _parenthesesOff = tablerOutlineIcon(
            name = "ParenthesesOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.743 5.745C3.055 10.273 3.562 16.012 7 20")
            addPathData("M17 4c2.72 3.153 3.652 7.473 2.474 11.467M18.254 18.261C17.887 18.876 17.468 19.458 17 20")
            addPathData("M3 3 21 21")
        }
        return _parenthesesOff!!
    }

private var _parenthesesOff: ImageVector? = null
