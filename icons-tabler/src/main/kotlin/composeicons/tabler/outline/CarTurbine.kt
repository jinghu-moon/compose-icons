package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarTurbine: ImageVector
    get() {
        if (_carTurbine != null) return _carTurbine!!
        _carTurbine = tablerOutlineIcon(
            name = "CarTurbine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 13c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C15 10.791 13.209 9 11 9 8.791 9 7 10.791 7 13")
            addPathData("M18.86 11c.088 .66 .14 1.512 .14 2 0 4.418-3.582 8-8 8C6.582 21 3 17.418 3 13 3 8.582 6.582 5 11 5h6")
            addPathData("M11 9c2.489 .108 4.489 .108 6 0")
            addPathData("M17 4c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-6")
            addPathData("M11 13 7.5 11.5")
            addPathData("M11 13l2.5 3")
            addPathData("M8.5 16 11 13")
            addPathData("M11 13l3.5-1.5")
            addPathData("M11 9v4")
        }
        return _carTurbine!!
    }

private var _carTurbine: ImageVector? = null
