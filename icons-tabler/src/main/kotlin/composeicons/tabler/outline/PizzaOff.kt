package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PizzaOff: ImageVector
    get() {
        if (_pizzaOff != null) return _pizzaOff!!
        _pizzaOff = tablerOutlineIcon(
            name = "PizzaOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.313 6.277 12 3l5.34 10.376M19.817 19.839C17.358 20.938 14.694 21.504 12 21.5c-3.04 0-5.952-.714-8.5-1.983L8.934 8.958")
            addPathData("M5.38 15.866c2.11 1.077 4.446 1.637 6.815 1.634 1.56 0 3.105-.24 4.582-.713")
            addPathData("M11 14v-.01")
            addPathData("M3 3 21 21")
        }
        return _pizzaOff!!
    }

private var _pizzaOff: ImageVector? = null
