package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRust: ImageVector
    get() {
        if (_brandRust != null) return _brandRust!!
        _brandRust = tablerOutlineIcon(
            name = "BrandRust",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.139 3.463c.473-1.95 3.249-1.95 3.722 0 .144 .595 .563 1.085 1.128 1.319 .565 .234 1.208 .185 1.731-.134 1.714-1.045 3.678 .918 2.633 2.633-.318 .522-.367 1.165-.133 1.73 .234 .565 .723 .984 1.317 1.128 1.95 .473 1.95 3.249 0 3.722-.595 .144-1.085 .563-1.319 1.128-.234 .565-.185 1.208 .134 1.731 1.045 1.714-.918 3.678-2.633 2.633-.522-.318-1.165-.367-1.73-.133-.565 .234-.984 .723-1.128 1.317-.473 1.95-3.249 1.95-3.722 0C9.995 19.942 9.576 19.452 9.011 19.218c-.565-.234-1.208-.185-1.731 .134C5.566 20.397 3.602 18.434 4.647 16.719c.318-.522 .367-1.165 .133-1.73-.234-.565-.723-.984-1.317-1.128-1.95-.473-1.95-3.249 0-3.722C4.058 9.995 4.548 9.576 4.782 9.011 5.016 8.445 4.966 7.802 4.648 7.28 3.603 5.566 5.566 3.602 7.281 4.647c.522 .319 1.165 .369 1.73 .135 .565-.234 .984-.724 1.128-1.319")
            addPathData("M8 12h6c1.105 0 2-.895 2-2C16 8.895 15.105 8 14 8h-6v8-4")
            addPathData("M19 16h-2c-1.105 0-2-.895-2-2 0-1.105-.895-2-2-2h-1")
            addPathData("M9 8h-4")
            addPathData("M5 16h4")
        }
        return _brandRust!!
    }

private var _brandRust: ImageVector? = null
