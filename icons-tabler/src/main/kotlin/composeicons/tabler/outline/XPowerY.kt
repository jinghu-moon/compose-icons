package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.XPowerY: ImageVector
    get() {
        if (_xPowerY != null) return _xPowerY!!
        _xPowerY = tablerOutlineIcon(
            name = "XPowerY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 3l3 5.063")
            addPathData("M5 12l6 6")
            addPathData("M5 18l6-6")
            addPathData("M21 3l-4.8 9")
        }
        return _xPowerY!!
    }

private var _xPowerY: ImageVector? = null
