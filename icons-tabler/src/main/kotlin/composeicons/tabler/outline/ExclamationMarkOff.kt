package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ExclamationMarkOff: ImageVector
    get() {
        if (_exclamationMarkOff != null) return _exclamationMarkOff!!
        _exclamationMarkOff = tablerOutlineIcon(
            name = "ExclamationMarkOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 19v.01")
            addPathData("M12 15v-3M12 8v-3")
            addPathData("M3 3 21 21")
        }
        return _exclamationMarkOff!!
    }

private var _exclamationMarkOff: ImageVector? = null
