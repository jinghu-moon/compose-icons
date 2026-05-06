package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CeOff: ImageVector
    get() {
        if (_ceOff != null) return _ceOff!!
        _ceOff = tablerOutlineIcon(
            name = "CeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.53 6.53C3.953 7.694 2.539 10.498 3.134 13.262 3.729 16.026 6.173 18 9 18")
            addPathData("M21 6c-2.952-0-5.465 2.146-5.927 5.061L16 12")
            addPathData("M16 12h5")
            addPathData("M3 3 21 21")
        }
        return _ceOff!!
    }

private var _ceOff: ImageVector? = null
