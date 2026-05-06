package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MicrowaveOff: ImageVector
    get() {
        if (_microwaveOff != null) return _microwaveOff!!
        _microwaveOff = tablerOutlineIcon(
            name = "MicrowaveOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 18h-14C3.448 18 3 17.552 3 17v-10C3 6.448 3.448 6 4 6h2M10 6h10c.552 0 1 .448 1 1v10")
            addPathData("M15 6v5M15 15v3")
            addPathData("M18 12h.01")
            addPathData("M18 9h.01")
            addPathData("M6.5 10.5c1-.667 1.5-.667 2.5 0 .636 .265 1.272 .665 1.907 .428")
            addPathData("M6.5 13.5c1-.667 1.5-.667 2.5 0 .833 .347 1.667 .926 2.5 0")
            addPathData("M3 3 21 21")
        }
        return _microwaveOff!!
    }

private var _microwaveOff: ImageVector? = null
