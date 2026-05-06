package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) return _planeDeparture!!
        _planeDeparture = tablerOutlineIcon(
            name = "PlaneDeparture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.639 10.258 19.469 8.964c.695-.201 1.445-.01 1.96 .498 .515 .508 .715 1.256 .523 1.953-.192 .698-.746 1.238-1.448 1.411L6.015 16.71 1.565 11.69l2.897-.776 2.45 1.414 2.897-.776L6.066 5.308 8.964 4.531l5.675 5.727")
            addPathData("M3 21h18")
        }
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
